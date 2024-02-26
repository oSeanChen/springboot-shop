package com.seanchen.springbootshop.dao;

import com.seanchen.springbootshop.dto.UserRegisterRequest;
import com.seanchen.springbootshop.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

}
