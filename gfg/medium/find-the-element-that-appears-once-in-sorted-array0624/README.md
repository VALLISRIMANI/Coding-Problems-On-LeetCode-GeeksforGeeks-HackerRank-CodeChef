# Single Among Doubles in a Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a sorted array  **arr[]**. Find the element that appears only **once** in the array. All other elements appear exactly  **twice**. 

 **Examples:** 

```
Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65]
Output: 4
Explanation: 4 is the only element that appears exactly once.

```

```
Input: arr[] = [5]
Output: 5
```

```
Input: arr[] = [1, 2, 2, 3, 3]
Output: 1
```

 **Constraints:** 
1 ≤ arr.size() ≤ 2 * 106
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T14:51:46.538Z  

```java
class Solution {
    int single(int[] arr) {
        // code here
        return search(arr, 0, arr.length - 1);
    }
    
    int search(int[] arr, int low, int high) {
        if (low == high) {
            return arr[low];
        }
        
        int mid = low + (high - low) / 2;
        if (mid % 2 != 0) {
            mid--;
        }
        
        if (arr[mid] == arr[mid + 1]) {
            return search(arr, mid + 2, high);
        }
        
        return search(arr, low, mid);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1)