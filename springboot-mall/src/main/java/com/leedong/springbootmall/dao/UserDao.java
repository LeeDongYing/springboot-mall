package com.leedong.springbootmall.dao;

import com.leedong.springbootmall.dto.UserRegisterRequest;
import com.leedong.springbootmall.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
