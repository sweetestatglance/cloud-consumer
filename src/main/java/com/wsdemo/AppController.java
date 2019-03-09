package com.wsdemo;

import com.cnct.wsdemo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tiffany on 2019-03-04.
 */
@RestController
@RequestMapping("/wstest")
@Api("模板展示网--客户管理")
public class AppController {

    //生成服务代理对象
    ModelService fa = new ModelService();
    AppService us = fa.getAppServiceImpPort();

    /**
     * 查询模板
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
        PageVo vo = new PageVo();
        vo.setCurrentPage(currentPage);
        vo.setPageSize(pageSize);
        vo.setTid(tid);
        vo.setHid(hid);
        vo.setCid(cid);
        vo.setAid(aid);
        vo.setStatus(status);
        vo.setKeyword(keyword);



       /* // 接口地址
        String address = "http://192.168.90.40:8092/whale/services/wstest?wsdl";
        // 代理工厂
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        // 设置代理地址
        jaxWsProxyFactoryBean.setAddress(address);
        // 设置接口类型
        jaxWsProxyFactoryBean.setServiceClass(AppService.class);
        // 创建一个代理接口实现
        AppService us = (AppService) jaxWsProxyFactoryBean.create();*/

        if (newst != null) {
            if ("1".equals(newst)) { //1,最新
                vo.setNewst(newst);
            }
            if ("2".equals(newst)) { //2,最热
                vo.setLargest(newst);
            }
        }
        try {
            PageBean<ModelBean> pagedata = us.queryModels(vo);
            map.put("code", 200);
            map.put("msg", "查询成功!");
            map.put("page", pagedata);
        } catch (Exception e) {
            map.put("code", 400);
            map.put("msg", "查询失败!");
            return map;
        }
        return map;
    }

    /**
     * restful风格地址传参
     * @param model_id
     * @return
     */
    @GetMapping("/getModelById/{model_id}")
    @ApiOperation("查询模板by id")
    public Map<String,Object> getModelById(@PathVariable("model_id")Integer model_id){
        ModelBean mo = us.getmodel(model_id);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "查询成功!");
        map.put("res", mo);
        return map;
    }


}
