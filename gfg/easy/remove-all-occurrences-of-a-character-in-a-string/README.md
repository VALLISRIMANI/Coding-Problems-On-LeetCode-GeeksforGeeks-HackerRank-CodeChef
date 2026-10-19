# Remove all occurrences of a character in a string

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  and a character  **c**. The task is to remove all the occurrences of the character in the string.

 **Examples:** 

```
Input: s = "geeksforgeeks", c = 'e'
Output: s = "gksforgks"
```

```
Input: s = "geeksforgeeks", c = 'g'
Output: s = "eeksforeeks"
```

**Constraints:
**1 <= |s| <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T16:01:37.638Z  

```java
class Solution {
    // Function to remove all occurrences of the character from the string
    public void removeCharacter(StringBuilder s, char c) {
        // code here
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                s.deleteCharAt(i);
            }
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-all-occurrences-of-a-character-in-a-string/1)