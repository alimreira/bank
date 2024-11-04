package com.search.ECommerceSearchRestApi.service.impl;

import com.search.ECommerceSearchRestApi.entity.Product;
import com.search.ECommerceSearchRestApi.repository.ProductRepository;
import com.search.ECommerceSearchRestApi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        Product product1 = productRepository.save(product);
        return product1;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products =productRepository.searchProducts(query);
        return products;
    }
}
