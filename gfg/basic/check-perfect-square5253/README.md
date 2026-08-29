# Check Perfect Square

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a positive integer  **n**, return true if it is a perfect square, otherwise return false. A number is called a perfect square if it can be written in the form a × a, where a is an integer.

 **Examples:** 

```
Input: n = 35
Output: false 
Explanation: 35 is not a perfect square.
```

```
Input: n = 49
Output: true
Explanation: 49 is a perfect square (7 * 7 = 49).
```

 **Constraints:** 
1 ≤ n ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T10:28:55.269Z  

```java
class Solution {
    public boolean isPerfectSquare(int n) {
        // code here
        int temp = (int) Math.sqrt(n);
        
        return (temp * temp) == n;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-perfect-square5253/1)