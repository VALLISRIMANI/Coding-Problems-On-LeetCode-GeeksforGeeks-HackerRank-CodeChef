# Array Insert at Index

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an array  **arr** (0-based index) and two positive integer  **index**  and  **val.**  You need to insert an val at given index.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5], index = 5, val = 90
Output: 1 2 3 4 5 90
Explanation: 90 is inserted at index 5(0-based indexing). After inserting, array elements are like [1, 2, 3, 4, 5, 90].
```

```
Input: arr[] = [1, 2, 3, 4, 5], index = 2, val = 90
Output: [1, 2, 90, 3, 4, 5]
Explanation: 90 is inserted at index 2(0-based indexing). After inserting, array elements are like [1, 2, 90, 3, 4, 5].
```

 **Constraints:** 
  1 ≤arr.size() ≤ 105
  0 ≤ val, arr[i] ≤ 106
  0 ≤ index ≤ arr.size()

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T17:32:21.506Z  

```java
import java.util.*;

class Solution {
    public void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        // code here
        arr.add(index, val);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/array-insert-at-index/1)