package com.leedong.springbootmall.dao;

import com.leedong.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
