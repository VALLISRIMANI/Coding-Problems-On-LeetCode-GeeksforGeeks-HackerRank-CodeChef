# All String Permutations in Sorted Order

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string  **s**. Find all permutations  of a given string. Return the permutations in lexicographically non-decreasing order.

 **Examples :** 

```
Input: s = "AA"
Output: ["AA", "AA"]
Explanation: There are total 2 permutations, as given in the output.

```

```
Input: s = "ABC"
Output: ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]
Explanation: There are total 6 permutations, as given in the output.
```

 **Constraints:** 
1 ≤ s.size() ≤ 5

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T07:15:26.029Z  

```java
class Solution {
    public ArrayList<String> permutation(String s) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), new boolean[s.length()], new StringBuilder(), result);
        Collections.sort(result);
        return result;
    }
    
    public void backtrack(char[] chars, boolean[] used, StringBuilder current, ArrayList<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }
        
        for (int i = 0; i < chars.length; i++) {
            if (used[i]) {
                continue;
            }
            
            current.append(chars[i]);
            used[i] = true;
            
            backtrack(chars, used, current, result);
            
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string-1587115620/1)