# Longest Uncommon Subsequence II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of strings `strs`, return  *the length of the  **longest uncommon subsequence**  between them*. If the longest uncommon subsequence does not exist, return `-1`.

An  **uncommon subsequence**  between an array of strings is a string that is a  **subsequence of one string but not the others**.

A  **subsequence**  of a string `s` is a string that can be obtained after deleting any number of characters from `s`.

- For example, "abc" is a subsequence of "aebdc" because you can delete the underlined characters in "aebdc" to get "abc". Other subsequences of "aebdc" include "aebdc", "aeb", and "" (empty string).

 

 **Example 1:** 

```
Input: strs = ["aba","cdc","eae"]
Output: 3

```

 **Example 2:** 

```
Input: strs = ["aaa","aaa","aa"]
Output: -1

```

 

 **Constraints:** 

- 2 <= strs.length <= 50
- 1 <= strs[i].length <= 10
- strs[i] consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.25%)  
**Memory:** 41.9 MB (beats 99.62%)  
**Submitted:** 2026-11-09T16:07:46.026Z  

```java
class Solution {
    public int findLUSlength(String[] strs) {
        Arrays.sort(strs, (a, b) -> b.length() - a.length());

        for (int i = 0; i < strs.length; i++) {
            boolean uncommon = true;

            for (int j = 0; j < strs.length; j++) {
                if (i == j) continue;

                if (isSubsequence(strs[i], strs[j])) {
                    uncommon = false;
                    break;
                }
            }

            if (uncommon) return strs[i].length();
        }

        return -1;
    }

    private boolean isSubsequence(String a, String b) {
        int i = 0, j = 0;

        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == a.length();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-uncommon-subsequence-ii/)