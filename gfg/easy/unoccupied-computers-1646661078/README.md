# Unoccupied Computers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A cafe has n computers. The customer events are represented by a string s of uppercase English letters, where each distinct letter appears exactly twice:

- The first occurrence denotes the customer's arrival.
- The second occurrence denotes the customer's departure.

A customer is assigned a computer only if one is available at the time of arrival, otherwise the customer is rejected and does not use a computer.

Return the number of customers who could not be assigned a computer upon arrival.

 **Examples:** 

```
Input: n = 3, s = "GACCBDDBAGEE"
Output: 1
Explanation: Only D will not be able to get any computer. So the answer is 1.
```

```
Input: n = 1, s = "ABCBAC"
Output: 2
Explanation: B and C will not be able to get any computers. So the answer is 2.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T04:13:51.936Z  

```java
class Solution {
    public int solve(int n, String s) {
        // code here
        Set<Character> set = new HashSet<>();
        Set<Character> rejected = new HashSet<>();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (!set.contains(ch) && !rejected.contains(ch)) {
                if (set.size() < n) {
                    set.add(ch);
                } else {
                    count++;
                    rejected.add(ch);
                }
            } else {
                if (set.contains(ch)) {
                    set.remove(ch);
                }
            }
        }
        
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/unoccupied-computers-1646661078/1)