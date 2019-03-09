package com.wsdemo.service;


import com.cnct.wsdemo.ModelBean;
import com.cnct.wsdemo.PageVo;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by Tiffany on 2019-03-09.
 */
@FeignClient(name = "provider-service")
public interface ConsumerService {

    @RequestMapping(method = RequestMethod.POST,value = "/whale/cnctsys/queryModel")
    @LoadBalanced
    Map queryModels(@RequestBody PageVo vo);

    @GetMapping(value = "/whale/cnctsys/getmodel")
    @LoadBalanced
    ModelBean getmodelbyid(@RequestParam("model_id") Integer model_id);
}
