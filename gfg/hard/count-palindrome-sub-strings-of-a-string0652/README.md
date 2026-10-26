# Palindrome SubStrings Count

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string  **s**, count all palindromic sub-strings present in the string. The length of the palindromic sub-string must be greater than or equal to  **2**.

 **Note:** A substring is palindromic if it reads the same forwards and backwards.

 **Examples:** 

```
Input: s = "abaab"
Output: 3
Explanation: All palindromic substrings (of length > 1) are: "aba", "aa", "baab".

```

```
Input: s = "aaa"
Output: 3
Explanation: All palindromic substrings (of length > 1) are: "aa", "aa", "aaa".
```

```
Input: s = "abbaeae"
Output: 4
Explanation: All palindromic substrings (of length > 1) are: "bb", "abba", "aea", "eae".
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T14:15:33.677Z  

```java
class Solution {
    public int countPS(String s) {
        // code here
        int n = s.length();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 >= 2) result++;
                left--;
                right++;
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 >= 2) result++;
                left--;
                right++;
            }
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-palindrome-sub-strings-of-a-string0652/1)