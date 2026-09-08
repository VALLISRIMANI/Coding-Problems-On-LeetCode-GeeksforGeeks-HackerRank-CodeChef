# N-Queen Problem

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

The N-Queens puzzle is the problem of placing N queens on an N * N chessboard such that no two queens attack each other. Two queens attack each other if they are placed in the same row, the same column, or the same diagonal.

Given an integer  **n** representing the number of queens, find all distinct solutions to this puzzle. Each solution should be represented as an array of size n, where the **ith**  element (1-based indexing) denotes the column position of the queen placed in the  **ith** row.

 **Note:**  You may return the solutions in any order.

 **Examples:** 

```
Input: n = 1
Output: [1]
Explanation: Only one queen can be placed in the single cell available.
```

```
Input: n = 4
Output: [[2, 4, 1, 3], [3, 1, 4, 2]]
Explanation: There are 2 possible solutions for n = 4.

```

```
Input: n = 3
Output: []
Explanation: There are no possible solutions for n = 3.
```

**Constraints:
**1 ≤ n ≤ 10

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T07:13:13.368Z  

```java
class Solution {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        int[] board = new int[n];

        backtrack(0, n, board);

        return result;
    }
    
    private void backtrack(int row, int n, int[] board) {
        if (row == n) {
            ArrayList<Integer> solution = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                solution.add(board[i] + 1);
            }

            result.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board)) {
                board[row] = col;
                backtrack(row + 1, n, board);
            }
        }
    }

    private boolean isSafe(int row, int col, int[] board) {
        for (int previousRow = 0; previousRow < row; previousRow++) {
            int previousCol = board[previousRow];

            if (previousCol == col) {
                return false;
            }
            
            if (Math.abs(previousRow - row) == Math.abs(previousCol - col)) {
                return false;
            }
        }

        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/n-queen-problem0315/1)