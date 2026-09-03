# Non-Overlapping Intervals

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a 2D array **intervals[][]**  of size n, where  **intervals[i] = [starti, endi].** Return the **minimum**  number of intervals you need to remove to make the rest of the intervals non-overlapping.

 **Note:** Two intervals are considered non-overlapping if the end time of one interval is less than or equal to the start time of the next interval.

 **Examples:** 

```
Input: intervals[][] = [[1, 2], [2, 3], [3, 4], [1, 3]]
Output: 1
Explanation: [1, 3] can be removed and the rest of the intervals are non-overlapping.
```

```
Input: intervals[][] = [[1, 3], [1, 3], [1, 3]]
Output: 2
Explanation: You need to remove two [1, 3] to make the rest of the intervals non-overlapping.
```

```
Input: intervals[][] = [[1, 2], [5, 10], [18, 35], [40, 45]]
Output: 0
Explanation: All intervals are already non-overlapping.

```

 **Constraints:** 
1 ≤ n ≤  105
0 ≤ starti < endi ≤ 5*104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T05:58:34.577Z  

```java
class Solution {
    public int minRemoval(int intervals[][]) {
        // code here
        Arrays.sort(intervals, (a, b) -> (a[1] - b[1]));
        
        int count = 0;
        int previousEnd = intervals[0][1];
        
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < previousEnd) {
                count++;
            } else {
                previousEnd = intervals[i][1];
            }
        }
        
        return count++;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/non-overlapping-intervals/1)