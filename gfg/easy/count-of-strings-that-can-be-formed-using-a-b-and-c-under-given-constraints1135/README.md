# Count Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a length  **n**, count the number of strings of length  **n**  that can be made using  **a**,  **b**  and  **c**  with at-most one  **b**  and two  **c**  allowed.

 **Examples:** 

```
Input: n = 1
Output: 3
Explanation: Possible strings are: "a", "b" and "c"

```

```
Input: n = 3
Output: 19
Explanation: 
Number of strings with 3 occurrences of a: 1
2-a and 1-b: 3
2-a and 1-c: 3
1-a, 1-b and 1-c: 6
1-a and 2-c: 3
1-b and 2-c: 3
So, total number of strings of length 3
is 1 + 3 + 3 + 6 + 3 + 3 = 19

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-10T14:04:00.829Z  

```java
class Solution {
    long countStr(int n) {
        // code here
        if (n == 0) return 0;

        // dp[i][b][c] = number of strings of length i with at most b 'b's and c 'c's
        long[][][] dp = new long[n + 1][2 + 1][2 + 1];

        dp[0][0][0] = 1; // base case: empty string

        for (int i = 0; i < n; i++) {
            for (int b = 0; b <= 1; b++) {
                for (int c = 0; c <= 2; c++) {
                    long val = dp[i][b][c];
                    if (val == 0) continue;

                    // add 'a'
                    dp[i + 1][b][c] += val;

                    // add 'b' if not used yet
                    if (b < 1) dp[i + 1][b + 1][c] += val;

                    // add 'c' if less than 2 used
                    if (c < 2) dp[i + 1][b][c + 1] += val;
                }
            }
        }

        long total = 0;
        for (int b = 0; b <= 1; b++) {
            for (int c = 0; c <= 2; c++) {
                total += dp[n][b][c];
            }
        }

        return total;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-of-strings-that-can-be-formed-using-a-b-and-c-under-given-constraints1135/1)