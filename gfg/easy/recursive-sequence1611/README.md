# Recursive Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer  **n**, compute the value of  **F(n)**  where F(n) is defined as: F(n) = (1) + (2×3) + (4×5×6) + (7×8×9×10) + …up to n terms. 

 **Note:** As the answer can be very large, return the answer modulo 109+7.

 **Examples:** 

```
Input: n = 5
Output: 365527
Explanation: F(5) = 1 + 2 *3 + 4* 5 *6 + 7* 8 *9* 10 + 11 *12* 13 *14* 15 = 365527.
```

```
Input: n = 7
Output: 6997165
Explanation: F(7) = 1 + 2 *3 + 4* 5 *6 + 7* 8 *9* 10 + 11 *12* 13 *14* 15 + 16 *17* 18 *19* 20 *21 + 22* 23 *24* 25 *26* 27*28 = 6006997207.
6006997207 % 109+7 = 6997165
```

 **Constraints:** 
1 ≤ n ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T15:53:19.195Z  

```java
class Solution {
    
    static final long MOD = 1000000007L;
    long num = 1;
    
    public int sequence(int n) {
        // code here
        return (int) solve(n, 1);
    }

    private long solve(int n, int term) {
        // Base case
        if (term > n)
            return 0;

        long product = 1;

        // Current term has 'term' numbers
        for (int i = 0; i < term; i++) {
            product = (product * num) % MOD;
            num++;
        }

        // Current term + remaining terms
        return (product + solve(n, term + 1)) % MOD;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/recursive-sequence1611/1)