package com.leedong.springbootmall.service;

import com.leedong.springbootmall.dto.CreateOrderRequest;
import com.leedong.springbootmall.dto.OrderQueryParams;
import com.leedong.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    Integer createOrder(Integer userId , CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);
}
