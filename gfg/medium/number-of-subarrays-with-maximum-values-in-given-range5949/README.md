# Subarrays with Max in Range

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array  **arr[]**  and two integers  **l**  and  **r**. Find the count of subarrays where the maximum element in that subarray is in range [l, r]. In other words, the max element is at least l and at most r.

 **Examples :** 

```
Input: arr[] = [1, 2, 3, 4, 5], l = 2, r = 5
Output: 14
Explanation: Valid subarrays are: [2], [3], [4], [5], [1, 2], [2, 3], [3, 4], [4, 5], [1, 2, 3], [2, 3, 4], [3, 4, 5], [1, 2, 3, 4], [2, 3, 4, 5], [1, 2, 3, 4, 5].
```

```
Input: arr[] = [3, 1, 6, 4], l = 3, r = 6
Output: 9
Explanation: Valid subarrays are: [3], [6], [4], [3, 1], [1, 6], [6, 4], [3, 1, 6], [1, 6, 4], [3, 1, 6, 4].
```

```
Input: arr[] = [1, 2, 3, 4], l = 5, r = 7
Output: 0
Explanation: There is no subarray where the maximum is at least 5 and at most 7.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T07:32:35.575Z  

```java
class Solution {
    public int countSubarrays(int[] arr, int l, int r) {
        // code here
        return (int) (countMaximumSubarrays(arr, r) - countMaximumSubarrays(arr, l - 1));
    }
    
    private long countMaximumSubarrays(int[] arr, int k) {
        long count = 0;
        long length = 0;
        
        for (int num : arr) {
            if (num <= k) {
                length++;
                count += length;
            } else {
                length = 0;
            }
        }
        
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/number-of-subarrays-with-maximum-values-in-given-range5949/1)