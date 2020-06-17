package com.sqq.user.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.sqq.user.mapper.UserMapper;
import com.sqq.user.model.User;
import com.sqq.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public void saveUser(User user) {
        log.info("新增用户，{}",user.toString());
        user.setBalance(100.0);
        user.setIntegral(0);
        user.setCareateTime(new Date());
        this.userMapper.insert(user);
        log.info("新增用户，成功{}",user.toString());

    }

    @Override
    @LcnTransaction
    public void updateUser(User user) throws Exception{
        log.info("修改用户信息，{}",user.toString());
        user.setIntegral(user.getBalance().intValue());
        userMapper.updateUserInfo(user);
        log.info("修改用户信息完成，{}",user.toString());
        log.info("测试事务，{}",user.toString());
        User user1 = new User();
        user1.setIntegral(111);
        user1.setBalance(100.0);
        user1.setAge(20);
        user1.setUserName("事务回滚测试");
        userMapper.insert(user1);
    }
}
