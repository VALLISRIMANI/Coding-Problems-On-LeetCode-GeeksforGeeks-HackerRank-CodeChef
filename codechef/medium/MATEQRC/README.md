# MATEQRC

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Equal Rows and Columns

Given a `N x N` integer matrix, find the no. of pairs of row and column which are equal.

For eg. in the following matrix:

Number of equal pairs of row and columns is:  **2**  (Row 2 and column 2 are equal. Similarly, row 3 and column 3 are also equal)

### Input Format
- The first line of input will contain a single integer $N$, denoting the no. of rows and columns in the matrix.
- Next $N$ lines contains $N$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line the no. of pairs of row and columns which are equal.
### Constraints
- $1 \leq N \leq 100$
- The elements of the matrix are non-negative and won't exceed 1000.
### Sample 1:
Input
Output

```
4
9 0 0 3
0 1 1 5
0 1 1 5
8 5 5 1
```

```
4
```

### Explanation:

Row 2 and column 2 are equal.

Row 2 and column 3 are equal.

Row 3 and column 2 are equal.

Row 3 and column 3 are equal.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T10:56:40.628Z  

```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int equalPairs(int[][] mat) {
        int ans = 0;
        HashMap<String, Integer> mp = new HashMap<>();

        for (int i = 0; i < mat.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < mat[i].length; j++) {
                sb.append(mat[i][j]);
                sb.append(",");
            }
            mp.put(sb.toString(), mp.getOrDefault(sb.toString(), 0) + 1);
        }

        for (int i = 0; i < mat[0].length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < mat.length; j++) {
                sb.append(mat[j][i]);
                sb.append(",");
            }
            ans += mp.getOrDefault(sb.toString(), 0);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        assert (1 <= n && n <= 100);

        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println(equalPairs(mat));
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATEQRC)