# Most Common Word

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `paragraph` and a string array of the banned words `banned`, return  *the most frequent word that is not banned*. It is  **guaranteed**  there is  **at least one word**  that is not banned, and that the answer is  **unique**.

The words in `paragraph` are  **case-insensitive**  and the answer should be returned in  **lowercase**.

 **Note**  that words can not contain punctuation symbols.

 

 **Example 1:** 

```
Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.

```

 **Example 2:** 

```
Input: paragraph = "a.", banned = []
Output: "a"

```

 

 **Constraints:** 

- 1 <= paragraph.length <= 1000
- paragraph consists of English letters, space ' ', or one of the symbols: "!?',;.".
- 0 <= banned.length <= 100
- 1 <= banned[i].length <= 10
- banned[i] consists of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 14 ms (beats 65.11%)  
**Memory:** 44.3 MB (beats 69.28%)  
**Submitted:** 2026-09-19T10:08:32.625Z  

```java
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        String[] words = paragraph.toLowerCase().split("[^a-z]+");

        HashMap<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }

        int maxFreq = 0;
        String result = "";

        for (Map.Entry<String, Integer> e : freq.entrySet()) {
            if (e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                result = e.getKey();
            }
        }

        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/most-common-word/)