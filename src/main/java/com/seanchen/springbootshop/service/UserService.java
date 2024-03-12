package com.seanchen.springbootshop.service;

import com.seanchen.springbootshop.dto.UserLoginRequest;
import com.seanchen.springbootshop.dto.UserRegisterRequest;
import com.seanchen.springbootshop.model.User;

public interface UserService {

    Integer register(UserRegisterRequest registerRequest);

    User getUser(Integer userId);
    User login (UserLoginRequest userLoginRequest);
}
