# MATMEDIAN

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Median in Matrix

Given a `N x M` row-wise sorted matrix, find the median of the matrix. (*Note:*  `N*M` is always odd)

For eg., in the following matrix:

If we place all elements in the sorter order: 2 3 4 4 4 5 6 6 7

Then the median of the matrix is: `4`

 **Follow up:**  Can you solve it in better time than  **O(NMlog(NM))**  and without taking extra space ?

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the input matrix.
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line, the median of the matrix.
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are non-negative and won't exceed $1000$.
- The elements in each row are sorted in non-decreasing order.
- N*M is always odd
### Sample 1:
Input
Output

```
3 3
3 4 5
2 4 6
4 6 7
```

```
4
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T13:50:30.988Z  

```java
import java.util.Scanner;

public class Main {
    
    public static int countElementsSmallerThanMid(int[] row, int midValue) {
        int lowIndex = 0, highIndex = row.length - 1;
        while (lowIndex <= highIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;
            if (row[middleIndex] <= midValue) {
                lowIndex = middleIndex + 1;
            } else {
                highIndex = middleIndex - 1;
            }
        }
        return lowIndex;
    }

    public static int findMedianValue(int[][] matrix) {
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;
        
        int lowValue = Integer.MAX_VALUE;
        int highValue = Integer.MIN_VALUE;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                lowValue = Math.min(lowValue, matrix[i][j]);
                highValue = Math.max(highValue, matrix[i][j]);
            }
        }

        while (lowValue <= highValue) {
            int midValue = (lowValue + highValue) / 2;
            int count = 0;
            for (int i = 0; i < rowCount; i++) {
                count += countElementsSmallerThanMid(matrix[i], midValue);
            }
            if (count <= (rowCount * columnCount) / 2) {
                lowValue = midValue + 1;
            } else {
                highValue = midValue - 1;
            }
        }
        return lowValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println(findMedianValue(mat));

        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATMEDIAN)