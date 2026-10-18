# Alternative Sorting

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr** of distinct integers. Rearrange the array in such a way that the first element is the largest and the second element is the smallest, the third element is the second largest and the fourth element is the second smallest, and so on.

 **Examples:** 

```
Input: arr[] = [7, 1, 2, 3, 4, 5, 6]
Output: [7, 1, 6, 2, 5, 3, 4]
Explanation: The first element is first maximum and second element is first minimum and so on.

```

```
Input: arr[] = [1, 6, 9, 4, 3, 7, 8, 2]
Output: [9, 1, 8, 2, 7, 3, 6, 4]
Explanation: The first element is first maximum and second element is first minimum and so on.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T16:16:09.335Z  

```java
class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int low = 0, high = arr.length - 1;
        
        while (low <= high) {
            if (low != high) {
                result.add(arr[high--]);
                result.add(arr[low++]);
            } else {
                result.add(arr[low]);
                low++;
            }
        }
        
        return result;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/alternative-sorting1311/1)