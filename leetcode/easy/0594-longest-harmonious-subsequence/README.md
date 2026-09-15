# Longest Harmonious Subsequence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

We define a harmonious array as an array where the difference between its maximum value and its minimum value is  **exactly**  `1`.

Given an integer array `nums`, return the length of its longest harmonious subsequence among all its possible subsequences.

 

 **Example 1:** 

 **Input:**  nums = [1,3,2,2,5,2,3,7]

 **Output:**  5

 **Explanation:** 

The longest harmonious subsequence is `[3,2,2,2,3]`.

 **Example 2:** 

 **Input:**  nums = [1,2,3,4]

 **Output:**  2

 **Explanation:** 

The longest harmonious subsequences are `[1,2]`, `[2,3]`, and `[3,4]`, all of which have a length of 2.

 **Example 3:** 

 **Input:**  nums = [1,1,1,1]

 **Output:**  0

 **Explanation:** 

No harmonic subsequence exists.

 

 **Constraints:** 

- 1 <= nums.length <= 2 * 104
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 17 ms (beats 38.01%)  
**Memory:** 48 MB (beats 81.81%)  
**Submitted:** 2026-09-15T14:42:52.353Z  

```java
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int result = 0;
        for (int num : freq.keySet()) {
            if (freq.containsKey(num + 1)) {
                result = Math.max(result, freq.get(num) + freq.get(num + 1));
            }
        }

        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-harmonious-subsequence/)