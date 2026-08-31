# To Lower Case

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return  *the string after replacing every uppercase letter with the same lowercase letter*.

 

 **Example 1:** 

```
Input: s = "Hello"
Output: "hello"

```

 **Example 2:** 

```
Input: s = "here"
Output: "here"

```

 **Example 3:** 

```
Input: s = "LOVELY"
Output: "lovely"

```

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 25.26%)  
**Memory:** 43.1 MB (beats 34.09%)  
**Submitted:** 2026-08-31T17:40:09.900Z  

```java
class Solution {
    public String toLowerCase(String s) {
        // return s.toLowerCase();
        
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c + 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/to-lower-case/)