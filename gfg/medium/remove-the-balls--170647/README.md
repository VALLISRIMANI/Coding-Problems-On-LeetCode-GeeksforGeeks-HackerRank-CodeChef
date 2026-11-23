# Remove Consecutive Similar Balls

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two arrays  **color[]**  and  **radius[]**, representing a sequence of balls:

- color[i] is the color of the i-th ball.
- radius[i] is the radius of the i-th ball.

If two consecutive balls have the same color and radius, remove them both. Repeat this process until no more such pairs exist.

Return the number of balls remaining after all possible removals.

 **Examples:** 

```
Input: color[] = [2, 3, 5], radius[] = [3, 3, 5]
Output: 3
Explanation: All the 3 balls have different colors and radius.
```

```
Input: color[] = [2, 2, 5], radius[] = [3, 3, 5]
Output: 1
Explanation: First ball and second ball have same color 2 and same radius 3. So, after removing only one ball is left. It cannot be removed from the array. Hence, the final array has length 1.                                                                                                                           
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T16:48:42.205Z  

```java
class Solution {
    public int findLength(int[] color, int[] radius) {
        // code here
        int n = color.length;
        List<Integer> stackColor = new ArrayList<>();
        List<Integer> stackRadius = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int c = color[i];
            int r = radius[i];
            int size = stackColor.size();

            if (size > 0 && stackColor.get(size - 1) == c && stackRadius.get(size - 1) == r) {
                stackColor.remove(size - 1);
                stackRadius.remove(size - 1);
            } else {
                stackColor.add(c);
                stackRadius.add(r);
            }
        }

        return stackColor.size();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-the-balls--170647/1)