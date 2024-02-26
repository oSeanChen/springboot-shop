package com.seanchen.springbootshop.service.Impl;

import com.seanchen.springbootshop.dao.UserDao;
import com.seanchen.springbootshop.dto.UserRegisterRequest;
import com.seanchen.springbootshop.model.User;
import com.seanchen.springbootshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUser(Integer userId) {
        return userDao.getUserById(userId);
    }
}
