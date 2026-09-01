# Triplets with Smaller Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  of distinct integers and a value  **sum**, find the count of triplets  **(i, j, k)**, having  **(i<j<k)** with the sum of  (arr[i] + arr[j] + arr[k])  smaller than the given value sum.

  Examples :  

```
Input: sum = 2, arr[] = [-2, 0, 1, 3]
Output:  2
Explanation: Triplets with sum less than 2 are (-2, 0, 1) and (-2, 0, 3). 

```

```
Input: sum = 12, arr[] = [5, 1, 3, 4, 7]
Output: 4
Explanation: Triplets with sum less than 12 are (1, 3, 4), (5, 1, 3), (1, 3, 7) and (5, 1, 4).
```

  Constraints:
  1 ≤ sum ≤ 105
3 ≤ arr.size() ≤ 103
-103 ≤ arr[i] ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T04:57:39.712Z  

```java
class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        int n = arr.length;
        int count = 0;
        
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            
            while (left < right) {
                int sumValue = arr[i] + arr[left] + arr[right];
                
                if (sumValue < sum) {
                    count += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1)