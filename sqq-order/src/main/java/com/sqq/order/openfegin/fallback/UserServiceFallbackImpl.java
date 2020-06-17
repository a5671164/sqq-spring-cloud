package com.sqq.order.openfegin.fallback;

import com.sqq.order.model.User;
import com.sqq.order.openfegin.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class UserServiceFallbackImpl implements IUserService {
    @Override
    public void updateUser(User user) {
        log.error("调用{}异常:{}","updateUser", user.toString());
    }
}
