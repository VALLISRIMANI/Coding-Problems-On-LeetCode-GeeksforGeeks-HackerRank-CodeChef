# Match  Pattern with One to One Mapping

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a dictionary of strings  **d[]**  and a string  **pat**, find all strings in d[] that follow the same character pattern as pat. A string matches pat if there exists a  **one-to-one**  mapping between the characters of pat and the characters of the string. Return all matching strings.

 **Examples :** 

```
Input: d[] = ["abb", "abc", "xyz", "xyy"], pat  = "foo"
Output: ["abb", "xyy"]
Explanation: "abb" and "xyy" match the pattern because the second and third characters are the same, just like in "foo"
```

```
Input: d[] = ["aab", "mno", "xyx", "aba", "ccc"], pat = "xyx"
Output: ["xyx", "aba"]
Explanation: "xyx" and "aba" match the pattern because the first and third characters are the same, while the second character is different. The mapping is consistent and one-to-one.
```

 **Constraints:** 
1 ≤ d.size() ≤ 103
1 ≤ k, |d[i]| ≤ 100, where k is length of pattern.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T12:13:16.377Z  

```java
class Solution {
    public ArrayList<String> matchingStrings(ArrayList<String> d, String pat) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : pat.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        int patternSize = map.size();
        StringBuilder pattern = new StringBuilder();
        
        for (char ch : pat.toCharArray()) {
            pattern.append(map.get(ch));
        }
        
        ArrayList<String> result = new ArrayList<String>();
        for (String s : d) {
            if (s.length() != pat.length()) {
                continue;
            }
                        
            HashMap<Character, Integer> freqMap = new HashMap<>();
            
            for (char ch : s.toCharArray()) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
            
            if (freqMap.size() != patternSize) {
                continue;
            }
            
            StringBuilder patternn = new StringBuilder();
        
            for (char ch : s.toCharArray()) {
                patternn.append(freqMap.get(ch));
            }
            
            boolean match = true;
            for (int i = 0; i < pattern.length(); i++) {
                if (pattern.charAt(i) != patternn.charAt(i)) {
                    match = false;
                    break;
                }
            }
            
            if (match) result.add(s);
        }
        
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/match-specific-pattern/1)