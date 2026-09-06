# MATMAXSQ

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Path With Minimum Sum

Given a `N x M` matrix with non-negative integers, find the minimum sum of path cells from top left cell to bottom right cell. You can only move right or downward from any cell without exiting the matrix boundary.

For eg., in the following matrix :

Minimum path sum =  **13**  (highlighted cells are minimum path cells).

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the input matrix.
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line, the minimum sum of path cells from top left cell to bottom right cell
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are non-negative and won't exceed $1000$.
### Sample 1:
Input
Output

```
3 3
4 3 0
8 2 1
3 1 5

```

```
13
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T10:57:01.359Z  

```java
import java.util.Scanner;

public class Main {
    public static int minPathSum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int[][] dp = new int[m][n];
        
        dp[0][0] = mat[0][0];
        
        for(int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + mat[i][0];
        }
        
        for(int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + mat[0][j];
        }
        
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + mat[i][j];
            }
        }
        
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        assert (1 <= n && n <= 100);
        assert (1 <= m && m <= 100);

        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println(minPathSum(mat));
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATMAXSQ)