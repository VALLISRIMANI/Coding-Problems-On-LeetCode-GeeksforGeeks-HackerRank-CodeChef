# Longest subarray with Atmost two distinct integers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]** consisting of positive integers, your task is to find the length of the  **longest**  subarray that contains at most **two distinct** integers.

 **Examples:** 

```
Input: arr[] = [2, 1, 2]
Output: 3
Explanation: The entire array [2, 1, 2] contains at most two distinct integers (2 and 1). Hence, the length of the longest subarray is 3.
```

```
Input: arr[] = [3, 1, 2, 2, 2, 2]
Output: 5
Explanation: The longest subarray containing at most two distinct integers is [1, 2, 2, 2, 2], which has a length of 5.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:04:50.967Z  

```java
class Solution {
    public int totalElements(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = Integer.MIN_VALUE;
        int left = 0, right = 0, n = arr.length;
        
        while (right < n) {
            int num = arr[right];
            
            map.put(num, map.getOrDefault(num, 0) + 1);
            
            while (map.size() > 2) {
                int number = arr[left];
                map.put(number, map.get(number)- 1);
                
                if (map.get(number) == 0) {
                    map.remove(number);
                }
                
                left++;
            }
            
            if (map.size() <= 2) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            
            
            right++;
        }
        
        return maxLen == Integer.MIN_VALUE ? 0 : maxLen;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-subarray-with-atmost-two-distinct-integers/1)