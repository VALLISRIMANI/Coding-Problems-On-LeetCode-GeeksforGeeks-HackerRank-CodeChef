# Longest Word in Dictionary through Deleting

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s` and a string array `dictionary`, return  *the longest string in the dictionary that can be formed by deleting some of the given string characters*. If there is more than one possible result, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

 

Original
Java
 **Example 1:** 

```
Input: s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
Output: "apple"

```

 **Example 2:** 

```
Input: s = "abpcplea", dictionary = ["a","b","c"]
Output: "a"

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- 1 <= dictionary.length <= 1000
- 1 <= dictionary[i].length <= 1000
- s and dictionary[i] consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 85.55%)  
**Memory:** 47.2 MB (beats 83.19%)  
**Submitted:** 2026-11-10T14:10:21.824Z  

```java
class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String result = "";

        for (String word : dictionary) {
            if (word.length() < result.length() || (word.length() == result.length() && word.compareTo(result) > 0)) {
                continue;
            }

            if (isSubsequence(word, s)) {
                result = word;
            }
        }
        
        return result;
    }

    private boolean isSubsequence(String word, String s) {
        int i = 0, j = 0;

        int wordLen = word.length();
        int sLen = s.length();

        while (i < wordLen && j < sLen) {
            if (word.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == wordLen;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/)