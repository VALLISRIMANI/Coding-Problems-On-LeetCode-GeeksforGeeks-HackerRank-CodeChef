# Minimum Steps to Reach Last Column from First

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an  **n × n**  binary matrix  **mat[][]**, where:

- 0 represents an empty cell.
- 1 represents a blocked cell.

Find the minimum steps required to reach any empty cell in the last column starting from any empty cell in the first column. From a cell, you can move to any of its four adjacent cells (up, down, left, or right) provided the destination cell is empty.

If it is not possible to reach, return -1.

 **Examples:** 

```
Input: mat[][] = [[0 0 1], [1 0 0], [0 0 0]]
Output: 2
Explanation: Start from cell (2, 0) and move to (2, 1) and then (2, 2). Thus, the minimum number of steps required is 2.

```

```
Input: mat[][] = [[1 0], [0 1]]
Output:-1
Explanation: There is no path from any empty cell in the first column to any empty cell in the last column.

```

**Constraints:
**1 ≤ matrix.size() ≤ 103
0 ≤ matrix[i][j] ≤ 1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T12:28:20.423Z  

```java
class Solution {
    public int minSteps(int[][] mat) {
        // code here
        int n = mat.length;

        int[][] directions = {
            {-1, 0}, {0, -1}, {0, 1}, {1, 0}
        };

        Queue<int[]> queue = new LinkedList<>();
        for (int row = 0; row < n; row++) {
            if (mat[row][0] == 0) {
                queue.offer(new int[]{row, 0, 0});
                mat[row][0] = 1;
            }
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            int row = current[0];
            int col = current[1];
            int distance = current[2];

            if (col == n - 1) {
                return distance;
            }

            for (int[] direction : directions) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && mat[newRow][newCol] == 0) {
                    queue.offer(new int[]{newRow, newCol, distance + 1});
                    mat[newRow][newCol] = 1;
                }
            }
        }

        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-steps-to-reach-last-column-of-binary-matrix/1)