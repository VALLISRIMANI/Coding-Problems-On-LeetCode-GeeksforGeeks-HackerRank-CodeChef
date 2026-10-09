# Wildcard Matching

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an input string (`s`) and a pattern (`p`), implement wildcard pattern matching with support for `'?'` and `'*'` where:

- '?' Matches any single character.
- '*' Matches any sequence of characters (including the empty sequence).

The matching should cover the  **entire**  input string (not partial).

 

 **Example 1:** 

```
Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".

```

 **Example 2:** 

```
Input: s = "aa", p = "*"
Output: true
Explanation: '*' matches any sequence.

```

 **Example 3:** 

```
Input: s = "cb", p = "?a"
Output: false
Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.

```

 

 **Constraints:** 

- 0 <= s.length, p.length <= 2000
- s contains only lowercase English letters.
- p contains only lowercase English letters, '?' or '*'.

## Solution

**Language:** Java  
**Runtime:** 38 ms (beats 37.06%)  
**Memory:** 47.3 MB (beats 65.29%)  
**Submitted:** 2026-10-09T04:32:32.368Z  

```java
class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);

                if (pc == '?' || sc == pc) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[m][n];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/wildcard-matching/)