# Count Occurences of Anagrams

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a word  **pat**  and a text  **txt**. Return the count of the occurrences of anagrams of the word in the text.

 **Example 1:** 

```
Input: txt = "forxxorfxdofr", pat = "for"
Output: 3
Explanation: for, orf and ofr appears in the txt, hence answer is 3.

```

 **Example 2:** 

```
Input: txt = "aabaabaa", pat = "aaba"
Output: 4
Explanation: aaba is present 4 times in txt.

```

 **Constraints:** 
1 <= |pat| <= |txt| <= 105
Both strings contain lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T05:47:42.008Z  

```java
class Solution {
    int search(String pat, String txt) {
        // code here
        int anagramsCount = 0;
        if (pat.length() > txt.length()) return anagramsCount;

        int[] freq = new int[26];
        for (char ch : pat.toCharArray()) {
            freq[ch - 'a']++;
        }

        int left = 0, right = 0, count = pat.length();

        while (right < txt.length()) {
            char ch = txt.charAt(right);

            if (freq[ch - 'a'] > 0) {
                count--;
            }

            freq[ch - 'a']--;
            right++;

            if (right - left > pat.length()) {
                char leftChar = txt.charAt(left);
                freq[leftChar - 'a']++;

                if (freq[leftChar - 'a'] > 0) {
                    count++;
                }

                left++;
            }

            if (count == 0) {
                anagramsCount++;
            }
        }

        return anagramsCount;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1)