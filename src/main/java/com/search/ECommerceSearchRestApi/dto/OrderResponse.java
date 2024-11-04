package com.search.ECommerceSearchRestApi.dto;

import lombok.Data;

@Data
public class OrderResponse {
    //once a user places an order, the user should be able to get a form of acknowledgment from the application
    private String orderTrackingNumber;
    private String status;
    private String message;
}
