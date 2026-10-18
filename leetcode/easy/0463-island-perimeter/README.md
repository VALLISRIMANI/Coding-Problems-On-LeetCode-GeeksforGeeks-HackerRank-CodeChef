# Island Perimeter

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given `row x col` `grid` representing a map where `grid[i][j] = 1` represents land and `grid[i][j] = 0` represents water.

Grid cells are connected  **horizontally/vertically**  (not diagonally). The `grid` is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

 

 **Example 1:** 

```
Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
Output: 16
Explanation: The perimeter is the 16 yellow stripes in the image above.

```

 **Example 2:** 

```
Input: grid = [[1]]
Output: 4

```

 **Example 3:** 

```
Input: grid = [[1,0]]
Output: 4

```

 

 **Constraints:** 

- row == grid.length
- col == grid[i].length
- 1 <= row, col <= 100
- grid[i][j] is 0 or 1.
- There is exactly one island in grid.

## Solution

**Language:** Java  
**Runtime:** 12 ms (beats 7.06%)  
**Memory:** 46.8 MB (beats 93.01%)  
**Submitted:** 2026-10-18T16:04:51.771Z  

```java
class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    for (int[] d : dir) {
                        int nr = i + d[0];
                        int nc = j + d[1];

                        if (nr < 0 || nc < 0 || nr >= grid.length || nc >= grid[0].length || grid[nr][nc] == 0) {
                            perimeter++;
                        }
                    }
                }
            }
        }

        return perimeter;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/island-perimeter/)