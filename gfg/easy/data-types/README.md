# Data Types

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a program template, declare four variables named  **a**,  **b**,  **c**, and  **d** with the data types int, float, double, and long long respectively inside the required scope.

 **Example:** 

```
Input: None
Output: verified
Explanation: All 4 variables are declared with proper data type.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T11:01:38.077Z  

```java
class GFG {
    public static void main(String[] args) {

        // Code here to declare the variables
        int a;
        float b;
        double c;
        long d;

        // variables declaration checking (Please do not change)
        if (Integer.TYPE.equals(int.class) && Integer.TYPE.equals(int.class) &&
            Float.TYPE.equals(float.class) && Double.TYPE.equals(double.class) &&
            Long.TYPE.equals(long.class)) {
            System.out.println("verified");
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/data-types/1)