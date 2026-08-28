# Regular Expression Matching

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an input string `s` and a pattern `p`, implement regular expression matching with support for `'.'` and `'*'` where:

- '.' Matches any single character.​​​​
- '*' Matches zero or more of the preceding element.

Return a boolean indicating whether the matching covers the entire input string (not partial).

 

 **Example 1:** 

```
Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".

```

 **Example 2:** 

```
Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".

```

 **Example 3:** 

```
Input: s = "ab", p = ".*"
Output: true
Explanation: ". *" means "zero or more (*) of any character (.)".

```

 

 **Constraints:** 

- 1 <= s.length <= 20
- 1 <= p.length <= 20
- s contains only lowercase English letters.
- p contains only lowercase English letters, '.', and '*'.
- It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 46.89%)  
**Memory:** 43.6 MB (beats 33.44%)  
**Submitted:** 2026-08-28T06:31:15.245Z  

```java
class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length(), m = p.length();

        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;

        for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*' && j > 1) {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (p.charAt(j - 1) == '.' || (s.charAt(i - 1) == p.charAt(j - 1))) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*' && j > 1) {
                    dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.')) ;
                }
            }
        }

        return dp[n][m];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/regular-expression-matching/)