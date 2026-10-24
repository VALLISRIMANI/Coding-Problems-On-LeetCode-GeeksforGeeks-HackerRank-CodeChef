# Check If It Is a Good Array

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an array `nums` of positive integers. Your task is to select some subset of `nums`, multiply each element by an integer and add all these numbers. The array is said to be  **good** if you can obtain a sum of `1` from the array by any possible subset and multiplicand.

Return `True` if the array is  **good** otherwise return `False`.

 

 **Example 1:** 

```
Input: nums = [12,5,7,23]
Output: true
Explanation: Pick numbers 5 and 7.
5 *3 + 7* (-2) = 1

```

 **Example 2:** 

```
Input: nums = [29,6,10]
Output: true
Explanation: Pick numbers 29, 6 and 10.
29 *1 + 6* (-3) + 10*(-1) = 1

```

 **Example 3:** 

```
Input: nums = [3,6]
Output: false

```

 

 **Constraints:** 

- 1 <= nums.length <= 10^5
- 1 <= nums[i] <= 10^9

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 58.88%)  
**Memory:** 61.3 MB (beats 97.60%)  
**Submitted:** 2026-10-24T14:56:01.247Z  

```java
class Solution {
    public boolean isGoodArray(int[] nums) {
        int g = nums[0];

        for (int i = 1; i < nums.length; i++) {
            g = gcd(g, nums[i]);

            if (g == 1) {
                return true;
            }
        }

        return g == 1;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-it-is-a-good-array/)