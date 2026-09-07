# Swapping Triangles in Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a square matrix  **mat[][]**  of size  **n × n**, swap every element above the primary diagonal with its corresponding element below the primary diagonal. The elements on the primary diagonal remain unchanged.

 **Examples :** 

```
Input: mat = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Output: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
Explanation: Swapping mat[0][1] with mat[1][0], mat[0][2] with mat[2][0] and mat[1][2] with mat[2][1].

```

```
Input: mat= [[2, 7, 3, 1],[10, 1, 5, 1], [10, 4, 7, 6],[6, 9, 1, 8]]
Output: [[2, 10, 10, 6], [7, 1, 4, 9], [3, 5, 7, 1], [1, 1, 6, 8]]
Explanation: Swap each element above the primary diagonal with its corresponding element below the primary diagonal. 

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T16:10:46.144Z  

```java
class Solution {
    void swapTriangle(int mat[][]) {
        // code here
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               int temp = mat[i][j];
               mat[i][j] = mat[j][i];
               mat[j][i] = temp;
            }
        }
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/swapping-triangles5209/1)