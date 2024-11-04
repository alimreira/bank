package com.search.ECommerceSearchRestApi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cardType;
    private String cardName;
    private String cardNumber;
    private int expiryYear;
    private int expiryMth;
    private String cvc;
    private Long orderId;
}
