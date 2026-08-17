# Spiral Matrix II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a positive integer `n`, generate an `n x n` `matrix` filled with elements from `1` to `n2` in spiral order.

 

 **Example 1:** 

```
Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]

```

 **Example 2:** 

```
Input: n = 1
Output: [[1]]

```

 

 **Constraints:** 

- 1 <= n <= 20

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.9 MB (beats 63.14%)  
**Submitted:** 2026-08-17T09:20:35.570Z  

```java
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n -1;
        int value = 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++)  matrix[top][j] = value++;
            top++;

            for (int i = top; i <= bottom; i++) matrix[i][right] = value++;
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) matrix[bottom][j] = value++;
                bottom--;
            }
            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) matrix[i][left] = value++;
                left++;
            }
        }

        return matrix;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/spiral-matrix-ii/)