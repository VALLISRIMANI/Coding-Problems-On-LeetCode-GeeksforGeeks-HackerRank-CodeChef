# Missing Characters in Panagram

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string s, find the missing characters required to make it a pangram (a sentence containing every letter of the English alphabet at least once).

Return all missing characters in lowercase and in lexicographical order. If the given string is already a pangram, return -1.

 **Examples:** 

```
Input: s = Abcdefghijklmnopqrstuvwxy
Output: z
Explanation: All alphabets except "z" are present in the string.

```

```
Input: s = Abc
Output: defghijklmnopqrstuvwxyz
```

 **Constraints:** 
1 <= |s| <= 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T15:58:40.458Z  

```java
class Solution {
    public static String missingPanagram(String s) {
        // code here
        int[] count = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            
            count[ch - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                sb.append((char) ('a' + i));
            }
        }
        
        return sb.isEmpty() ? "-1" : sb.toString();
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/missing-characters-in-panagram/1)