# MATSETZERO

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Set Matrix Zeroes

Given an `N x M` integer matrix, if an element is `0`, set its entire row and column to `0`s.

 **Note:**  You  **don’t need to repeat the process for new 0s that are formed**  during the operation.

See the following example:

## Function Declaration
### Function Name

$setZeroes$ – This function modifies the given matrix such that if any cell contains `0`, its entire row and column are set to `0`.

### Parameters
- $mat$ : A reference to a 2D integer matrix of size $N \times M$.
### Return Value
- This function does not return anything.
- The matrix $mat$ is modified in-place according to the rules.
## Constraints
- $1 \leq N, M \leq 1000$
- $0 \leq mat[i][j] \leq 1000$
### Input Format
- The first line contains two integers $N$ and $M$ — the number of rows and columns in the matrix.
- The next $N$ lines each contain $M$ space-separated integers representing the matrix elements.
### Output Format
- Output the modified matrix of size $N \times M$.
- Each row should be printed on a new line with space-separated integers.
### Sample 1:
Input
Output

```
3 3
4 6 0
8 2 1
3 1 5

```

```
0 0 0
8 2 0
3 1 0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T07:04:08.656Z  

```java
 public static void setZeroes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        boolean firstColZero = false;  // track if first column needs zero

        // First pass: mark rows and columns
        for (int i = 0; i < rows; i++) {
            if (mat[i][0] == 0) firstColZero = true;
            for (int j = 1; j < cols; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;  // mark row
                    mat[0][j] = 0;  // mark column
                }
            }
        }

        // Second pass: set zeros using marks
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
            if (firstColZero) {
                mat[i][0] = 0;
            }
        }
    }
```

---

[View on CodeChef](https://www.codechef.com/problems/MATSETZERO)