# Max Sum Subarray of Size at least K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]** and an integer  **k**, find the maximum sum among all contiguous subarrays having a length greater than or equal to k.

 **Examples:** 

```
Input: arr[] = [1, -2, 2, -3], k = 3
Output: 1
Explanation: The sub-array of length at least 3 that produces greatest sum is [1, -2, 2]
```

```
Input: arr[] = [1, 1, 1, 1, 1, 1], k = 2
Output: 6
Explanation: The sub-array of length at least 2 that produces greatest sum is [1, 1, 1, 1, 1, 1]
```

```
Input: arr[] = [-4, -2, 1, -3], k = 2
Output: -1
Explanation: The sub-array of length at least 2 that produces greatest sum is [-2, 1]
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T02:20:10.731Z  

```java
class Solution {
    public int maxSumWithK(int[] arr, int k) {
        // code here
        int n = arr.length;
        int[] maxEndingHere = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            maxEndingHere[i] = sum;
        }
        
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        
        int maximumSum = windowSum;
        
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maximumSum = Math.max(maximumSum, windowSum);
            maximumSum = Math.max(maximumSum, windowSum + maxEndingHere[i - k]);
        }
        
        return maximumSum;
    }   
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/largest-sum-subarray-of-size-at-least-k3121/1)