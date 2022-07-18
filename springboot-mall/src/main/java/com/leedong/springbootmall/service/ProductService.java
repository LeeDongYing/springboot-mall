package com.leedong.springbootmall.service;

import com.leedong.springbootmall.dto.ProductRequest;
import com.leedong.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
