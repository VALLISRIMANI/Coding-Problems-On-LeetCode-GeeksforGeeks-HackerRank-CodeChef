# Repeating Character

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**, return the index of the first character that appears more than once in the string. If there is no repeated character, return -1.

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: 0
Explanation: We see that both 'e' and 'g' repeat as we move from left to right.But the leftmost is 'g' so we return leftmost index of 'g' that is 0.

```

```
Input: s = "abcd"
Output: -1
Explanation: No character repeats so we return -1.
```

 **Constraints:** 
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T08:21:08.523Z  

```java
class Solution {
    static int repeatedCharacter(String S) {
        // code here
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (S.indexOf(ch) != S.lastIndexOf(ch)) {
                return i;
            }
        }
        
        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/repeating-character-first-appearance-leftmost/1)