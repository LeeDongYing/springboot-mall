package com.leedong.springbootmall.service;

import com.leedong.springbootmall.dto.CreateOrderRequest;

public interface OrderService {
    Integer createOrder(Integer userId , CreateOrderRequest createOrderRequest);
}
