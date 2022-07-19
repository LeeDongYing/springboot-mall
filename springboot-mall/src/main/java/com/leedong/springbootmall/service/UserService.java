package com.leedong.springbootmall.service;

import com.leedong.springbootmall.dto.UserLoginRequest;
import com.leedong.springbootmall.dto.UserRegisterRequest;
import com.leedong.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);

    User getUserById(Integer userId);
}
