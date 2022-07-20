package com.leedong.springbootmall.service;

import com.leedong.springbootmall.dto.CreateOrderRequest;
import com.leedong.springbootmall.model.Order;

public interface OrderService {
    Integer createOrder(Integer userId , CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
