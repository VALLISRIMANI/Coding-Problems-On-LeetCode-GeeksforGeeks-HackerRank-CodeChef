# Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  and two integers  **l**  and  **r**. Print the characters in the range  **l**  to  **r**  (both inclusive) of the string.
 **Note:** Assume zero based indexing **.** 

 **Examples:** 

```
Input: s = "geeksforgeeks", l = 0, r = 4
Output: "geeks" 
Explanation: Starting from index 0 ('g') to index 4 ('s').

```

```
Input: s = "geeks", l = 2, r = 4
Output: "eks"
Explanation: Starting from index 2 ('e') to index 4 ('s').
```

 **Constraints:** 
1 ≤ |s| ≤ 105
0 ≤ l ≤ r < |s|
s only contains lowercase English letters

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T16:04:39.043Z  

```java
class Solution {

    String substring(String s, int l, int r) {
        // code here
        return s.substring(l, r + 1);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/substring/1)