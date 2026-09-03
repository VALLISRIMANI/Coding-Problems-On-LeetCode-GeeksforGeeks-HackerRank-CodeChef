# Insert Interval

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Geek has an array of non-overlapping intervals  **intervals[][]**  where  **intervals[i]**  =  **[starti, endi]**  represent the start and the end of the  **ith**  event and intervals is sorted in  **ascending**  order by  **starti**. He wants to add a new interval  **newInterval[]** = **[newStart, newEnd]**  where newStart and newEnd represent the start and end of this interval.
Help Geek to  **insert** newInterval into intervals such that intervals is still sorted in ascending order by  **starti**  and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

 **Examples:** 

```
Input: intervals[][] = [[1, 3], [4, 5], [6, 7], [8, 10]], newInterval[] = [5, 6]
Output: [[1, 3], [4, 7], [8, 10]]
Explanation: The newInterval [5, 6] overlaps with [4, 5] and [6, 7]. So, they are merged into one interval [4, 7].

```

```
Input: intervals[][] = [[1, 2], [3, 5], [6, 7], [8, 10], [12, 16]], newInterval[] = [4, 9]
Output: [[1, 2], [3, 10], [12, 16]]
Explanation: The new interval [4, 9] overlaps with [3, 5], [6, 7] and [8, 10]. So, they are merged into one interval [3, 10].
```

 **Constraints:** 
1 ≤ intervals.size() ≤  105
0 ≤ starti ≤ endi ≤ 109
0 ≤ newStart ≤ newEnd ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T04:54:57.975Z  

```java
class Solution {
    public ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        int n = intervals.length;
        ArrayList<int[]> result = new ArrayList<>();
        
        int i = 0;
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        
        int start = newInterval[0], end = newInterval[1];
        
        while (i < n && intervals[i][0] <= end) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        
        result.add(new int[]{start, end});
        
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }
        
        return result;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/insert-interval-1666733333/1)