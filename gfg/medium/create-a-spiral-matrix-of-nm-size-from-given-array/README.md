# Create a spiral matrix of N*M size from given array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two positive integers  **n** and  **m**, and an integer array  **arr** [] containing total (**n*m)**  elements. Return a 2D matrix of dimensions  **n x m**  by filling it in a clockwise spiral order using the elements from the given array.

 **Examples:** 

```
Input: n = 4, m = 4, arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
Output: [[1, 2, 3, 4],
        [12, 13, 14, 5],
        [11, 16, 15, 6],
        [10, 9, 8, 7]]
```

```
Input: n = 3, m = 4, arr[] =[1, 8, 6, 3, 8, 6, 1, 6, 3, 2, 5, 3]
Output: [[1, 8, 6, 3],
        [2, 5, 3, 8],
        [3, 6, 1, 6]]

```

```
Input: n = 2, m = 2, arr[] =[1, 8, 6, 3]
Output: [[1, 8],
        [3, 6]]
```

 **Constraints:** 
1 ≤ n, m ≤ 103
arr.size() = n x m
1 ≤ arr[i] ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:23:11.462Z  

```java
class Solution {
    public int[][] spiralFill(int n, int m, int[] arr) {
        // code here
        int[][] matrix = new int[n][m];
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        int idx = 0;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++)  matrix[top][j] = arr[idx++];
            top++;

            for (int i = top; i <= bottom; i++) matrix[i][right] = arr[idx++];
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) matrix[bottom][j] = arr[idx++];
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) matrix[i][left] = arr[idx++];
                left++;
            }
        }

        return matrix;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/create-a-spiral-matrix-of-nm-size-from-given-array/1)