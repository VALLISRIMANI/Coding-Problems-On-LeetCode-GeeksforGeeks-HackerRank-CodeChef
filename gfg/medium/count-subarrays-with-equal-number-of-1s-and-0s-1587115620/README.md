# Subarrays with equal 1s and 0s

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  containing 0s and 1s. Count the number of subarrays having equal number of 0s and 1s.

 **Examples:** 

```
Input: arr[] = [1, 0, 0, 1, 0, 1, 1]
Output: 8
Explanation: The index range for the 8 sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), (4, 5),(2, 5), (0, 5), (1, 6)
```

```
Input: arr[] = [1, 1, 1, 1, 0]
Output: 1
Explanation: The index range for the subarray is (3,4).
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T05:37:42.074Z  

```java
class Solution {
    public int countSubarray(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int subarraysCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count -= 1;
            if (arr[i] == 1) count += 1;

            if (map.containsKey(count)) {
                subarraysCount += map.get(count);
            }
            
            map.put(count, map.getOrDefault(count, 0) + 1);
        }
        
        return subarraysCount;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-subarrays-with-equal-number-of-1s-and-0s-1587115620/1)