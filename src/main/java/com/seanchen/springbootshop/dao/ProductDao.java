package com.seanchen.springbootshop.dao;

import com.seanchen.springbootshop.dto.ProductRequest;
import com.seanchen.springbootshop.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
