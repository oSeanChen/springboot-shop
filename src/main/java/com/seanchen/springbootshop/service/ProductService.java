package com.seanchen.springbootshop.service;

import com.seanchen.springbootshop.constant.ProductCategory;
import com.seanchen.springbootshop.dto.ProductRequest;
import com.seanchen.springbootshop.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}

