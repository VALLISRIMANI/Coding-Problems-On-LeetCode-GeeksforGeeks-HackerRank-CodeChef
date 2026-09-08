# MATMAXISLAND

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Maximum Area Island

Given is a `N x M` binary matrix which represents islands. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

The area of an island is the number of cells with a value `1` in the island.

Return the maximum area of an island in matrix. If there is no island, return `0`.

For eg., in the following matrix:

Maximum area of island is:  **5**  (lands are highlighted in maximum area island).

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the matrix.
- Next $N$ lines containing $M$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line the maximum area of the island.
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are either 0 or 1.
### Sample 1:
Input
Output

```
3 3
0 1 1
0 1 1
0 1 1
```

```
6
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T07:14:22.442Z  

```java
import java.util.Scanner;

public class Main {
    public static int areaOfIsland(int[][] mat, int i, int j, int n, int m) {
        if (i >= 0 && i < n && j >= 0 && j < m && mat[i][j] == 1) {
            mat[i][j] = 0;
            return 1 + areaOfIsland(mat, i + 1, j, n, m) + areaOfIsland(mat, i - 1, j, n, m)
                   + areaOfIsland(mat, i, j - 1, n, m) + areaOfIsland(mat, i, j + 1, n, m);
        }
        return 0;
    }

    public static int maxAreaOfIsland(int[][] mat, int n, int m) {
        int max_area = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1)
                    max_area = Math.max(max_area, areaOfIsland(mat, i, j, n, m));
            }
        }
        return max_area;
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

        System.out.println(maxAreaOfIsland(mat, n, m));
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATMAXISLAND)