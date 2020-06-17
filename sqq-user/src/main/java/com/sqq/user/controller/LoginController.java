package com.sqq.user.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by WIN10 on 2020/6/1.
 */
@RestController
@RequestMapping("/user/login")
public class LoginController {

    @PostMapping("/loginUser")
    public void newUser(){
        System.out.println("------------------------------登录用户");
    }

}

