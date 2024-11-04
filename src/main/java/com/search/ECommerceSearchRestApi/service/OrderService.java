package com.search.ECommerceSearchRestApi.service;

import com.search.ECommerceSearchRestApi.dto.OrderRequest;
import com.search.ECommerceSearchRestApi.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder (OrderRequest orderRequest);



}
