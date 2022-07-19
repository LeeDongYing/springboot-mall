package com.leedong.springbootmall.service.impl;

import com.leedong.springbootmall.dao.UserDao;
import com.leedong.springbootmall.dto.UserRegisterRequest;
import com.leedong.springbootmall.model.User;
import com.leedong.springbootmall.service.UserService;
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
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
