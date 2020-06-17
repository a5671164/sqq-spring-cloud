package com.sqq.order.controller;

import com.sqq.order.model.Order;
import com.sqq.order.model.User;
import com.sqq.order.openfegin.IUserService;
import com.sqq.order.service.IOrderService;
import com.sqq.order.vo.NewOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by WIN10 on 2020/6/1.
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @PostMapping("/newOrder")
    public void newOrder(@RequestBody NewOrder newOrder){
        System.out.println("------------------------------创建新订单");
        try {
            orderService.saveOrder(newOrder);
        } catch (Exception e) {
            log.error("新建订单出错",e);
            e.printStackTrace();
        }
    }

    @GetMapping("/getOrderById/{orderId}")
    public void getOrderById(@PathVariable("orderId")Integer orderId){
        System.out.println("-----------------------------查询订单：" + orderId);
    }
}

