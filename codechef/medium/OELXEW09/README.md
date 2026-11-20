# OELXEW09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Tracking Monthly Expenses

In this exercise, we are working with a system to track monthly expenses. The goal is to initialize arrays for various expenses and print them to verify correct initialization and assignment.

```
expenses = 2000.50, 1500.75, 800.25, 1200.00, 500.00
newExpenses = 100.00, 150.00, 75.50

```

 **Expected Output:** 

```
Rent Expense: 2000.5
Grocery Expense: 1500.75
Internet Bill: 100.0
Gym Membership: 150.0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T06:10:10.250Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Static Initialization: Expenses in specific categories
        double[] expenses = {2000.50, 1500.75, 800.25, 1200.00, 500.00}; // Rent, groceries, utilities, travel, others

        System.out.println("Rent Expense: " + expenses[0]);
        System.out.println("Grocery Expense: " + expenses[1]);

        // Dynamic Initialization: Add expenses later
        double[] newExpenses = new double[3];
        newExpenses[0] = 100.00; // Internet bill
        newExpenses[1] = 150.00; // Gym membership
        newExpenses[2] = 75.50;  // Subscriptions

        System.out.println("Internet Bill: " + newExpenses[0]);
        System.out.println("Gym Membership: " + newExpenses[1]);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OELXEW09)