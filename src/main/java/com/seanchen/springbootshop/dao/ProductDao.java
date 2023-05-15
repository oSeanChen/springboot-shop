package com.seanchen.springbootshop.dao;

import com.seanchen.springbootshop.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
