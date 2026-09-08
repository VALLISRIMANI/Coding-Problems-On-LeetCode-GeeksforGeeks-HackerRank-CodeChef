# N-Queens

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

The  **n-queens**  puzzle is the problem of placing `n` queens on an `n x n` chessboard such that no two queens attack each other.

Given an integer `n`, return  *all distinct solutions to the  **n-queens puzzle***. You may return the answer in  **any order**.

Each solution contains a distinct board configuration of the n-queens' placement, where `'Q'` and `'.'` both indicate a queen and an empty space, respectively.

 

 **Example 1:** 

```
Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above

```

 **Example 2:** 

```
Input: n = 1
Output: [["Q"]]

```

 

 **Constraints:** 

- 1 <= n <= 9

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 10.98%)  
**Memory:** 47.4 MB (beats 5.07%)  
**Submitted:** 2026-09-08T07:11:12.121Z  

```java
class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        HashSet<Integer> columns = new HashSet<>();
        HashSet<Integer> diagonal1 = new HashSet<>();
        HashSet<Integer> diagonal2 = new HashSet<>();

        backtrack(0, n, board, columns, diagonal1, diagonal2);

        return result;
    }

    private void backtrack(
        int row,
        int n,
        char[][] board,
        HashSet<Integer> columns,
        HashSet<Integer> diagonal1,
        HashSet<Integer> diagonal2
    ) {
        if (row == n) {
            List<String> solution = new ArrayList<>();

            for (char[] r : board) {
                solution.add(new String(r));
            }

            result.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (columns.contains(col) ||
                diagonal1.contains(row - col) ||
                diagonal2.contains(row + col)) {

                continue;
            }

            board[row][col] = 'Q';

            columns.add(col);
            diagonal1.add(row - col);
            diagonal2.add(row + col);

            backtrack(
                row + 1,
                n,
                board,
                columns,
                diagonal1,
                diagonal2
            );

            board[row][col] = '.';

            columns.remove(col);
            diagonal1.remove(row - col);
            diagonal2.remove(row + col);
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/n-queens/)