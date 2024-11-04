package com.search.ECommerceSearchRestApi.controller;

import com.search.ECommerceSearchRestApi.entity.Product;
import com.search.ECommerceSearchRestApi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ProductController {
    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("create/product")
    public ResponseEntity<Product> createProduct (@RequestBody Product product) {
        Product persist = productService.createProduct(product);
        return new ResponseEntity<>(persist,HttpStatus.CREATED);
    }

    @GetMapping("search/product")
    public ResponseEntity<List<Product>> searchProduct (@RequestParam(name ="query") String query) {
        return new ResponseEntity<>(productService.searchProducts(query), HttpStatus.OK);
    }
}
