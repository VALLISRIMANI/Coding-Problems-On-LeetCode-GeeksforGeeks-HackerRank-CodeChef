# Reverse String Prefix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s` and an integer `k`.

Reverse the first `k` characters of `s` and return the resulting string.

 

 **Example 1:** 

 **Input:**  s = "abcd", k = 2

 **Output:**  "bacd"

 **Explanation:** ​​​​​​​

The first `k = 2` characters `"ab"` are reversed to `"ba"`. The final resulting string is `"bacd"`.

 **Example 2:** 

 **Input:**  s = "xyz", k = 3

 **Output:**  "zyx"

 **Explanation:** 

The first `k = 3` characters `"xyz"` are reversed to `"zyx"`. The final resulting string is `"zyx"`.

 **Example 3:** 

 **Input:**  s = "hey", k = 1

 **Output:**  "hey"

 **Explanation:** 

The first `k = 1` character `"h"` remains unchanged on reversal. The final resulting string is `"hey"`.

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists of lowercase English letters.
- 1 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 44.9 MB (beats 23.33%)  
**Submitted:** 2026-09-01T04:05:13.271Z  

```java
class Solution {
    public String reversePrefix(String s, int k) {
        if (k == 1) return s;

        String firstHalf = s.substring(0, k);
        String secondHalf = s.substring(k, s.length());
        StringBuilder sb = new StringBuilder(firstHalf);
        sb.reverse().append(secondHalf);

        return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string-prefix/)