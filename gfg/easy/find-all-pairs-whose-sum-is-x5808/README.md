# All Pairs with Sum from 2 Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two unsorted arrays  **a[]**   and b **[]**, the task is to find all pairs whose sum equals  **x**  from both arrays.

Note: All pairs should be returned in increasing order of u. For eg. for two pairs (u1,v1) and (u2,v2), if u1 < u2 then (u1,v1) should be returned first else second.

 **Examples:** 

```
Input: target = 9, a[] = [1, 2, 4, 5, 7], b[] = [5, 6, 3, 4, 8]
Output: 
1 8
4 5 
5 4
Explanation: (1, 8), (4, 5), (5, 4) are the pairs which sum to 9.

```

```
Input: target = 8, a[] = [-1, -2, 4, -6, 5, 7], b[] = [6, 3, 4, 0]
Output:
4 4 
5 3

```

```
Input: target = 9, a[] = [1, 2, 4, 5, 7, 4], b[] = [5, 6, 3, 4, 8, 4]
Output:
1 8
4 5
4 5
5 4
5 4
Explanation: (1, 8), (4, 5), (4, 5), (5, 4) and (5, 4) are the pairs which sum to 9.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-15T14:58:27.336Z  

```java
/*
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
*/

class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        // code here
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr2) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<pair> result = new ArrayList<>();
        for (int u : arr1) {
            int v = target - u;
            if (freq.containsKey(v)) {
                int count = freq.get(v);
                
                for (int i = 0; i < count; i++) {
                    result.add(new pair(u, v));
                }
            }
        }

        result.sort((p1, p2) -> Long.compare(p1.first, p2.first));

        return result.toArray(new pair[result.size()]);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1)