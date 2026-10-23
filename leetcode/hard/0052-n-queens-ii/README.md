# N-Queens II

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

The  **n-queens**  puzzle is the problem of placing `n` queens on an `n x n` chessboard such that no two queens attack each other.

Given an integer `n`, return  *the number of distinct solutions to the  **n-queens puzzle***.

 

 **Example 1:** 

```
Input: n = 4
Output: 2
Explanation: There are two distinct solutions to the 4-queens puzzle as shown.

```

 **Example 2:** 

```
Input: n = 1
Output: 1

```

 

 **Constraints:** 

- 1 <= n <= 9

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 8.09%)  
**Memory:** 42.8 MB (beats 10.10%)  
**Submitted:** 2026-10-23T08:48:51.399Z  

```java
class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        HashSet<Integer> columns = new HashSet<>();
        HashSet<Integer> diagonal1 = new HashSet<>();
        HashSet<Integer> diagonal2 = new HashSet<>();

        backtrack(0, n, columns, diagonal1, diagonal2);

        return count;
    }

    private void backtrack(
        int row,
        int n,
        HashSet<Integer> columns,
        HashSet<Integer> diagonal1,
        HashSet<Integer> diagonal2
    ) {

        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {

            if (columns.contains(col) ||
                diagonal1.contains(row - col) ||
                diagonal2.contains(row + col)) {

                continue;
            }

            columns.add(col);
            diagonal1.add(row - col);
            diagonal2.add(row + col);

            backtrack(
                row + 1,
                n,
                columns,
                diagonal1,
                diagonal2
            );

            columns.remove(col);
            diagonal1.remove(row - col);
            diagonal2.remove(row + col);
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/n-queens-ii/)