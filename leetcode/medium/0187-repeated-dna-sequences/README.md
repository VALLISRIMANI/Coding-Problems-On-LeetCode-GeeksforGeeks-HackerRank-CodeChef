# Repeated DNA Sequences

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

The  **DNA sequence**  is composed of a series of nucleotides abbreviated as `'A'`, `'C'`, `'G'`, and `'T'`.

- For example, "ACGAATTCCG" is a DNA sequence.

When studying  **DNA**, it is useful to identify repeated sequences within the DNA.

Given a string `s` that represents a  **DNA sequence**, return all the  **`10`-letter-long**  sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC","CCCCCAAAAA"]

```

 **Example 2:** 

```
Input: s = "AAAAAAAAAAAAA"
Output: ["AAAAAAAAAA"]

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is either 'A', 'C', 'G', or 'T'.

## Solution

**Language:** Java  
**Runtime:** 853 ms (beats 5.01%)  
**Memory:** 275.2 MB (beats 11.89%)  
**Submitted:** 2026-11-05T12:11:48.910Z  

```java
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<String>();

        if (s == null || s.length() < 10) return result;

        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder(s.substring(0, 10));
        map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);

        for (int i = 10; i < s.length(); i++) {
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/repeated-dna-sequences/)