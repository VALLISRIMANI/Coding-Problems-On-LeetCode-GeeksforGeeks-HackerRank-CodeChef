# MATROTAPPLE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Rotting Apples

Given an `N x M` matrix where each cell can have one of three values:

- 0 representing an empty cell,
- 1 representing a fresh apple, or
- 2 representing a rotten apple.

Every minute, any fresh apple that is `4`-directionally adjacent to a rotten apple becomes rotten.

`4`-directionally adjacent cells of a cell  *(i, j)*  are cell  *(i - 1, j)*,  *(i + 1, j)*,  *(i, j - 1)*  and  *(i, j + 1)*.

Find the minimum number of minutes that must elapse until no cell has a fresh apple. If this is impossible, return -1.

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the input matrix.
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line, the minimum number of minutes that must elapse until no cell has a fresh apple. If this is impossible, output -1.
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are either 0, 1 or 2.
### Sample 1:
Input
Output

```
3 4
0 2 1 1  
1 1 0 1 
1 1 0 1
```

```
4
```

### Explanation:

There is a rotten apple in cell (0, 1) (assuming 0-based indexing).

After 1 minute: fresh apples in cells (0, 2) and (1, 1) gets rotten.

After 2 minutes: fresh apples in cells (0, 3), (1, 0) and (2, 1) gets rotten.

After 3 minutes: fresh apples in cells (2, 0) and (1, 3) gets rotten.

After 4 minutes: the last fresh apple in cell (2, 3) gets rotten.

Hence it takes minimum 4 minutes to rot all apples.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T07:16:20.232Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    // Complete the below function
     int solve(int[][] mat, int n, int m) {

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        // Step 1: Count fresh apples & push all rotten apples into queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 2) {
                    q.add(new int[]{i, j});
                }

                if (mat[i][j] == 1)
                    fresh++;
            }
        }

        // If no fresh apples → answer is 0
        if (fresh == 0) return 0;

        int minutes = 0;
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        // Step 2: BFS
        while (!q.isEmpty()) {
            int size = q.size();
            boolean rottenThisMinute = false;

            for (int k = 0; k < size; k++) {
                int[] cur = q.poll();
                int x = cur[0], y = cur[1];

                for (int[] d : dirs) {
                    int nx = x + d[0];
                    int ny = y + d[1];

                    // Convert fresh apple to rotten
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && mat[nx][ny] == 1) {
                        mat[nx][ny] = 2;  // make it rotten
                        fresh--;          // reduce fresh count
                        rottenThisMinute = true;
                        q.add(new int[]{nx, ny});
                    }
                }
            }

            // Only increase minutes if at least one apple became rotten
            if (rottenThisMinute)
                minutes++;
        }

        // If any fresh apples remain → impossible
        return fresh == 0 ? minutes : -1;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                mat[i][j] = sc.nextInt();

        // Create object to call non-static solve
        Codechef obj = new Codechef();

        int ans = obj.solve(mat, n, m);

        System.out.println(ans);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATROTAPPLE)