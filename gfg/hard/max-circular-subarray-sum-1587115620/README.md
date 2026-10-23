# Max Circular Subarray Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given a circular array  **`arr[]`** of integers, find the  **maximum**  possible sum of a non-empty  **subarray**. In a circular array, the subarray can start at the end and wrap around to the beginning. Return the maximum non-empty subarray sum, considering both non-wrapping and wrapping cases.

 **Examples:** 

```
Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
Output: 22
Explanation: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22.
```

```
Input: arr[] = [10, -3, -4, 7, 6, 5, -4, -1]
Output: 23
Explanation: Maximum sum of the circular subarray is 23. The subarray is [7, 6, 5, -4, -1, 10].

```

```
Input: arr[] = [5, -2, 3, 4]
Output: 12
Explanation: The circular subarray [3, 4, 5] gives the maximum sum of 12.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T09:14:15.520Z  

```java
class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int totalSum = 0;

        int currMax = 0;
        int maxSum = Integer.MIN_VALUE;

        int currMin = 0;
        int minSum = Integer.MAX_VALUE;

        for (int num : arr) {

            totalSum += num;

            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);
        }

        if (maxSum < 0)
            return maxSum;

        return Math.max(maxSum, totalSum - minSum);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/1)