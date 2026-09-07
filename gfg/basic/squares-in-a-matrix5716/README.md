# Squares in a Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a  **mxn**  matrix, count the number of squares in the matrix.

 **Examples:** 

```
Input: m = 2, n = 2
Output: 5
Explanation: There are a total of 5 squares in a 2 *2 matrix. Four 1* 1 squares and one 2*2 square.
```

```
Input: m = 4, n = 3
Output: 20
Explanation: There are a total of 20 squares in a 4*3 matrix. 
```

 **Constraints:** 
1 <= m,n <= 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T16:09:25.454Z  

```java
class Solution {
    public int squaresInMatrix(int m, int n) {
        // code here
        int total = 0;
        int minSide = Math.min(m, n);

        for (int k = 1; k <= minSide; k++) {
           total += (m - k + 1) * (n - k + 1);
        }

        return total;
    }
};

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/squares-in-a-matrix5716/1)