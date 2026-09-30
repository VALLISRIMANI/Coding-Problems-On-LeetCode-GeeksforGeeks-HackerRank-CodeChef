# K Length Substrings With k-1 Distinct

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **s**  consisting only lowercase alphabets and an integer  **k**. Find the count of all substrings of length  **k**  which have exactly  **k-1** distinct characters.

 **Examples:** 

```
Input: s = "abcc", k = 2
Output: 1
Explanation: Possible substring of length k = 2 are,
ab : 2 distinct characters
bc : 2 distinct characters
cc : 1 distinct characters
Only one valid substring so, count is equal to 1.
```

```
Input: "aabab", k = 3
Output: 3
Explanation: Possible substring of length k = 3 are, 
aab : 2 distinct charcters
aba : 2 distinct characters
bab : 2 distinct characters
All these substring are valid so, the total count is equal to 3.
```

 **Constrains:** 
1 ≤ s.size() ≤ 105
2 ≤ k ≤ 27

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T14:02:30.316Z  

```java
class Solution {
    public int substrCount(String s, int k) {
        // code here
        /*
        if (s == null || s.length() < k) {
            return 0;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, count = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            
            if (map.size() >= k || (right - left + 1) > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                
                left++;
            }
            
            if ((right - left + 1) == k && map.size() == k - 1) {
                count++;
            }
            
        }
        
        return count;
        */
        
        if (s == null || s.length() < k) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, count = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            if (right - left + 1 == k) {
                if (map.size() == k - 1) {
                    count++;
                }

                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                
                left++;
            }
        }

        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/substrings-of-length-k-with-k-1-distinct-elements/1)