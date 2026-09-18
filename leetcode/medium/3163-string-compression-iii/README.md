# String Compression III

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `word`, compress it using the following algorithm:

- Begin with an empty string comp. While word is not empty, use the following operation: Remove a maximum length prefix of word made of a single character c repeating at most 9 times. Append the length of the prefix followed by c to comp.

Return the string `comp`.

 

 **Example 1:** 

 **Input:**  word = "abcde"

 **Output:**  "1a1b1c1d1e"

 **Explanation:** 

Initially, `comp = ""`. Apply the operation 5 times, choosing `"a"`, `"b"`, `"c"`, `"d"`, and `"e"` as the prefix in each operation.

For each prefix, append `"1"` followed by the character to `comp`.

 **Example 2:** 

 **Input:**  word = "aaaaaaaaaaaaaabb"

 **Output:**  "9a5a2b"

 **Explanation:** 

Initially, `comp = ""`. Apply the operation 3 times, choosing `"aaaaaaaaa"`, `"aaaaa"`, and `"bb"` as the prefix in each operation.

- For prefix "aaaaaaaaa", append "9" followed by "a" to comp.
- For prefix "aaaaa", append "5" followed by "a" to comp.
- For prefix "bb", append "2" followed by "b" to comp.

 

 **Constraints:** 

- 1 <= word.length <= 2 * 105
- word consists only of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 19 ms (beats 50.64%)  
**Memory:** 48.8 MB (beats 39.84%)  
**Submitted:** 2026-09-18T16:10:06.276Z  

```java
class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        char prevChar = word.charAt(0);
        int count = 1;

        for (int i = 1; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == prevChar && count < 9) {
                count++;
            } else {
                sb.append(count).append(prevChar);
                prevChar = ch;
                count = 1;
            }
        }

        sb.append(count).append(prevChar);

        return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/string-compression-iii/)