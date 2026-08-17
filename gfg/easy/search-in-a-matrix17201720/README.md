# Search in a Row-Column Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a 2D integer matrix  **mat[][]**  of size  **n x m**, where every row and column is sorted in increasing order and a number  **x**, return  **true** if the element  **x**  is present in the matrix. Otherwise, return  **false**.

 **Examples:** 

```
Input: mat[][] = [[3, 30, 38], [20, 52, 54], [35, 60, 69]], x = 62
Output: false
Explanation: 62 is not present in the matrix, so output is false.

```

```
Input: mat[][] = [[18, 21, 27],  [38, 55, 67]], x = 55
Output: true
Explanation: 55 is present in the matrix.
```

```
Input: mat[][] = [[1, 2, 3], [4, 5, 6], [7, 8, 9]], x = 3
Output: true
Explanation: 3 is present in the matrix.

```

 **Constraints** :
1 ≤ n, m ≤ 103
1 ≤ mat[i][j] ≤ 109
1 ≤ x ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:09:10.511Z  

```java
class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // code here
        int n = mat.length, m = mat[0].length;
        
        int row = 0, col = m - 1;
        
        while (row < n && col >= 0) {
            if (mat[row][col] == x) return true;
            else if (mat[row][col] > x) col--;
            else row++;
        }
        
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/search-in-a-matrix17201720/1)