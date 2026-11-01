# Pairs with Limited Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  and an integer target. You need to find the number of pairs in the array whose sum is strictly less than the target.

 **Examples:** 

```
Input: arr[] = [7, 2, 5, 3], target = 8
Output: 2
Explanation: There are 2 pairs with sum less than 8: (2, 5) and (2, 3). 
```

```
Input: arr[] = [5, 2, 3, 2, 4, 1], target = 5
Output: 4
Explanation: There are 4 pairs whose sum is less than 5: (2, 2), (2, 1), (3, 1) and (2, 1).

```

```
Input: arr[] = [2, 1, 8, 3, 4, 7, 6, 5], target = 7
Output: 6
Explanation: There are 6 pairs whose sum is less than 7: (2, 1), (2, 3), (2, 4), (1, 3), (1, 4) and (1, 5).
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T16:03:53.566Z  

```java
class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int count = 0;
        
        while (left < right) {
            if (arr[left] + arr[right] < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-pairs-whose-sum-is-less-than-target/1)