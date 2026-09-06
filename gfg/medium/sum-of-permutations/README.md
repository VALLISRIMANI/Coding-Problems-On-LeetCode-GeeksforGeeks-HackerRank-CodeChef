# Sum of Permutations of Distinct Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  containing distinct digits from 1 to 9, find the  **sum** of the numbers formed by all  **permutations** of the digits in arr[].

 **Examples :** 

```
Input: arr[] = [1, 2, 3]
Output: 1332 
Explanation: The possible permutations are 123, 132, 213, 231, 312, and 321. 
Hence, sum = 123 + 132 + 312 + 213 + 231 + 321 = 1332.
```

```
Input: arr[] = [1, 2]
Output: 33
Explanation: The possible permutations are 12, 21. Hence, sum = 12 + 21 = 33.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 5
1 ≤ arr[i] ≤ 9

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T07:52:43.184Z  

```java
class Solution {
    public int getSum(List<Integer> arr) {
        // code here
        boolean[] used = new boolean[arr.size()];
        return backtrack(arr, new StringBuilder(), used);
    }

    private int backtrack(List<Integer> arr, StringBuilder temp, boolean[] used) {
        if (temp.length() == arr.size()) {
            return Integer.parseInt(temp.toString());
        }

        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (used[i]) continue;
            
            used[i] = true;
            temp.append(arr.get(i));
            
            result += backtrack(arr, temp, used);
            
            temp.deleteCharAt(temp.length() - 1);
            used[i] = false;
        }
        
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-permutations/1)