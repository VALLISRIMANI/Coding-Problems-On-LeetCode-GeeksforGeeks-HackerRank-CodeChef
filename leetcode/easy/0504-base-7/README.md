# Base 7

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `num`, return  *a string of its  **base 7**  representation*.

 

Original
Java
 **Example 1:** 

```
Input: num = 100
Output: "202"

```

 **Example 2:** 

```
Input: num = -7
Output: "-10"

```

 

 **Constraints:** 

- -107 <= num <= 107

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 80.07%)  
**Memory:** 42 MB (beats 93.50%)  
**Submitted:** 2026-11-13T16:07:19.236Z  

```java
class Solution {
    public String convertToBase7(int num) {
        /* 
        if (num == 0) {
            return "0";
        }

        boolean negative = num < 0;
        num = Math.abs(num);

        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }

        if (negative) {
            sb.append("-");
        }

        return sb.reverse().toString();
        */
        
        return Integer.toString(num, 7);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/base-7/)