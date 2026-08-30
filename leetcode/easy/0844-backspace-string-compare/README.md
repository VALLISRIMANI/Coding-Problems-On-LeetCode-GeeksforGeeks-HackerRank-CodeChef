# Backspace String Compare

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true`  *if they are equal when both are typed into empty text editors*. `'#'` means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

 **Example 1:** 

```
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

```

 **Example 2:** 

```
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

```

 **Example 3:** 

```
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

```

 

 **Constraints:** 

- 1 <= s.length, t.length <= 200
- s and t only contain lowercase letters and '#' characters.

 

 **Follow up:**  Can you solve it in `O(n)` time and `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 61.19%)  
**Memory:** 43.3 MB (beats 20.23%)  
**Submitted:** 2026-08-30T05:32:08.892Z  

```java
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!st1.isEmpty())  st1.pop();
            } else {
                st1.push(ch);
            }
        }

        Stack<Character> st2 = new Stack<>();
        for (char ch : t.toCharArray()) {
            if (ch == '#') { 
                if (!st2.isEmpty()) st2.pop();
            } else {
                st2.push(ch);
            }
        }

        while (!st1.isEmpty() && !st2.isEmpty()) {
            if (st1.pop() != st2.pop()) {
                return false;
            }
        }

        return st1.isEmpty() && st2.isEmpty();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/backspace-string-compare/)