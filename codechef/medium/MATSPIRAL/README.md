# MATSPIRAL

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print Matrix In Spiral Fashion

Given an `N x M` integer matrix, print its element in spiral fashion (clockwise).

See the following example:

Output should be: 1 2 3 4 8 12 11 10 9 5 6 7

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the input matrix.
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output on $N*M$ space separated integers, the elements of input matrix in spiral fashion.
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are non-negative and won't exceed $1000$.
### Sample 1:
Input
Output

```
3 4
1 2 3 4
5 6 7 8
9 10 11 12

```

```
1 2 3 4 8 12 11 10 9 5 6 7
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T16:11:46.385Z  

```java
import java.util.Scanner;

public class Main {
    public static void spiralmatValues(int[][] mat, int n, int m) {
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        int direction = 1;

        while (top <= bottom && left <= right) {
            if (direction == 1) {
                for (int i = left; i <= right; i++) 
                    System.out.print(mat[top][i] + " ");
                direction = 2;
                top++;
            } else if (direction == 2) {
                for (int i = top; i <= bottom; i++) 
                    System.out.print(mat[i][right] + " ");
                direction = 3;
                right--;
            } else if (direction == 3) {
                for (int i = right; i >= left; i--) 
                    System.out.print(mat[bottom][i] + " ");
                direction = 4;
                bottom--;
            } else if (direction == 4) {
                for (int i = bottom; i >= top; i--) 
                    System.out.print(mat[i][left] + " ");
                direction = 1;
                left++;
            }
        }
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

        spiralmatValues(mat, n, m);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATSPIRAL)