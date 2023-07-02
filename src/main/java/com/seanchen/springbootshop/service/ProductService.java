package com.seanchen.springbootshop.service;

import com.seanchen.springbootshop.dto.ProductRequest;
import com.seanchen.springbootshop.model.Product;
import org.springframework.stereotype.Component;

public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}

