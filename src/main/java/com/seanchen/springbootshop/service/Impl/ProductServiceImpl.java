package com.seanchen.springbootshop.service.Impl;

import com.seanchen.springbootshop.dao.ProductDao;
import com.seanchen.springbootshop.model.Product;
import com.seanchen.springbootshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
