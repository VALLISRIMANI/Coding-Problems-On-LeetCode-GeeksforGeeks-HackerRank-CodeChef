# Power Set Using Recursion

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string. You need to return the **power-set** (in any order) of the string.
 **Note:**  The string  **s**  contains lowercase letter of alphabet.

 **Examples:** 

```
Input: s = a
Output: ["","a"]
Explanation: empty string and "a" are only sets.
```

```
Input: s = abc
Output: ["", "a", "ab", "abc", "ac", "b", "bc", "c"]
Explanation: empty string, a, ab, abc, ac, b, bc, c are the sets.

```

 **Constraints:** 
1 ≤ s.length() ≤ 10

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-10T04:10:44.211Z  

```java
class Solution {
    public ArrayList<String> powerSet(String s) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        helper(0, s, "", result);
        return result;
    }
    
    private void helper(int idx, String s, String curr, List<String> result) {
        if (idx == s.length()) {
            result.add(curr);
            return;
        }
        
        helper(idx + 1, s, curr + s.charAt(idx), result);
        
        helper(idx + 1, s, curr, result);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/power-set-using-recursion/1)