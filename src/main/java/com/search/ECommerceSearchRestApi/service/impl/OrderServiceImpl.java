package com.search.ECommerceSearchRestApi.service.impl;

import com.search.ECommerceSearchRestApi.dto.OrderRequest;
import com.search.ECommerceSearchRestApi.dto.OrderResponse;
import com.search.ECommerceSearchRestApi.entity.Order;
import com.search.ECommerceSearchRestApi.entity.Payment;
import com.search.ECommerceSearchRestApi.exception.PaymentException;
import com.search.ECommerceSearchRestApi.repository.OrderRepository;
import com.search.ECommerceSearchRestApi.repository.PaymentRepository;
import com.search.ECommerceSearchRestApi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    private PaymentRepository paymentRepository;
    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, PaymentRepository paymentRepository) {
        this.orderRepository = orderRepository;
        this.paymentRepository = paymentRepository;
    }

    @Override
    @Transactional(rollbackFor = PaymentException.class)
    public OrderResponse placeOrder(OrderRequest orderRequest) {
        Order order = orderRequest.getOrder();
        order.setStatus("IN PROGRESS");
        order.setOrderTrackingNo(UUID.randomUUID().toString());
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();
        if(!payment.getCardType().equals("DEBIT")){
            throw new PaymentException("Does not support payment card type");
        }

        payment.setOrderId(order.getId());
        paymentRepository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTrackingNumber(order.getOrderTrackingNo());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("SUCCESS");
        return orderResponse;
    }
}
