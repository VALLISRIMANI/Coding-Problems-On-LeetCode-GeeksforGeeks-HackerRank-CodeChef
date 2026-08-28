# Sort the Two Parts  Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array of which both the first halve and second halve are sorted. The task is to merge these two sorted halves of the array into a single sorted array.
 **Note** : The two halves can be of arbitrary sizes (i.e. if first halve of size k then the second halve is of size n-k where 0 ≤ k ≤ n), where n is the length of array.

 **Examples:** 

```
Input: arr[] = {2 3 8 -1 7 10}
Output: [-1, 2, 3, 7, 8, 10] 
Explanation: {2 3 8} and {-1 7 10} are sorted in the original array. The overall sorted version is {-1 2 3 7 8 10}
```

```
Input: arr[] = {-4 6 9 -1 3}
Output: [-4, -1, 3, 6, 9]
Explanation: {-4 -1} and {3 6 9} are sorted in the original array. The overall sorted version is {-4 -1 3 6 9}
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
-105≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T09:30:27.018Z  

```java
class Solution {
    public void sortHalves(int[] arr) {
        // code here
        int n = arr.length;
        int mid = n / 2;
        int i = 0, j = mid, idx = 0;;
        int[] result = new int[n];
        
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, n);
        
        while (i < mid && j < n) {
            if (arr[i] <= arr[j]) {
                result[idx++] = arr[i++];
            } else {
                result[idx++] = arr[j++];
            }
        }
        
        while (i < mid) {
            result[idx++] = arr[i++];
        }
        while (j < n) {
            result[idx++] = arr[j++];
        }
        
        for (int k = 0; k < n; k++) {
            arr[k] = result[k];
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-the-half-sorted2157/1)