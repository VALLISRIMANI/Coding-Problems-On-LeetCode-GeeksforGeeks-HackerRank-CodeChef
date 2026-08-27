# Total Cuts

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array  **a[]**  of  **n**  integers and an integer  **k**, find the total number of cuts that you can make such that for each cut these two conditions are satisfied

- A cut divides into two parts of non-zero lengths. 
- Sum of the largest in the left part and the smallest in the right part is greater than or equal to k.

 **Examples :** 

```
Input: a[] = [1, 2, 3], k = 3
Output: 2
Explanation: Two ways in which array is divided to satisfy above conditions are:
[1] and [2, 3] -> 1 + 2 ≥ 3 (satisfies the condition)
[1,2] and [3] -> 2 + 3 ≥ 3 (satisfies the condition)
```

```
Input: a[] = [1, 2, 3, 4, 5], k = 5
Output: 3
Explanation:
[1, 2] and [3, 4, 5] -> 2 + 3 ≥ 5
[1, 2, 3] and [4, 5] -> 3 + 4 ≥ 5
[1, 2, 3, 4] and [5] -> 4 + 5 ≥ 5
```

 **Constraints:** 
1 ≤ n ≤ 106
0 ≤ k ≤ 106
0 ≤ a[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T06:15:26.787Z  

```java
class Solution {
    public int totalCuts(ArrayList<Integer> a, int k) {
        // code here
        int n = a.size();
        
        if (n < 2) return 0;
        
        int[] suffixMin = new int[n + 1];
        suffixMin[n - 1] = a.get(n - 1);
        
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], a.get(i));
        }
        
        int count = 0, leftMax = a.get(0);
        
        for (int i = 0; i < n - 1; i++) {
            leftMax = Math.max(leftMax, a.get(i));
            int rightMin = suffixMin[i + 1];
            
            if (leftMax + rightMin >= k) {
                count++;
            }
        }
        
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/total-cuts--170648/1)