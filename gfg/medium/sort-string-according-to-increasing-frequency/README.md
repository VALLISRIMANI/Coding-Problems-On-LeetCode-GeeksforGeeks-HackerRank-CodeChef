# Sort by Frequency

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **s**, the task is to  **arrange**  the string according to the  **frequency**  of each character, in ascending order. If two elements have the  **same**  frequency, then they are sorted in  **lexicographical**  order.

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: forggkksseeee
Explanation: All the characters with minimum frequency will occur first and the one with same frequency will be arranged lexicographically.
```

```
Input: s = "abc"
Output: abc
Explanation: The frequency is one for all characters hence they'll be arranged lexicographically.
```

**Constraints :
**1 ≤ s.length() ≤ 106
s consist of lowercase english alphabets.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T10:33:06.034Z  

```java
class Solution {
    public String frequencySort(String s) {
        // code here
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(freq.keySet());
        Collections.sort(chars, (a, b) -> {
            int fa = freq.get(a);
            int fb = freq.get(b);

            if (fa != fb) {
                return fa - fb;
            }

            return Character.compare(a, b);
        });

        StringBuilder result = new StringBuilder();
        for (char ch : chars) {
            int frequency = freq.get(ch);

            for (int i = 0; i < frequency; i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-string-according-to-increasing-frequency/1)