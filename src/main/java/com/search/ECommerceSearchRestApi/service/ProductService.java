package com.search.ECommerceSearchRestApi.service;

import com.search.ECommerceSearchRestApi.entity.Product;

import java.util.List;

public interface ProductService {

    Product createProduct (Product product);

    List<Product> searchProducts(String query);
}
