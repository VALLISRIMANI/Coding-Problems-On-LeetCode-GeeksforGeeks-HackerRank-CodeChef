# Check if Permutation is Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **txt** and  **pat** having lowercase letters, the task is to check if any permutation of  **pat**  is a substring of  **txt**.

 **Examples:** 

```
Input: txt = "geeks", pat = "eke"
Output: true
Explanation: "eek" is a permutation of "eke" which exists in "geeks".
```

```
Input: txt = "programming", pat = "rain"
Output: false
Explanation: No permutation of "rain" exists as a substring in "programming".

```

 **Constraints:** 
1 ≤ txt.size() ≤ 105
1 ≤ pat.size() ≤ txt.size()
Both the strings consist of lowercase English alphabets.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T08:53:34.229Z  

```java
class Solution {
    boolean search(String txt, String pat) {
        // Write your code here
        int n = txt.length();
        int k = pat.length();
        
        int[] patFreq = new int[26];
        int[] winFreq = new int[26];
        
        for (int i = 0; i < k; i++) {
            patFreq[pat.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < n; i++) {
            winFreq[txt.charAt(i) - 'a']++;
            
            if (i >= k) {
                winFreq[txt.charAt(i - k) - 'a']--;
            }
            
            if (i >= k - 1 && Arrays.equals(patFreq, winFreq)) {
                return true;
            }
        }
        
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-permutation-is-substring/1)