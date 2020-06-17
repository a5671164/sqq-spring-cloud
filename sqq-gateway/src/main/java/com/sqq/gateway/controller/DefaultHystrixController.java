package com.sqq.gateway.controller;


import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DefaultHystrixController {

    @ResponseBody
    @RequestMapping("/defaultFallback")
    public Map<String,String> fallbackMethod(){
        System.out.println("你服务发生降级");
        Map<String,String> rsMap = Maps.newHashMap();
        rsMap.put("code","502");
        rsMap.put("msg","服务异常");
        return rsMap;
    }
}
