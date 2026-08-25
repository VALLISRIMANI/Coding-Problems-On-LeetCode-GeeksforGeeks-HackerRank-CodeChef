# Outermost Parentheses of Primitives

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A valid parenthesis string is called primitive if it cannot be split into two non-empty valid parentheses strings.

Given a valid parentheses string  **s**, remove the outermost parentheses from every primitive substring and return the resulting string.

 **Examples:** 

```
Input: s = "(()())(())"
Output: "()()()"
Explanation: The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

```

```
Input: s = "()()"
Output: ""
Explanation: The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, this is "" + "" = "".
```

 **Constraint:** 
1 ≤ s.size() ≤ 105
s[i] is either '(' or ')'
s is a valid parentheses string.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T06:10:47.355Z  

```java
class Solution {
    public String removeOuter(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (!st.isEmpty()) {
                    sb.append(ch);
                }
                st.push(ch);
            } else {
                st.pop();
                if (!st.isEmpty()) {
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/outermost-parentheses/1)