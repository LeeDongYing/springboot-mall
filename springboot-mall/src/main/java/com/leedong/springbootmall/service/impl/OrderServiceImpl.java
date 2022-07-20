package com.leedong.springbootmall.service.impl;

import com.leedong.springbootmall.dao.OrderDao;
import com.leedong.springbootmall.dao.ProductDao;
import com.leedong.springbootmall.dto.BuyItem;
import com.leedong.springbootmall.dto.CreateOrderRequest;
import com.leedong.springbootmall.model.OrderItem;
import com.leedong.springbootmall.model.Product;
import com.leedong.springbootmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @Transactional
    @Override
    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest) {
        int totalAmount = 0;
        List<OrderItem> orderItemList = new ArrayList<>();

        for (BuyItem buyItem:createOrderRequest.getBuyItemList()){
            Product product = productDao.getProductById(buyItem.getProductId());
            //算總價
            int amount = product.getPrice() * buyItem.getQuantity();
            totalAmount = totalAmount + amount;

            //轉換BuyItem to OrderItem
            OrderItem orderItem = new OrderItem();
            orderItem.setProductId(buyItem.getProductId());
            orderItem.setQuantity(buyItem.getQuantity());
            orderItem.setAmount(amount);

            orderItemList.add(orderItem);
        }

        Integer orderId =orderDao.createOrder(userId,totalAmount);

        orderDao.createOrderItems(orderId,orderItemList);

        return orderId;
    }
}
