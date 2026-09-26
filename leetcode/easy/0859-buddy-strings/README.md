# Buddy Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `goal`, return `true` *if you can swap two letters in* `s` *so the result is equal to* `goal` *, otherwise, return* `false` *.* 

Swapping letters is defined as taking two indices `i` and `j` (0-indexed) such that `i != j` and swapping the characters at `s[i]` and `s[j]`.

- For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

 

 **Example 1:** 

```
Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.

```

 **Example 2:** 

```
Input: s = "ab", goal = "ab"
Output: false
Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.

```

 **Example 3:** 

```
Input: s = "aa", goal = "aa"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.

```

 

 **Constraints:** 

- 1 <= s.length, goal.length <= 2 * 104
- s and goal consist of lowercase letters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.86%)  
**Memory:** 44.1 MB (beats 15.02%)  
**Submitted:** 2026-09-26T16:21:29.317Z  

```java
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;

        if (s.equals(goal)) {
            int[] freq = new int[26];

            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;

                if (freq[ch - 'a'] >= 2) {
                    return true;
                }
            }

            return false;
        }

        int first = -1, second = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false;
                }
            }
        }

        return second != -1 && s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/buddy-strings/)