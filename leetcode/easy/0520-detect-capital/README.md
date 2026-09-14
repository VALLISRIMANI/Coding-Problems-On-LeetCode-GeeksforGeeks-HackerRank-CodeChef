# Detect Capital

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

We define the usage of capitals in a word to be right when one of the following cases holds:

- All letters in this word are capitals, like "USA".
- All letters in this word are not capitals, like "leetcode".
- Only the first letter in this word is capital, like "Google".

Given a string `word`, return `true` if the usage of capitals in it is right.

 

 **Example 1:** 

```
Input: word = "USA"
Output: true

```

 **Example 2:** 

```
Input: word = "FlaG"
Output: false

```

 

 **Constraints:** 

- 1 <= word.length <= 100
- word consists of lowercase and uppercase English letters.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 19.06%)  
**Memory:** 43.1 MB (beats 77.56%)  
**Submitted:** 2026-09-14T11:37:14.186Z  

```java
class Solution {
    public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) ||
               word.equals(word.toLowerCase()) ||
               (Character.isUpperCase(word.charAt(0)) && 
                word.substring(1).equals(word.substring(1).toLowerCase()));
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/detect-capital/)