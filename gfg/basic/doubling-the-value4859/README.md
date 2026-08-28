# Doubling the value

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr**  and an integer  **b**, traverse the array (from the beginning) and if the element in array is b,  **double**  b and continue traversal. Find the value of b after the complete traversal.

 **Examples :** 

```
Input: b = 2, arr[] = [1, 2, 3, 4, 8]
Output: 16
Explanation: b is initially 2. We get 2 at the 1st index, hence b becomes 4. 
Next, we get b 3rd time, hence b becomes 8. 
Next, we get b 4th time, hence b becomes 16.

```

```
Input: b = 3, arr[] = [1, 2, 3, 4, 8]
Output: 6
Explanation: b is initially 3. We get 3 2nd time, hence b becomes 6.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 20
1 ≤ b ≤ 103
1 ≤ arr[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T09:14:37.083Z  

```java
class Solution {
    public int solve(int b, List<Integer> arr) {
        // code here
        for (int num : arr) {
            if (num == b) {
                b *= 2;
            }
        }
        
        return b;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/doubling-the-value4859/1)