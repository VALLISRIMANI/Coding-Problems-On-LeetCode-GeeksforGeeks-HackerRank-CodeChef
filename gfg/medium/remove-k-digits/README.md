# Remove K Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a non-negative integer  **s**  represented as a string and an integer **k**, remove exactly  **k**  digits from the string so that the resulting number is the  **smallest**  possible, while maintaining the relative order of the remaining digits.

 **Note :** The resulting number must not contain any leading zeros.
If the resulting number is an empty string after the removal, return "0".

 **Examples:** 

```
Input: s = "4325043", k = 3
Output: 2043
Explanation: Remove the three digits 4, 3, and 5 to form the new number "2043" which is smallest among all possible removal.

```

```
Input: s = "765028321", k = 5
Output: 221
Explanation: Remove the five digits 7, 6, 5, 8 and 3 to form the new number "0221". Since we are not supposed to keep leading 0s, we get "221".
```

 **Constraints:** 
1 ≤ k ≤ |s| ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T14:34:21.873Z  

```java
class Solution {
    public String removeKdig(String s, int k) {
        // code here
        int n = s.length();
        if (k >= n) return "0";
        
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            
            st.push(ch);
        }
        
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        sb.reverse();
        
        int index = 0;
        while (index < sb.length() && sb.charAt(index) == '0') {
            index++;
        }
        String result = sb.substring(index);
        
        return result.isEmpty() ? "0" : result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-k-digits/1)