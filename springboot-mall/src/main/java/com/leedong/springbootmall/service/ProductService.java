package com.leedong.springbootmall.service;

import com.leedong.springbootmall.dto.ProductQueryParams;
import com.leedong.springbootmall.dto.ProductRequest;
import com.leedong.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(Integer productId);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    void deleteProductById(Integer productId);

    Integer countProduct(ProductQueryParams productQueryParams);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);




}
