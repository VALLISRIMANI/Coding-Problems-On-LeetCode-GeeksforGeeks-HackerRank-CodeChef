# Substring with Concatenation of All Words

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given a string `s` and an array of strings `words`. All the strings of `words` are of  **the same length**.

A  **concatenated string**  is a string that exactly contains all the strings of any permutation of `words` concatenated.

- For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings. "acdbef" is not a concatenated string because it is not the concatenation of any permutation of words.

Return an array of  *the starting indices*  of all the concatenated substrings in `s`. You can return the answer in  **any order**.

 

 **Example 1:** 

 **Input:**  s = "barfoothefoobarman", words = ["foo","bar"]

 **Output:**  [0,9]

 **Explanation:** 

The substring starting at 0 is `"barfoo"`. It is the concatenation of `["bar","foo"]` which is a permutation of `words`.
The substring starting at 9 is `"foobar"`. It is the concatenation of `["foo","bar"]` which is a permutation of `words`.

 **Example 2:** 

 **Input:**  s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]

 **Output:**  []

 **Explanation:** 

There is no concatenated substring.

 **Example 3:** 

 **Input:**  s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]

 **Output:**  [6,9,12]

 **Explanation:** 

The substring starting at 6 is `"foobarthe"`. It is the concatenation of `["foo","bar","the"]`.
The substring starting at 9 is `"barthefoo"`. It is the concatenation of `["bar","the","foo"]`.
The substring starting at 12 is `"thefoobar"`. It is the concatenation of `["the","foo","bar"]`.

 

 **Constraints:** 

- 1 <= s.length <= 104
- 1 <= words.length <= 5000
- 1 <= words[i].length <= 30
- s and words[i] consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 11 ms (beats 96.36%)  
**Memory:** 46.3 MB (beats 99.75%)  
**Submitted:** 2026-09-04T12:59:35.753Z  

```java
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        /*
        List<Integer> res = new ArrayList<>();
        if (s == null || words.length == 0) return res;
        
        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;
        
        Map<String, Integer> wordCount = new HashMap<>();
        for (String w : words) {
            wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
        }
        
        for (int i = 0; i <= s.length() - totalLen; i++) {
            Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            while (j < words.length) {
                int start = i + j * wordLen;
                String word = s.substring(start, start + wordLen);
                if (!wordCount.containsKey(word)) break;
                seen.put(word, seen.getOrDefault(word, 0) + 1);
                if (seen.get(word) > wordCount.get(word)) break;
                j++;
            }
            if (j == words.length) res.add(i);
        }
        
        return res;
        */

        List<Integer> result = new ArrayList<>();

        if (s == null || words == null || words.length == 0) return result;

        int wordCountTotal = words.length;
        int wordLen = words[0].length();
        int totalLen = wordLen * wordCountTotal;

        if (s.length() < totalLen) return result;

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (int offset = 0; offset < wordLen; offset++) {
            int left = offset;
            int right = offset;
            int count = 0;

            Map<String, Integer> seen = new HashMap<>();
            while (right + wordLen <= s.length()) {
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (!wordCount.containsKey(word)) {
                    seen.clear();
                    count = 0;
                    left = right;
                    continue;
                }

                seen.put(word, seen.getOrDefault(word, 0) + 1);
                count++;

                while (seen.get(word) > wordCount.get(word)) {
                    String leftWord = s.substring(left, left + wordLen);
                    seen.put(leftWord, seen.get(leftWord) - 1);
                    left += wordLen;
                    count--;
                }

                if (count == wordCountTotal) {
                    result.add(left);

                    String leftWord = s.substring(left, left + wordLen);
                    seen.put(leftWord, seen.get(leftWord) - 1);
                    left += wordLen;
                    count--;
                }
            }
        }

        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/substring-with-concatenation-of-all-words/)