# Strongest Neighbour

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an array  **arr[]**  consisting of positive integers. Return the maximum of all adjacent pairs in the array.

 **Examples:** 

```
Input: arr[] = [1, 2, 2, 3, 4, 5]
Output: [2, 2, 3, 4, 5]
Explanation: Maximum of arr[0] and arr[1] is 2, that of arr[1] and arr[2] is 2,... and so on.
```

```
Input: arr[] = [5, 5]
Output: [5]
Explanation: We only have two elements so max of 5 and 5 is 5 only.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T15:18:24.545Z  

```java
class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length - 1; i++) {
            result.add(Math.max(arr[i], arr[i + 1]));
        }
        
        return result;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/strongest-neighbour/1)