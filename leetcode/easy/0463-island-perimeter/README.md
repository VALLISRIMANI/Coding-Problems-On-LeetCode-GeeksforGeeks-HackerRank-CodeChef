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
**Runtime:** 8 ms (beats 20.29%)  
**Memory:** 47.1 MB (beats 64.38%)  
**Submitted:** 2026-10-18T16:06:31.972Z  

```java
class Solution {
    public int islandPerimeter(int[][] grid) {
        int land = 0;
        int shared = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 1) {
                    land++;

                    if (i + 1 < rows && grid[i + 1][j] == 1)
                        shared++;

                    if (j + 1 < cols && grid[i][j + 1] == 1)
                        shared++;
                }
            }
        }

        return land * 4 - shared * 2;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/island-perimeter/)