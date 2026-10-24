# Ways to Express as Sum of Consecutives

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a number  **n**, find the number of ways to represent this number as a sum of 2 or more consecutive natural numbers.

 **Examples:** 

```
Input: n = 10
Output: 1
Explanation: There is only one way, 10 = 1+2+3+4.
```

```
Input: n = 15
Output: 3
Explanation: There are 3 ways, (15 = 1+2+3+4+5), (15 = 4+5+6) and (15 = 7+8).
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T15:09:20.126Z  

```java
class Solution {
    public int getCount(int n) {
        // code here
        int count = 0;

        for (long k = 2; k * (k - 1) / 2 < n; k++) {
            long remaining = n - k * (k - 1) / 2;

            if (remaining % k == 0) {
                count++;
            }
        }

        return count;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-of-sum-of-consecutives3741/1)