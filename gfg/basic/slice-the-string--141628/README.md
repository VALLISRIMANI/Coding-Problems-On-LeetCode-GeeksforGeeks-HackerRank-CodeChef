# Slice String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, slice it so that the output is a substring containing the entire string **s** except the first and last characters.

 **Examples:** 

```
Input: s = "Hello"
Output: ell
Explanation: The first and last character are ignored.
```

```
Input: s = "World"
Output: orl
Explanation: The first and last characters are ignored.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T16:04:01.041Z  

```java
class Solution {
    public String sliceString(String s) {
        // code here
        return s.substring(1, s.length() - 1);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/slice-the-string--141628/1)