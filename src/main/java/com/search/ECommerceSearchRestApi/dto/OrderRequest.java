package com.search.ECommerceSearchRestApi.dto;

import com.search.ECommerceSearchRestApi.entity.Order;
import com.search.ECommerceSearchRestApi.entity.Payment;
import lombok.Data;

@Data
public class OrderRequest {
    private Order order;
    private Payment payment;
}
