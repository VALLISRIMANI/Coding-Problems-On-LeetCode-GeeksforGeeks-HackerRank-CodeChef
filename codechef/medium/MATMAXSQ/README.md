# MATMAXSQ

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Maximal square of all ones

Given a `N x N` binary matrix, find the area of maximal square submatrix in it which has all 1s.

For eg. in the following matrix, the area of maximal submatrix with all 1's is:  **4**  (2x2 submatrix)

### Input Format
- The first line of input will contain a single integer $N$, denoting the no. of rows and columns in the binary matrix.
- Next $N$ lines contains $N$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line the area of maximal square submatrix having all 1's
### Constraints
- $1 \leq N \leq 100$
- The elements of the matrix are either 0 or 1.
### Sample 1:
Input
Output

```
3
0 1 0
0 1 1
0 1 1
```

```
4
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T16:11:30.773Z  

```java
import java.util.Scanner;

public class Main {
    public static int maximalSquare(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int maxside = 0;
        int[][] dp = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || mat[i][j] == 0) {
                    dp[i][j] = mat[i][j];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
                
                maxside = Math.max(maxside, dp[i][j]);
            }
        }
        
        return maxside * maxside;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        assert (1 <= n && n <= 100);

        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
                assert (mat[i][j] == 0 || mat[i][j] == 1);
            }
        }

        System.out.println(maximalSquare(mat));
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATMAXSQ)