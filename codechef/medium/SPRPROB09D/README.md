# SPRPROB09D

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice - Choose a Payment Method Using Qualifier

Currently, your application has two payment services:

- UPIPaymentService
- CreditCardPaymentService Payment is currently working using UPIPaymentService via @Qualifier. Now you will practice selecting a different payment service using @Qualifier.

 **Your Task:** 

 **1. Add one more payment service** 

- Create NetBankingPaymentService.java
- It should implement the same payment interface, i.e., PaymentServiceInterface
- The pay() method should print: "Payment done using NetBanking"
- You can refer to UPIPaymentService for guidance

 **2. Use `@Qualifier` to select NetBanking** 

- Make sure @Primary removed from all services
- In OrderService, use @Qualifier("NetBankingPaymentService") in the constructor to inject NetBankingPaymentService
- Do not change other parts of OrderService

 **Expected Output** 

```
Payment done using NetBanking
Order placed

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T07:21:31.617Z  

```cpp
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

```

---

[View on CodeChef](https://www.codechef.com/problems/SPRPROB09D)