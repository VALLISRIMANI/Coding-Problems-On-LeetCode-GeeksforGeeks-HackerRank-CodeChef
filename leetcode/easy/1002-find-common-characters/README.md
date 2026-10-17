# Find Common Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string array `words`, return  *an array of all characters that show up in all strings within the* `words` *(including duplicates)*. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: words = ["bella","label","roller"]
Output: ["e","l","l"]

```

 **Example 2:** 

```
Input: words = ["cool","lock","cook"]
Output: ["c","o"]

```

 

 **Constraints:** 

- 1 <= words.length <= 100
- 1 <= words[i].length <= 100
- words[i] consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 21 ms (beats 5.77%)  
**Memory:** 46.6 MB (beats 16.32%)  
**Submitted:** 2026-10-17T15:44:18.521Z  

```java
class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> minFreq = new HashMap<>();

        for(char c : words[0].toCharArray()) {
            minFreq.put(c, minFreq.getOrDefault(c, 0) + 1);
        }

        for(int i = 1; i < words.length; i++) {
            Map<Character, Integer> curr = new HashMap<>();

            for(char c : words[i].toCharArray()) {
                curr.put(c, curr.getOrDefault(c, 0) + 1);
            }

            for(char ch : new HashSet<>(minFreq.keySet())) {
                minFreq.put(ch,
                    Math.min(minFreq.get(ch),
                            curr.getOrDefault(ch, 0)));

                if(minFreq.get(ch) == 0) {
                    minFreq.remove(ch);
                }
            }
        }

        List<String> result = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : minFreq.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.add(String.valueOf(entry.getKey()));
            }
        }

        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-common-characters/)