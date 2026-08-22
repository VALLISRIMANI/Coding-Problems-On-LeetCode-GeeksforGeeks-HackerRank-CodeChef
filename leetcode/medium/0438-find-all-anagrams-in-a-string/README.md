# Find All Anagrams in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s` and `p`, return an array of all the start indices of `p`'s anagrams in `s`. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

```

 **Example 2:** 

```
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

```

 

 **Constraints:** 

- 1 <= s.length, p.length <= 3 * 104
- s and p consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 95.94%)  
**Memory:** 46.5 MB (beats 92.03%)  
**Submitted:** 2026-08-22T05:35:43.951Z  

```java
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int lenP = p.length();
        int lenS = s.length();

        if (lenS < lenP) return result;

        int[] freq = new int[26];
        for (char ch : p.toCharArray()) {
            freq[ch - 'a']++;
        }

        int left = 0, right = 0, count = lenP;

        while (right < lenS) {
            char ch = s.charAt(right);

            if (freq[ch - 'a'] > 0) {
                count--;
            }

            freq[ch - 'a']--;
            right++;

            if (right - left > lenP) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'a']++;

                if (freq[leftChar - 'a'] > 0) {
                    count++;
                }

                left++;
            }

            if (count == 0) {
                result.add(left);
            }
        }

        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/)