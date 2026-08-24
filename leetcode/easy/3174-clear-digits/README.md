# Clear Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s`.

Your task is to remove  **all**  digits by doing this operation repeatedly:

- Delete the first digit and the closest non-digit character to its left.

Return the resulting string after removing all digits.

 **Note**  that the operation  *cannot*  be performed on a digit that does not have any non-digit character to its left.

 

 **Example 1:** 

 **Input:**  s = "abc"

 **Output:**  "abc"

 **Explanation:** 

There is no digit in the string.

 **Example 2:** 

 **Input:**  s = "cb34"

 **Output:**  ""

 **Explanation:** 

First, we apply the operation on `s[2]`, and `s` becomes `"c4"`.

Then we apply the operation on `s[1]`, and `s` becomes `""`.

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists only of lowercase English letters and digits.
- The input is generated such that it is possible to delete all digits.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.92%)  
**Memory:** 43.4 MB (beats 98.61%)  
**Submitted:** 2026-08-24T14:16:32.972Z  

```java
class Solution {
    public String clearDigits(String s) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                answer.setLength(answer.length() - 1);
            } else {
                answer.append(s.charAt(i));
            }
        }

        return answer.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/clear-digits/)