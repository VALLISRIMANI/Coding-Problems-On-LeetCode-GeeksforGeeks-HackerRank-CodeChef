# Distinct Permutations of a String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **s**, which may contain duplicate characters, generate all possible  **unique**  permutations of the string.

 **Note:**  You may return the permutations in any order.

 **Examples:** 

```
Input: s = "ABC"
Output: ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]
Explanation: Given string ABC has 6 unique permutations.

```

```
Input: s = "ABSG"
Output: ["ABGS", "ABSG", "AGBS", "AGSB", "ASBG", "ASGB", "BAGS", "BASG", "BGAS", "BGSA", "BSAG", "BSGA", "GABS", "GASB", "GBAS", "GBSA", "GSAB", "GSBA", "SABG", "SAGB", "SBAG", "SBGA", "SGAB", "SGBA"]
Explanation: Given string ABSG has 24 unique permutations.

```

```
Input: s = "AAA"
Output: ["AAA"]
Explanation: No other unique permutations can be formed as all the characters are same.
```

 **Constraints:** 
1 ≤ s.size() ≤ 9
s contains only uppercase English letters.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T07:35:31.778Z  

```java
class Solution {
    static ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        backtrack(chars, new boolean[s.length()], new StringBuilder(), result);
        return result;
    }

    public static void backtrack(char[] chars, boolean[] used, StringBuilder current, ArrayList<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i]) {
                continue;
            }
            
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) {
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

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1)