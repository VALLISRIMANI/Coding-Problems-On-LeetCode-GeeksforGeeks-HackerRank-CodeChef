# Top K Frequent Words

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of strings `words` and an integer `k`, return  *the* `k` *most frequent strings*.

Return the answer  **sorted**  by  **the frequency**  from highest to lowest. Sort the words with the same frequency by their  **lexicographical order**.

 

 **Example 1:** 

```
Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
Explanation: "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.

```

 **Example 2:** 

```
Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
Output: ["the","is","sunny","day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.

```

 

 **Constraints:** 

- 1 <= words.length <= 500
- 1 <= words[i].length <= 10
- words[i] consists of lowercase English letters.
- k is in the range [1, The number of unique words[i]]

 

 **Follow-up:**  Could you solve it in `O(n log(k))` time and `O(n)` extra space?

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 58.41%)  
**Memory:** 46.4 MB (beats 84.58%)  
**Submitted:** 2026-10-04T14:49:44.905Z  

```java
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> temp = new ArrayList<>(map.keySet());
        Collections.sort(temp, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);

            if (freqA != freqB) {
                return freqB - freqA;
            }

            return a.compareTo(b);
        });

        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(temp.get(i));
        }

        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/top-k-frequent-words/)