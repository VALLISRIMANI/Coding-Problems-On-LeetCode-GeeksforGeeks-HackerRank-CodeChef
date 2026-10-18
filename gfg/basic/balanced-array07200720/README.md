# Balanced Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]** of even size, find the minimum value that needs to be added to any one element so that the array becomes balanced. An array is considered balanced when the sum of elements in the left half is equal to the sum of elements in the right half.

 **Examples :** 

```
Input: arr = [1, 5, 3, 2]
Output: 1
Explanation: Sum of first 2 elements is 1 + 5  = 6, Sum of last 2 elements is 3 + 2  = 5, To make the array balanced you can add 1.
```

```
Input: arr = [1, 2, 1, 2, 1, 3]
Output: 2
Explanation: Sum of first 3 elements is 1 + 2 + 1 = 4, Sum of last three elements is 2 + 1 + 3 = 6, To make the array balanced you can add 2.

```

 **Constraints:** 
2<=arr.size()<=107 where arr.size() is even.
1<=arr[i]<=105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T16:10:18.003Z  

```java
class Solution {
    public int minValueToBalance(List<Integer> arr) {
        // code here
        int n = arr.size();
        int mid = n / 2;

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < mid; i++) {
            leftSum += arr.get(i);
        }

        for (int i = mid; i < n; i++) {
            rightSum += arr.get(i);
        }

        return Math.abs(leftSum - rightSum);
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/balanced-array07200720/1)