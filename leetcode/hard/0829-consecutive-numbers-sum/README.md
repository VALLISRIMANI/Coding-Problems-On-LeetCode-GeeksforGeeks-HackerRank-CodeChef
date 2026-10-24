# Consecutive Numbers Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an integer `n`, return  *the number of ways you can write* `n` *as the sum of consecutive positive integers.* 

 

 **Example 1:** 

```
Input: n = 5
Output: 2
Explanation: 5 = 2 + 3

```

 **Example 2:** 

```
Input: n = 9
Output: 3
Explanation: 9 = 4 + 5 = 2 + 3 + 4

```

 **Example 3:** 

```
Input: n = 15
Output: 4
Explanation: 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5

```

 

 **Constraints:** 

- 1 <= n <= 109

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 40.65%)  
**Memory:** 41.9 MB (beats 80.05%)  
**Submitted:** 2026-10-24T15:00:40.167Z  

```java
class Solution {
    public int consecutiveNumbersSum(int n) {
        int count = 0;

        for (long k = 1; k * (k - 1) / 2 < n; k++) {
            long remaining = n - k * (k - 1) / 2;

            if (remaining % k == 0) {
                count++;
            }
        }

        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/consecutive-numbers-sum/)