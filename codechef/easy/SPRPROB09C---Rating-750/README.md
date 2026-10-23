# SPRPROB09C - Rating 750

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Practice - Choose a Payment Method Using Primary

Currently, your application has two payment services:

- UPIPaymentService
- CreditCardPaymentService

Payment is working because `UPIPaymentService` is marked as `@Primary`, so Spring uses it by default.
Now you will practice changing the default payment service.

 **Your Task**  :

 **1. Add one more payment service** 

- Create NetBankingPaymentService.java
- It should implement the same payment interface i.e PaymentServiceInterface
- The pay() method should print: - "Payment done using NetBanking"
- You can refer to UPIPaymentService for guidance.

 **2. Make NetBanking the default payment method** 

- Add @Primary to NetBankingPaymentService
- Remove @Primary from UPIPaymentService

 **3. Do not change `OrderService`** 

 **Expected Output** 

```
Payment done using NetBanking
Order placed

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T07:15:42.218Z  

```cpp
package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UPIPaymentService implements PaymentServiceInterface {

    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SPRPROB09C)