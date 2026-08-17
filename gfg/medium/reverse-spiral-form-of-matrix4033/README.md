# Reverse Spiral Form of Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an  **n × m**  matrix, return its elements in  **reverse**   **spiral**  order.

 **Note:** Reverse spiral order starts from the center of the matrix (or the closest valid center for even dimensions) and moves outward in a spiral.

 **Examples :** 

```
Input: n = 3, m = 3 
 
Output: [5, 6, 3, 2, 1, 4, 7, 8, 9]
Explanation: Spiral form of the matrix in reverse order starts from the centre and goes outward.

```

```
Input: n = 4, m = 4
 
Output: [10, 11, 7, 6, 5, 9, 13, 14, 15, 16, 12, 8, 4, 3, 2, 1]
Explanation: 
  
```

 **Constraints:** 
1 ≤ n, m ≤ 500
1 ≤ mat[i][j] ≤ 500

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:28:36.211Z  

```java
class Solution {
    public List<Integer> reverseSpiral(int[][] mat) {
        // code here
        List<Integer> result = new ArrayList<>();
        if (mat.length == 0) return result;
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length -1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++)  result.add(mat[top][j]);
            top++;

            for (int i = top; i <= bottom; i++) result.add(mat[i][right]);
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) result.add(mat[bottom][j]);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)  result.add(mat[i][left]);
                left++;
            }
        }
        
        Collections.reverse(result);
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-spiral-form-of-matrix4033/1)