# Valid Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **`s`**  consisting only of opening and closing parentheses  **`'('`**  and `')'`, find the length of the  **longest valid**  (well-formed) parentheses  **substring**.

 **Note:** The length of the smallest valid substring `"()"` is 2.

 **Examples:** 

```
Input: s = "(()("
Output: 2
Explanation: The longest valid substring is "()". Its length is 2. 
```

```
Input: s = "()(())("
Output: 6
Explanation: The longest valid substring is "()(())". Its length is 6.
```

```
Input: s = "(()())"
Output: 6
Explanation: The longest valid substring is "(()())". Its length is 6.
```

 **Constraints:** 
1 ≤ s.size() ≤ 105
s[i] ∈ { '(', ')' }

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T12:18:46.027Z  

```java
class Solution {
    public int maxLength(String s) {
        // code here
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        
        int maxLen = 0;
        
        for (int idx = 0; idx <s.length(); idx++) {
            char ch = s.charAt(idx);
            
            if (ch == '(') {
                st.push(idx);
            } else {
                st.pop();
                
                if (st.isEmpty()) {
                    st.push(idx);
                } else {
                    maxLen = Math.max(maxLen, idx - st.peek());
                }
            }
        }
        
        return maxLen;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/valid-substring0624/1)