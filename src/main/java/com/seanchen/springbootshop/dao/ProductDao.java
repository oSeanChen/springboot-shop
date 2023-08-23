package com.seanchen.springbootshop.dao;

import com.seanchen.springbootshop.constant.ProductCategory;
import com.seanchen.springbootshop.dto.ProductQueryParams;
import com.seanchen.springbootshop.dto.ProductRequest;
import com.seanchen.springbootshop.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
