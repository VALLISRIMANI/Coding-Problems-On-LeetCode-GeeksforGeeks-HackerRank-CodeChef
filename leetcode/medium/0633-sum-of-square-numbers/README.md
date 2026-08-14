# Sum of Square Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a non-negative integer `c`, decide whether there're two integers `a` and `b` such that `a2 + b2 = c`.

 

 **Example 1:** 

```
Input: c = 5
Output: true
Explanation: 1  *1 + 2*  2 = 5

```

 **Example 2:** 

```
Input: c = 3
Output: false

```

 

 **Constraints:** 

- 0 <= c <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.6 MB  
**Submitted:** 2026-08-14T14:21:05.104Z  

```java
class Solution {
    public boolean judgeSquareSum(int c) {
        long square = (long) Math.sqrt(c);

        long i = 0, j = square;
        while (i <= j) {
            long temp = i * i + j * j;
            if (temp == c) {
                return true;
            } else if (temp < c) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-square-numbers/)