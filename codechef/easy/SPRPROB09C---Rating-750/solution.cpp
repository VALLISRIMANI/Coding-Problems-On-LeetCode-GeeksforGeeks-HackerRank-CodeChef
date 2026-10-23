package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UPIPaymentService implements PaymentServiceInterface {

    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}