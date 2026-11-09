# Shortest Uncommon Subsequence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings  **s**  and  **t**, find the length of the  **shortest**  subsequence of s that is  **not**  a subsequence of t. If no such subsequence exists, return **-1**.

A subsequence is a sequence of characters that appears in the same relative order, but not necessarily contiguously.

 **Examples:** 

```
Input: s = "geeks", t = "geek"
Output: 1
Explanation: In geeks, "s" is a subsequence of s but not a subsequence of t. Hence, the shortest uncommon subsequence has length 1.
```

```
Input: s = "babab", t = "babba"
Output: 3
Explanation: There is no subsequence of s with length less than 3 that is absent from t. One such shortest uncommon subsequence is "aab".
```

 **Constraints:** 
1 ≤ |s|, |t| ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-09T16:12:37.276Z  

```java
class Solution {
    public int shortestUnSub(String s, String t) {
        // code here       
        int n = s.length();
        int m = t.length();

        int[][] next = new int[m + 1][26];

        for (int c = 0; c < 26; c++) {
            next[m][c] = -1;
        }

        for (int j = m - 1; j >= 0; j--) {

            for (int c = 0; c < 26; c++) {
                next[j][c] = next[j + 1][c];
            }

            next[j][t.charAt(j) - 'a'] = j;
        }

        int[] dp = new int[m + 1];

        for (int j = 0; j <= m; j++) {
            dp[j] = 100000;
        }

        for (int i = n - 1; i >= 0; i--) {

            int[] curr = new int[m + 1];

            curr[m] = 1;

            for (int j = m - 1; j >= 0; j--) {

                int k = next[j][s.charAt(i) - 'a'];

                if (k == -1) {
                    curr[j] = 1;
                } else {
                    curr[j] = Math.min(
                        dp[j],
                        1 + dp[k + 1]
                    );
                }
            }

            dp = curr;
        }

        return dp[0] >= 100000 ? -1 : dp[0];
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/shortest-uncommon-subsequence5746/1)