# Max Sum Strictly Increasing Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  of size  **n**  containing positive integers, find the maximum sum of a strictly increasing subarray.

 **Examples :** 

```
Input: arr[] = {1, 2, 3, 2, 5, 1, 7}
Output: 8
Explanation: Some strictly increasing subarrays are {1, 2, 3}, {2, 5}, and {1, 7} with sums 6, 7, and 8 respectively. Therefore, the maximum sum of a strictly increasing subarray is 8.
```

```
Input: arr[] = {1, 2, 2, 4}
Output: 6
Explanation: Some strictly increasing subarrays are {1, 2} and {2, 4} with sums 3 and 6 respectively. Therefore, the maximum sum of a strictly increasing subarray is 6.

```

 **Constraints:** 
1 ≤ n ≤ 105
1 ≤ ai ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-11T04:30:34.221Z  

```java
class Solution {
    public int maxIncSubarraySum(int arr[]) {
        // code here
        int sum = arr[0];
        int maxSum = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                maxSum = Math.max(maxSum, sum);
                sum = 0;
            }

            sum += arr[i];
        }

        maxSum = Math.max(maxSum, sum);

        return maxSum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-maximum-sum-strictly-increasing-subarray4443/1)