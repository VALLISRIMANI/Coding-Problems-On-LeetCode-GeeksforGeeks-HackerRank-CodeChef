# Mean of Range in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array  **arr[]**  and a 2D array  **queries[][]** of size  **q**. Each query queries[i] = [l, r] represents a subarray ranging from index l to r (inclusive). For every query, compute the mean (average) of the elements in the specified range, and return the floor value of that mean.

Return an array where each element corresponds to the result of a query.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5], queries[][] = [[0, 2], [1, 3], [0, 4]]
Output: [2, 3, 3]
Explanation: The array is [1, 2, 3, 4, 5].
Query 1: l = 0, r = 2 -> subarray [1, 2, 3] -> sum = 6 -> mean = 6/3 = 2
Query 2: l = 1, r = 3 -> subarray [2, 3, 4] -> sum = 9 -> mean = 9/3 = 3
Query 3: l = 0, r = 4 -> subarray [1, 2, 3, 4, 5] -> sum = 15 -> mean = 15/5 = 3
Hence the answer is [2, 3, 3]
```

```
Input: arr[] = [6, 7, 8, 10], queries[][] = [[0, 3], [1, 2]]
Output: [7, 7]
Explanation: The array is [6, 7, 8, 10].
Query 1: l = 0, r = 3 -> subarray [6, 7, 8, 10] -> sum = 31 -> mean = 31/4 = 7 (floor value)
Query 1: l = 1, r = 2 -> subarray [7, 8] -> sum = 15 -> mean = 15/2 = 7 (floor value)
Hence the answer is [7, 7]
```

 **Constraints:**  
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 103
1 ≤ q ≤ 105
0 ≤ queries[i][0] ≤ queries[i][1] < arr.size()

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T05:32:34.142Z  

```java
class Solution {
    /* public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < queries.length; i++) {
            result.add(mean(arr, queries[i][0], queries[i][1]));
        }
        
        return result;
    }
    
    public int mean(int[] arr, int left, int right) {
        int sum = 0;
        
        for (int i = left; i <= right; i++) {
            sum += arr[i];
        }
        
        return (int)Math.floor(sum / (right - left + 1)); 
    } */
    
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        
        ArrayList<Integer> result = new ArrayList<>();
    
        int n = arr.length;
        long[] prefix = new long[n + 1];
    
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
    
        for (int[] q : queries) {
            int left = q[0];
            int right = q[1];
    
            long sum = prefix[right + 1] - prefix[left];
            int count = right - left + 1;
    
            result.add((int)(sum / count));
        }
    
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/mean-of-range-in-array2123/1)