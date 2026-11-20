# XWZZRQ03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Iterating Arrays with For Loop

In this example, we demonstrate how to iterate through an integer array using a `for` loop in Java. This technique is useful when you need to access or process each element in an array individually.

 **When executed, the code will show:** 

```
Score 1: 85  
Score 2: 90  
Score 3: 78  
Score 4: 92  
Score 5: 88  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T06:13:06.288Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/XWZZRQ03)