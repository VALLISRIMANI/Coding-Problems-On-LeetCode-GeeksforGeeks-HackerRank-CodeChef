# Remove All Adjacent Duplicates in String II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` and an integer `k`, a `k`  **duplicate removal**  consists of choosing `k` adjacent and equal letters from `s` and removing them, causing the left and the right side of the deleted substring to concatenate together.

We repeatedly make `k`  **duplicate removals**  on `s` until we no longer can.

Return  *the final string after all such duplicate removals have been made*. It is guaranteed that the answer is  **unique**.

 

 **Example 1:** 

```
Input: s = "abcd", k = 2
Output: "abcd"
Explanation: There's nothing to delete.
```

 **Example 2:** 

```
Input: s = "deeedbbcccbdaa", k = 3
Output: "aa"
Explanation: 
First delete "eee" and "ccc", get "ddbbbdaa"
Then delete "bbb", get "dddaa"
Finally delete "ddd", get "aa"
```

 **Example 3:** 

```
Input: s = "pbbcggttciiippooaais", k = 2
Output: "ps"

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- 2 <= k <= 104
- s only contains lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 29 ms (beats 50.81%)  
**Memory:** 46.6 MB (beats 88.45%)  
**Submitted:** 2026-10-29T06:56:03.435Z  

```java
class Solution {
     class Pair {
        char ch;
        int count;
        
        Pair (char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
    
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek().ch == ch) {
                st.peek().count++;
            } else {
                st.push(new Pair(ch, 1));
            }
            
            if (st.peek().count == k) {
                st.pop();
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (Pair p : st) {
            sb.append(String.valueOf(p.ch).repeat(p.count));
        }
        
        return sb.toString();
    }    
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/)