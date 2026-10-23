# SPRPROB08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice - Complete the Main Function

You are given a payment system that follows loose coupling using interfaces.

Different payment methods such as  **Credit Card, UPI, Wallet, Net Banking, and Cash on Delivery**  already exist and implement the same `PaymentService` interface.

The `OrderService` class depends only on the `PaymentService` interface and is already complete.

 **Your Task** 

Complete the `main` function inside the `Codechef` class and OrderService Class -
so that  **the order is placed using UPI payment**.

Follow these steps:

- Create a string variable paymentType and set its value to "UPI"
- Use the if-else logic to check the value of paymentType.
- When the value is "UPI", create a UPIPaymentService object.
- Assign this object to the paymentService variable.
- Pass paymentService to OrderService and place the order.

 **Do NOT modify:** 

- Any payment service classes
- PaymentService interface

 **Expected Output** 

After completing the `main` function and running the program, the output should be:

```
Payment done using UPI
Order placed

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T06:25:11.306Z  

```cpp
            paymentService = new CreditCardPaymentService();
        } else if (paymentType.equals("UPI")) {
            paymentService = new UPIPaymentService();
        } else if (paymentType.equals("WALLET")) {
            paymentService = new WalletPaymentService();
        } else if (paymentType.equals("NET_BANKING")) {
            paymentService = new NetBankingPaymentService();
        } else if (paymentType.equals("COD")) {
            paymentService = new CashOnDeliveryPaymentService();
        } else {
            throw new RuntimeException("Invalid payment type");
        }

        OrderService orderService = new OrderService(paymentService);
        orderService.placeOrder();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SPRPROB08)