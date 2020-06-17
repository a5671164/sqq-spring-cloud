package com.sqq.order.openfegin;

import com.sqq.order.model.User;
import com.sqq.order.openfegin.fallback.UserServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "sqq-user",fallback = UserServiceFallbackImpl.class)
public interface IUserService {

    @PostMapping("/user/updateUser")
    public void updateUser(User user);
}
