# Max Subarray Sum Limited by X

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  of integers and a number  **x**, find the sum of subarray having a maximum sum less than or equal to the given value of  **x**.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5], x = 11 
Output: 10
Explanation: Subarray having maximum sum is [1, 2, 3, 4].
```

```
Input: arr[] = [2, 4, 6, 8, 10], x = 7 
Output: 6
Explanation: Subarray having maximum sum is [2, 4] or [6].
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 104
1 ≤ x ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T14:18:09.666Z  

```java
class Solution {
    public int maxSum(int[] arr, int x) {
        // code here
        int left = 0;
        int sum = 0;
        int maxSum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > x && left <= right) {
                sum -= arr[left];
                left++;
            }
    
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-sum-of-subarray-less-than-or-equal-to-x4033/1)