# Closest Three Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array,  **a**  **rr[]**  of integers, and another number  **target**, find three integers in the array such that their sum is closest to the target. Return the sum of the three integers.

Note: If there are multiple solutions, return the maximum one.

 **Examples :** 

```
Input: arr[] = [-1, 2, 2, 4], target = 4
Output: 5
Explanation: All possible triplets
[-1, 2, 2], sum = (-1) + 2 + 2 = 3
[-1, 2, 4], sum = (-1) + 2 + 4 = 5
[-1, 2, 4], sum = (-1) + 2 + 4 = 5
[2, 2, 4], sum = 2 + 2 + 4 = 8
Triplet [-1, 2, 2], [-1, 2, 4] and [-1, 2, 4] have sum closest to target, so return the maximum one, that is 5.
```

```
Input: arr[] = [1, 10, 4, 5], target = 10
Output: 10
Explanation: All possible triplets
[1, 10, 4], sum = (1 + 10 + 4) = 15
[1, 10, 5], sum = (1 + 10 + 5) = 16
[1, 4, 5], sum = (1 + 4 + 5) = 10
[10, 4, 5], sum = (10 + 4 + 5) = 19 
Triplet [1, 4, 5] has sum = 10 which is closest to target.
```

 **Constraints:** 
3 ≤ arr.size() ≤ 103
-105 ≤ arr[i] ≤ 105
1 ≤ target ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T07:13:50.667Z  

```java
class Solution {
    public int closest3Sum(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int closest = arr[0] + arr[1] + arr[2]; 

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                int currentDiff = Math.abs(sum - target);
                int closestDiff = Math.abs(closest - target);

                if (currentDiff < closestDiff || (currentDiff == closestDiff && sum > closest)) {
                    closest = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum;
                }
            }
        }
        
        return closest;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/three-sum-closest/1)