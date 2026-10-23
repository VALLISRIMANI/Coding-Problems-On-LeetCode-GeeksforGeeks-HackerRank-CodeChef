# SPRPROB06A

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice - Loose Coupling

You’ve seen how `OrderService` uses `PaymentServiceInterface` to place an order without worrying about the payment method.
Currently, our code has two payment methods:

- CreditCardPaymentService → prints: "Payment done using Credit Card"
- UPIPaymentService → prints: "Payment done using UPI"

The `OrderService` does not need to change when we switch payment methods. This is  **loose coupling in action**.

 **Your Task :** 

 **Step 1 — Create a New Payment Method in `PaymentMethods.java`** 

- Create a new class called PayPalPaymentService.
- Make it implement PaymentServiceInterface.
- Implement the pay() method to print:

```
Payment done using PayPal

```

Note : To create new class `PayPalPaymentService` - You can take reference from other classes present in `PaymentMethods.java`

 **Step 2 — Update `Main.java`** 

- Change the line where CreditCardPaymentService is used
- Replace it with your new service PayPalPaymentService
- Do NOT change OrderService.java
- After your change, Main.java should use your new payment method.

 **Step 3 — Run the Code** 

- When you run Main.java, the expected output should be:

```
Payment done using PayPal
Order placed

```

Notice how the order service didn’t change at all, but we can now process payments using a completely new method.
 **That’s the power of loose coupling!**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T06:16:46.741Z  

```cpp
public class Main {
    public static void main(String[] args) {

        PaymentServiceInterface payment = new PayPalPaymentService();
        OrderService orderService = new OrderService(payment);

        orderService.placeOrder();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SPRPROB06A)