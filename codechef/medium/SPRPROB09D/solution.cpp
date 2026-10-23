package com.example.demo.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;

@Service("NetBankingPaymentService")
public class NetBankingPaymentService implements PaymentServiceInterface {

    // Write Your Code Here
    @Override
    public void pay() {
        System.out.println("Payment done using NetBanking");
    }
}
