package com.wsdemo;

import com.alibaba.fastjson.JSON;
import com.cnct.wsdemo.ModelBean;
import com.cnct.wsdemo.PageVo;
import com.wsdemo.service.ConsumerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Tiffany on 2019-03-08.
 */
@RestController
@RequestMapping("/cloudconsumer")
public class CloudConsumerApp {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 查询模板
     *
     * @return
     */
    @PostMapping("/queryModels")
    @ApiOperation("查询模板")
    public Map<String, Object> queryModels(@RequestParam(value = "currentPage") Integer currentPage,
                                           @RequestParam(value = "pageSize") Integer pageSize,
                                           @RequestParam(value = "status", required = false) Integer status,
                                           @RequestParam(value = "tid", required = false) Integer tid,
                                           @RequestParam(value = "hid", required = false) Integer hid,
                                           @RequestParam(value = "cid", required = false) Integer cid,
                                           @RequestParam(value = "aid", required = false) Integer aid,
                                           @RequestParam(value = "keyword", required = false) String keyword,
                                           @RequestParam(value = "newst", required = false) String newst
    ) {
        Map<String, Object> map = new HashMap<>();
        //使用MultiValueMap、LinkedMultiValueMap传参，postForObject提交请求
        MultiValueMap<String, Object> vo = new LinkedMultiValueMap<String, Object>();
        vo.add("currentPage", currentPage);
        vo.add("pageSize", pageSize);
        vo.add("tid", tid);
        vo.add("hid", hid);
        vo.add("cid", cid);
        vo.add("aid", aid);
        vo.add("status", status);
        vo.add("keyword", keyword);
        vo.add("newst", newst);
        //HttpHeaders httpHeaders = new HttpHeaders();
        //httpHeaders.add("Content-Type", "application/json;charset=UTF-8");
        //HttpEntity< Map < String, Object >> rqentity = new HttpEntity<Map<String, Object>>(vo,httpHeaders);
        try {
            //ResponseEntity<String> respe = restTemplate.exchange("http://provider-service/whale/cnctsys/queryModels", HttpMethod.POST, rqentity, String.class);
            String body = restTemplate.postForObject("http://provider-service/whale/cnctsys/queryModels", vo, String.class);
            //String body = respe.getBody();
            map = JSON.parseObject(body);
            System.out.println(body);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    @Autowired
    @SuppressWarnings("all")
    private ConsumerService cs;

    /**
     * 查询模板
     *
     * @return
     */
    @PostMapping("/getModelsByfeign")
    @ApiOperation("查询模板getModelsByfeign")
    public Map<String, Object> getModelsByfeign(@RequestBody PageVo vo) {
        Map<String, Object> map = new HashMap<>();
        try {
            map = cs.queryModels(vo);
            System.out.println(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    @GetMapping("/getmodelbyfeign/{model_id}")
    @ApiOperation("查询模板getmodelbyfeign")
    public ModelBean getmodelbyfeign(@PathVariable("model_id") Integer model_id) {
        ModelBean m = cs.getmodelbyid(model_id);
        return m;
    }

    @GetMapping("/getmodel/{model_id}")
    @ApiOperation("查询模板by id")
    public ModelBean getmodel(@PathVariable("model_id") Integer model_id) {
        ModelBean m = restTemplate.getForObject("http://provider-service/whale/cnctsys/getmodel?model_id=" + model_id, ModelBean.class);
        return m;
    }
}
