# Ugly Number II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer  **n**,  return the nth ugly number. An ugly number is a positive integer whose prime factors are limited to 2, 3 and 5.

 **Examples:** 

```
Input: n = 5
Output: 5
Explanation: Ugly Numbers - 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. So, 5th Ugly Number is 5
```

```
Input: n = 10
Output: 12
Explanation: 10th Ugly Number is 12
```

 **Constraints:** 
1 ≤ n ≤ 1500

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T09:13:31.705Z  

```java

class Solution {
    public static int uglyNumber(int n) {
        // code here
        int[] ugly = new int[n + 1];
        ugly[0] = 1;
        
        int i2 = 0, i3 = 0, i5 = 0;
        
        for (int i = 1; i < n; i++) {
            int next2 = ugly[i2] * 2;
            int next3 = ugly[i3] * 3;
            int next5 = ugly[i5] * 5;
            
            int next = Math.min(next2, Math.min(next3, next5));
            ugly[i] = next;
            
            if (next == next2) i2++;
            if (next == next3) i3++;
            if (next == next5) i5++;
        }
        
        return ugly[n - 1];
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/ugly-number-ii/1)