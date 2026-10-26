# Permutation in String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`, or `false` otherwise.

In other words, return `true` if one of `s1`'s permutations is the substring of `s2`.

 

 **Example 1:** 

```
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

```

 **Example 2:** 

```
Input: s1 = "ab", s2 = "eidboaoo"
Output: false

```

 

 **Constraints:** 

- 1 <= s1.length, s2.length <= 104
- s1 and s2 consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 26 ms (beats 26.02%)  
**Memory:** 46.5 MB (beats 23.81%)  
**Submitted:** 2026-10-26T14:36:44.302Z  

```java
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        if (k > s2.length()) return false;

        HashMap<Character, Integer> freqMap1 = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            freqMap1.put(ch, freqMap1.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> freqMap2 = new HashMap<>();
        for (int i = 0; i < k; i++) {
            char ch = s2.charAt(i);
            freqMap2.put(ch, freqMap2.getOrDefault(ch, 0) + 1);
        }

        if (freqMap1.equals(freqMap2)) return true;

        for (int i = k; i < s2.length(); i++) {
            char ch1 = s2.charAt(i - k);
            freqMap2.put(ch1, freqMap2.get(ch1) - 1);
            if (freqMap2.get(ch1) == 0) {
                freqMap2.remove(ch1);
            }

            char ch2 = s2.charAt(i);
            freqMap2.put(ch2, freqMap2.getOrDefault(ch2, 0) + 1);

            if (freqMap1.equals(freqMap2)) return true;
        }

        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/permutation-in-string/)