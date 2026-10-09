# Wildcard Pattern Matching

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings   pat   and   txt   which may be of different sizes, You have to return   true   if the wildcard pattern i.e. pat, matches with txt else return   false .

The wildcard pattern pat can include the characters '  ?  ' and '    *'.

- '?' – matches any single character.
- '*' – matches any sequence of characters (including the empty sequence).

  Note:   The matching should cover the entire txt (not partial txt).

 **Examples:** 

```
Input: txt = "abcde", pat = "a?c*"
Output: true
Explanation: '?' matches with 'b' and '*' matches with "de".

```

```
Input: txt = "baaabab", pat = "a*ab"
Output: false
Explanation: The pattern starts with a, but the text starts with b, so the pattern does not match the text.
```

```
Input: txt = "abc", pat = "*"
Output: true
Explanation: '*' matches with whole text "abc".
```

 **Constraints:** 
1 ≤ txt.size(), pat.size() ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T04:34:33.907Z  

```java
class Solution {
    public boolean wildCard(String txt, String pat) {
        // code here
        int m = txt.length();
        int n = pat.length();
        
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int j = 1; j <= n; j++) {
            if (pat.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = txt.charAt(i - 1);
                char pc = pat.charAt(j - 1);

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

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/wildcard-pattern-matching/1)