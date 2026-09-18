# Keypad Typing

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**  consisting of lowercase English letters. Each letter corresponds to a number on a standard keypad, as shown in the figure. Replace every character in s with its corresponding keypad number and return the resulting numeric string.

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: 4335736743357
Explanation: Each character in the string "geeksforgeeks" is converted to its corresponding digit based on the keypad, and the digits are concatenated in order. This results in the number 4335736743357, which is the required decimal representation.

```

```
Input: s = "geeksquiz"
Output: 433577849
Explanation: Each character in the string "geeksquiz" is converted to its corresponding digit based on the keypad, and the digits are concatenated in order. This results in the number 433577849, which is the required decimal representation.
```

 **Constraints:** 
1 ≤ s.size() ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T16:14:14.341Z  

```java
class Solution {
    public String printNumber(String s) {
        // code here
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch <= 'c')
                ans.append('2');
            else if (ch <= 'f')
                ans.append('3');
            else if (ch <= 'i')
                ans.append('4');
            else if (ch <= 'l')
                ans.append('5');
            else if (ch <= 'o')
                ans.append('6');
            else if (ch <= 's')
                ans.append('7');
            else if (ch <= 'v')
                ans.append('8');
            else
                ans.append('9');
        }

        return ans.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/keypad-typing0119/1)