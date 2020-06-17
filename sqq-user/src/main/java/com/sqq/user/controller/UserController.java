package com.sqq.user.controller;

import com.sqq.user.model.User;
import com.sqq.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by WIN10 on 2020/6/1.
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/newUser")
    public void newUser(@RequestBody User user){
        System.out.println("------------------------------创建新用户");
        userService.saveUser(user);
    }

    @GetMapping("/getUserById/{userId}")
    public User getOrderById(@PathVariable("userId")Integer userId){
        System.out.println("-----------------------------查询用户：" + userId);
        return userService.getUserById(userId);
    }

    /**
     * 修改用户金额和积分
     * @param user
     */
    @PostMapping("/updateUser")
    public void updateUser(@RequestBody User user){
        log.info("修改用户金额和积分，{}",user.toString());
        try {
            this.userService.updateUser(user);
            log.info("修改用户金额和积分，{},修改完成", user.toString());
        }catch (Exception e){
            log.error("修改用户金额和积分，失败",e.getMessage());
        }
    }
}

