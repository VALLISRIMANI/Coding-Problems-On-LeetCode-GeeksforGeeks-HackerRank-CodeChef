# Kth of spiral matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a matrix  **mat[][]**  and a number k, find the  **k-th**  element obtained while traversing the matrix in spiral order.

 **Note:**  Spiral traversal follows a pattern where we move left to right on the top row, top to bottom on the last column, right to left on the bottom row, and bottom to top on the first column, repeating this process for the inner layers until all elements are visited.

 **Examples**  **:** 

```
Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]], k = 10
Output: 13
Explanation:
 
The spiral order of matrix will look like 1->2->3->4->8->12->16->15->14->13->9->5->6->7->11->10. So the 10th element in this order is 13. 
```

```
Input: mat[][] = [[1, 2, 3], [4, 5, 6], [7, 8, 9]], k = 4
Output: 6
Explanation: The spiral order of matrix will look like 1->2->3->6->9->8->7->4->5. So the 4th element in this order is 6.
```

 **Constraints:** 
1<=n,m<=103
1<=k<=n*m
-109 <= A[i][j] <= 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:47:09.443Z  

```java
class Solution {
    public int findK(int[][] mat, int k) {
        // code here
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length -1;
        int count = 0;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++)  {
                count++;
                if (count == k) return mat[top][j];
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                count++;
                if (count == k) return mat[i][right];
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    count++;
                    if (count == k) return mat[bottom][j];
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    count++;
                    if (count == k) return mat[i][left];
                }
                left++;
            }
        }

        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-nth-element-of-spiral-matrix/1)