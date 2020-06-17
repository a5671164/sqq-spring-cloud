package com.sqq.user.service;

import com.sqq.user.model.User;

public interface IUserService {

    User getUserById(Integer userId);

    void saveUser(User user);

    void updateUser(User user) throws Exception;
}
