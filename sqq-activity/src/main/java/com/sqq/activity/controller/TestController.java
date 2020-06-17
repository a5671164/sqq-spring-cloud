package com.sqq.activity.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WIN10 on 2020/6/1.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/helloWorld")
    public  String helloWorld(){
        System.out.println("------------------------------" + port);
        return "hello world";
    }

    @GetMapping("/postHw")
    public  String postHw(){
        System.out.println("------------------------------" + port);
        return "post hello world";
    }
}


