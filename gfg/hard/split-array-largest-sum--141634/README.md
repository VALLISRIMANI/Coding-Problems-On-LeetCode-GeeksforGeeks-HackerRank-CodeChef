# Split Array Largest Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an array  **arr[]**  and an integer  **k**, divide the array into  **k**  contiguous subarrays such that the  **maximum** sum among these subarrays is  **minimized**. Find this minimum possible  **maximum sum**.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4], k = 3
Output: 4
Explanation: Optimal Split is [1, 2], [3], [4]. Maximum sum of all subarrays is 4, which is minimum possible for 3 splits.

```

```
Input: arr[] = [1, 1, 2], k = 2
Output: 2
Explanation: Splitting the array as [1, 1] and [2] is optimal. This results in a maximum sum subarray of 2.
```

**Constraints:
**1 ≤ k ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T13:30:32.942Z  

```java
class Solution {
    public int splitArray(int[] arr, int k) {
        // code here
        long low = 0, high = 0;

         for (int num : arr) {
             low = Math.max(low, num);
             high += num;
         }

         while (low < high) {
             long mid = low + (high - low) / 2;

             int parts = 1;
             long sum = 0;

             for (int num : arr) {
                 if (sum + num > mid) {
                     parts++;
                     sum = num;
                 } else {
                     sum += num;
                 }
             }

             if (parts <= k) {
                 high = mid;
             } else {
                 low = mid + 1;
             }
         }

         return (int) low;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/split-array-largest-sum--141634/1)