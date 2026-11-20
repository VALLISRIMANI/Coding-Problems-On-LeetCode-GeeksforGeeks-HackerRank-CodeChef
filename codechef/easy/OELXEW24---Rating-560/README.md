# OELXEW24 - Rating 560

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Default Enrollment Status

In this task, you need to print the default value of a `boolean` array element. Complete the following code:

```
class Codechef {
    public static void main(String[] args) {
        boolean[] status = new boolean[3];
        System.out.println("Default Enrollment Status: " + __); //fill in the blank
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T06:12:38.580Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/OELXEW24)