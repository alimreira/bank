package com.search.ECommerceSearchRestApi.repository;

import com.search.ECommerceSearchRestApi.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
