# Maximal Rectangle

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a `rows x cols` binary `matrix` filled with `0`'s and `1`'s, find the largest rectangle containing only `1`'s and return  *its area*.

 

 **Example 1:** 

```
Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 6
Explanation: The maximal rectangle is shown in the above picture.

```

 **Example 2:** 

```
Input: matrix = [["0"]]
Output: 0

```

 **Example 3:** 

```
Input: matrix = [["1"]]
Output: 1

```

 

 **Constraints:** 

- rows == matrix.length
- cols == matrix[i].length
- 1 <= rows, cols <= 200
- matrix[i][j] is '0' or '1'.

## Solution

**Language:** Java  
**Runtime:** 18 ms (beats 78.55%)  
**Memory:** 49.6 MB (beats 73.46%)  
**Submitted:** 2026-08-17T15:41:17.606Z  

```java
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] height = new int[columns];
        int maxArea = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == '0') {
                    height[j] = 0;
                } else {
                    height[j] += 1;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(height));
        }
        
        return maxArea;
    }
    
    static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int[] extended = Arrays.copyOf(heights, heights.length + 1);

        for (int i = 0; i < extended.length; i++) {
            while (!stack.isEmpty() && extended[i] < extended[stack.peek()]) {
                int height = extended[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximal-rectangle/)