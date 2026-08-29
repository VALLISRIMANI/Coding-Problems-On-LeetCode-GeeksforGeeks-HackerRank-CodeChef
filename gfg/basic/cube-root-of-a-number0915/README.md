# Cube Root

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number  **n**, find the floor of cube root of **n**.

 **Examples:** 

```
Input: n = 3
Output: 1
Explanation: Cube root of 3 is 1.442 = 1
```

```
Input: n = 8
Output: 2
Explanation: Cube root of 8 is 2
```

 **Constraints:** 
1 <= n <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T10:32:19.569Z  

```java
class Solution {
    static int cubeRoot(int n) {
        // code here
        return (int) Math.floor(Math.pow(n, (1.0 / 3.0)));
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/cube-root-of-a-number0915/1)