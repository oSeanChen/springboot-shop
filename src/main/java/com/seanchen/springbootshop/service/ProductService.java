package com.seanchen.springbootshop.service;

import com.seanchen.springbootshop.model.Product;
import org.springframework.stereotype.Component;

public interface ProductService {
    Product getProductById(Integer productId);

}
