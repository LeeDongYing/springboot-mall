package com.leedong.springbootmall.dao;

import com.leedong.springbootmall.dto.ProductRequest;
import com.leedong.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
