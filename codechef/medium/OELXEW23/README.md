# OELXEW23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Employee Records Initialization

In this example, we demonstrate how Java assigns default values to arrays when they are created without explicit initialization. Each data type has a specific default that ensures memory is reserved with predictable values.

 **When executed, the code will show:** 

```
IDs: 0, 0, 0  
Salaries: 0.0, 0.0, 0.0  
Active Status: false, false, false   

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T06:12:16.292Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Arrays to store default employee data
        int[] intArray = new int[5];          // Default: 0
        double[] doubleArray = new double[5]; // Default: 0.0
        boolean[] booleanArray = new boolean[5]; // Default: false

        // Display default values without loops or toString
        System.out.println("IDs: " + intArray[0] + ", " + intArray[1] + ", " + intArray[2]);
        System.out.println("Salaries: " + doubleArray[0] + ", " + doubleArray[1] + ", " + doubleArray[2]);
        System.out.println("Active Status: " + booleanArray[0] + ", " + booleanArray[1] + ", " + booleanArray[2]);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OELXEW23)