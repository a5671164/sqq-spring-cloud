package com.sqq.order.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.sqq.order.mapper.OrderMapper;
import com.sqq.order.model.Order;
import com.sqq.order.model.User;
import com.sqq.order.openfegin.IUserService;
import com.sqq.order.service.IOrderService;
import com.sqq.order.vo.NewOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private IUserService userService;

    @Override
    @LcnTransaction
    public void saveOrder(NewOrder newOrder) throws Exception{
        log.info("使用fegin调用用户服务的修改积分服务{}",newOrder.toString());
        User user = new User();
        user.setId(newOrder.getUserId());
        user.setBalance(newOrder.getPrice());
        userService.updateUser(user);
        log.info("新增订单{}",newOrder.toString());
        Order order = new Order();
        order.setPrice(newOrder.getPrice());
        order.setUserId(newOrder.getUserId());
        order.setCreateTime(new Date());
        order.setOrderNo(new Date().getTime() + "");
        if(1==1){
            throw new Exception("测试事务");
        }
        orderMapper.insert(order);
    }
}
