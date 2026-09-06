# Longest Subsequence with Adjacent Diff as 1

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]** with n elements. find the longest subsequence such that the absolute difference between adjacent elements is one.

 **Examples:** 

```
Input : arr[] = [10, 9, 4, 5, 4, 8, 6]
Output : 3
Explanation: Longest subsequences with difference 1 are [10, 9, 8], [4, 5, 4] and [4, 5, 6]. 

```

```
Input : arr[] = [1, 2, 3, 2, 3, 7, 2, 1]
Output : 7
Explanation:  Longest subsequences with difference 1 is [1, 2, 3, 2, 3, 2, 1]. 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T11:33:22.856Z  

```java
class Solution {
    public int longestSubseq(int[] arr) {
        // code here
        HashMap<Integer, Integer> dp = new HashMap<>();

        int maxLength = 0;
        for (int num : arr) {
            int left = dp.getOrDefault(num - 1, 0);
            int right = dp.getOrDefault(num + 1, 0);
            
            int length = Math.max(left, right) + 1;
            dp.put(num, length);

            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-sub-sequence-such-that-difference-between-adjacents-is-one2558/1)