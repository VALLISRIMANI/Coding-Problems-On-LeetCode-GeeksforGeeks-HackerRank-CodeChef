# XWZZRQ04 - Rating 950

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### MCQ - Find the difference

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        int[] values = {20, 15, 10, 5, 0};  
        int difference = values[0];  

        for (int i = 1; i < values.length - 1; i++) {  
            difference -= values[i];  
        }

        System.out.println("Difference: " + difference);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T06:13:50.299Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88}; // Declare and initialize array

        for (int i = 0; i < scores.length; i++) { // Loop through array elements
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/XWZZRQ04)