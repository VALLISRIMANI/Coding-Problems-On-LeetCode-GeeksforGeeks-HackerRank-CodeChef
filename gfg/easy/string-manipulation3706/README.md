# Remove Two Consecutive Same

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Tom is a string freak. He has got sequences of words  **arr[]**  to manipulate. If in a sequence, two same words come together then Tom destroys each other. Find the number of words left in the sequence after this pairwise destruction. 

 **Examples:** 

```
Input: arr[] = ["ab", "aa", "aa", "bcd", "ab"]
Output: 3
Explanation: After the first iteration, we'll have: ab bcd ab. We can't further destroy more strings and hence we stop and the result is 3. 
```

```
Input: arr[] = ["tom", "jerry", "jerry", "tom"]
Output: 0
Explanation: After the first iteration, we'll have: tom tom. After the second iteration: 'empty-array'.Hence, the result is 0.
```

 **Constraints:** 
1 ≤ arr.size() ≤106
1 ≤ |arri| ≤ 50

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T10:18:05.387Z  

```java
class Solution {
    public int removeConsecutiveSame(String[] arr) {
        // code here
        Stack<String> st = new Stack<>();
        
        for (String str : arr) {
            if (st.isEmpty() || !st.peek().equals(str)) {
                st.push(str);
            } else {
                while (!st.isEmpty() && st.peek().equals(str)) st.pop();
            }
        }
        
        return st.size();
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/string-manipulation3706/1)