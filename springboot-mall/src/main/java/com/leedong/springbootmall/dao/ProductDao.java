package com.leedong.springbootmall.dao;

import com.leedong.springbootmall.constant.ProductCategory;
import com.leedong.springbootmall.dto.ProductRequest;
import com.leedong.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);

    List<Product> getProducts(ProductCategory category,String search);
}
