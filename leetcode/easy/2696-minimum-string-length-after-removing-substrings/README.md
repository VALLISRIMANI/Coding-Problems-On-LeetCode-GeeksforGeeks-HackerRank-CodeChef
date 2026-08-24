# Minimum String Length After Removing Substrings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s` consisting only of  **uppercase**  English letters.

You can apply some operations to this string where, in one operation, you can remove  **any**  occurrence of one of the substrings `"AB"` or `"CD"` from `s`.

Return  *the  **minimum**  possible length of the resulting string that you can obtain*.

 **Note**  that the string concatenates after removing the substring and could produce new `"AB"` or `"CD"` substrings.

 

 **Example 1:** 

```
Input: s = "ABFCACDB"
Output: 2
Explanation: We can do the following operations:
- Remove the substring "ABFCACDB", so s = "FCACDB".
- Remove the substring "FCACDB", so s = "FCAB".
- Remove the substring "FCAB", so s = "FC".
So the resulting length of the string is 2.
It can be shown that it is the minimum length that we can obtain.
```

 **Example 2:** 

```
Input: s = "ACBBD"
Output: 5
Explanation: We cannot do any operations on the string so the length remains the same.

```

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists only of uppercase English letters.

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 5.33%)  
**Memory:** 46.8 MB (beats 5.75%)  
**Submitted:** 2026-08-24T14:26:19.504Z  

```java
class Solution {
    public int minLength(String s) {
        while (s.contains("AB") || s.contains("CD")) {
            if (s.contains("AB")) {
                s = s.replace("AB", "");
            } else if (s.contains("CD")) {
                s = s.replace("CD", "");
            }
        }

        return s.length();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-string-length-after-removing-substrings/)