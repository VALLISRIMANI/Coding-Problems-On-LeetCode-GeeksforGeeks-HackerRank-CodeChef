# Overlapping Intervals

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of intervals  **arr[][]** of size n, where  **arr[i]**  =  **[starti, endi]**  represents the start and end points of the ith interval, merge all overlapping intervals and return the resulting array of non-overlapping intervals.
 **Note:** Two intervals [a, b] and [c, d] such that a ≤ c, are considered overlapping if  c ≤ b.

 **Examples:** 

```
Input: arr[][] = [[1, 3], [2, 4], [6, 8], [9, 10]]
Output: [[1, 4], [6, 8], [9, 10]]
Explanation: In the given intervals we have only two overlapping intervals here, [1, 3] and [2, 4] which on merging will become [1, 4]. Therefore we will return [[1, 4], [6, 8], [9, 10]].

```

```
Input: arr[][] = [[6, 8], [1, 9], [2, 4], [4, 7]]
Output: [[1, 9]]
Explanation: In the given intervals all the intervals overlap with the interval [1, 9]. Therefore we will return [1, 9].

```

 **Constraints:** 
1 ≤ n ≤ 105
0 ≤ starti ≤ endi ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T15:11:03.733Z  

```java
class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        result.add(new ArrayList<>(Arrays.asList(arr[0][0], arr[0][1])));
        
        for (int i = 1; i < arr.length; i++) {
            ArrayList<Integer> current = result.get(result.size() - 1);
            int[] next = arr[i];
            
            if (next[0] <= current.get(1)) {
                current.set(1, Math.max(current.get(1), next[1]));
            } else {
                result.add(new ArrayList<>(Arrays.asList(arr[i][0], arr[i][1])));
            }
        }
        
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/overlapping-intervals--170633/1)