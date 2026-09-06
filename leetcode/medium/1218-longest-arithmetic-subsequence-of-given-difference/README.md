# Longest Arithmetic Subsequence of Given Difference

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `arr` and an integer `difference`, return the length of the longest subsequence in `arr` which is an arithmetic sequence such that the difference between adjacent elements in the subsequence equals `difference`.

A  **subsequence**  is a sequence that can be derived from `arr` by deleting some or no elements without changing the order of the remaining elements.

 

 **Example 1:** 

```
Input: arr = [1,2,3,4], difference = 1
Output: 4
Explanation: The longest arithmetic subsequence is [1,2,3,4].
```

 **Example 2:** 

```
Input: arr = [1,3,5,7], difference = 1
Output: 1
Explanation: The longest arithmetic subsequence is any single element.

```

 **Example 3:** 

```
Input: arr = [1,5,7,8,5,3,4,2,1], difference = -2
Output: 4
Explanation: The longest arithmetic subsequence is [7,5,3,1].

```

 

 **Constraints:** 

- 1 <= arr.length <= 105
- -104 <= arr[i], difference <= 104

## Solution

**Language:** Java  
**Runtime:** 36 ms (beats 94.21%)  
**Memory:** 79.9 MB (beats 32.11%)  
**Submitted:** 2026-09-06T11:27:43.819Z  

```java
class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        /*
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;
        for (int num : set) {
            if (!set.contains(num + difference)) {
                int current = num;
                int currentLength = 1;

                while (set.contains(current - difference)) {
                    current -= difference;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
        */

        HashMap<Integer, Integer> dp = new HashMap<>();

        int maxLength = 0;
        for (int num : arr) {
            int length = dp.getOrDefault((num - difference), 0) + 1;
            dp.put(num, length);

            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/)