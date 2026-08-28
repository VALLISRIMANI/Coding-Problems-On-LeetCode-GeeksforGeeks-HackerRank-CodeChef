# First 1 in a Sorted Binary Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a sorted array  **arr**  consisting of  **0** s and  **1** s. The task is to find the index (0-based indexing) of the first  **1**  in the given array.

 **NOTE:** If one is not present then, return -1.

 **Examples :** 

```
Input : arr[] = [0, 0, 0, 0, 0, 0, 1, 1, 1, 1]
Output : 6
Explanation: The index of first 1 in the array is 6.

```

```
Input : arr[] = [0, 0, 0, 0]
Output : -1
Explanation: 1's are not present in the array.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T09:12:13.635Z  

```java
class Solution {
    public int firstIndex(int arr[]) {
        // code here
        return search(arr, 0, arr.length - 1);
    }
    
    public int search(int[] arr, int left, int right) {
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == 1) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            } 
        }
        
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/index-of-first-1-in-a-sorted-array-of-0s-and-1s4048/1)