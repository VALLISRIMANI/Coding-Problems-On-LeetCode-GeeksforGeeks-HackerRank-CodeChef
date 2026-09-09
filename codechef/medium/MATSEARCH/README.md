# MATSEARCH

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Search In Matrix

You are given an `N x M` integer matrix with the following properties:

- Each row of the matrix is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.

Given an integer `X`, determine whether it exists in the matrix.

Write a solution with a time complexity of  **O(log(NM))**.

### Input Format
- The first line of input will contain three space separated integers $N$, $M$ and $X$, denoting the no. of rows and columns in the input matrix along with the integer which needs to be searched in matrix.
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line YES if X exists in the the given matrix, else NO.
### Constraints
- $0 \leq N, M \leq 100$
- $0 \leq X \leq 100000$
- The elements of the matrix are non-negative and won't exceed $100000$.
- Each row of the matrix is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.
### Sample 1:
Input
Output

```
3 4 7
1 2 3 4
5 6 7 8
9 10 11 12

```

```
YES
```

### Sample 2:
Input
Output

```
3 4 7
1 2 3 4
5 6 6 8
9 10 11 12

```

```
NO
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T13:49:39.662Z  

```java
import java.util.Scanner;

public class Main {
    
    public static boolean searchInMatrix(int[][] matrix, int target) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        
        int start = 0, end = numRows * numCols - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = matrix[mid / numCols][mid % numCols];
            
            if (target == midElement)
                return true;
            else if (target < midElement)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        
        if (n == 0 || m == 0) {
            System.out.println("NO");
            return;
        }
        
        int[][] mat = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = scanner.nextInt();
                mat[i][j] = val;
            }
        }
        
        if (searchInMatrix(mat, x)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATSEARCH)