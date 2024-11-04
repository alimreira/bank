package com.search.ECommerceSearchRestApi.repository;

import com.search.ECommerceSearchRestApi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    //JPQL query
    @Query("SELECT p FROM Product p WHERE p.name LIKE CONCAT('%',:query, '%') Or p.description LIKE CONCAT('%', :query, '%')")
    List<Product> searchProducts(String query);

    //native query
//    @Query(value = "SELECT * FROM products p WHERE p.name LIKE CONCAT('%',:query, '%') Or p.description LIKE CONCAT('%', :query, '%')",nativeQuery = true)
//    List<Product> searchProductsSQL(String query);
}
