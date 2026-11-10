# FYISUJ25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Global Financial Transactions Tracker

Banks process billions of transactions daily, storing large transaction IDs and branch codes for tracking.
Use  **`long`**  for  **transaction IDs**  due to their size and  **`short`**  for  **branch codes**  as they are smaller values.

```
transactionID = 5_123_456_789_000L;  
branchCode = 3052;  

```

 **Expected Output:** 

```
Transaction ID: 5123456789000  
Branch Code: 3052  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-10T14:16:38.122Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declare and assign transaction ID
        long transactionID = 5_123_456_789_000L;  // Large transaction ID

        // Declare and assign branch code
        short branchCode = 3052;  // Small branch code

        // Print both values
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Branch Code: " + branchCode);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FYISUJ25)