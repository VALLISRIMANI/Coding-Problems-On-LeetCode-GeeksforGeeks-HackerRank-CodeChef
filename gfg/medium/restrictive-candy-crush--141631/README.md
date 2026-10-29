# Removing K Consecutive Identical

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **s**  and an integer  **k**, the task is to reduce the string by removing k consecutive identical characters. The removal operation can be performed any number of times until it is no longer possible.

 **Examples:** 

```
Input: k = 2, s = "geeksforgeeks"
Output: gksforgks
Explanation: Modified String after each step: 
"geeksforgeeks" -> "gksforgks"

```

```
Input: k = 2, s = "geegsforgeeeks" 
Output: sforgeks
Explanation: Modified String after each step:
"geegsforgeeeks" -> "ggsforgeks" -> "sforgeks"

```

```
Input: k = 2, s = "abbac" 
Output: c
```

 **Constraints:** 
1 ≤ s.size() ≤ 105
1 ≤ k ≤ |s|

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T06:52:41.403Z  

```java
class Solution {
    
    class Pair {
        char ch;
        int count;
        
        Pair (char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
    
    public String reducedString(int k, String s) {
        // code here
        Stack<Pair> st = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek().ch == ch) {
                st.peek().count++;
            } else {
                st.push(new Pair(ch, 1));
            }
            
            if (st.peek().count == k) {
                st.pop();
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (Pair p : st) {
            sb.append(String.valueOf(p.ch).repeat(p.count));
        }
        
        return sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/restrictive-candy-crush--141631/1)