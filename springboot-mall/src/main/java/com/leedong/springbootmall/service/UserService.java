package com.leedong.springbootmall.service;

import com.leedong.springbootmall.dto.UserRegisterRequest;
import com.leedong.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
