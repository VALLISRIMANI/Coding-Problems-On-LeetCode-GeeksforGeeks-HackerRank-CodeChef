# Transpose of a Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a 2-dimensional NumPy array  **arr**, find and return its transpose.

### Example:

```
Input: arr = np.array([[1, 2], [3, 4], [5, 6]])
Output: array([[1, 3, 5], [2, 4, 6]])
Explanation: The transpose of the matrix [[1, 2], [3, 4], [5, 6]] is [[1, 3, 5], [2, 4, 6]].
```

```
Input: arr = np.array([[7, 8, 9], [10, 11, 12]])
Output: array([[7, 10], [8, 11], [9, 12]])
Explanation: The transpose of the matrix [[7, 8, 9], [10, 11, 12]] is [[7, 10], [8, 11], [9, 12]].
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:39:41.607Z  

```py
class Solution:
    def transposeMatrix(self, arr):
        # code here
        return arr.T
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/transpose-of-a-matrix/1)