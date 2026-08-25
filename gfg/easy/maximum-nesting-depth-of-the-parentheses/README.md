# Maximum Nesting Depth of the Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a valid arithmetic expression  **s**  consisting of digits, operators, and parentheses, determine the maximum nesting depth of the parentheses.

The nesting depth is defined as the maximum number of opening parentheses '(' that are open simultaneously at any position while traversing the expression from left to right.

 **Examples:** 

```
Input: s = "((5+2)(3+4)((6)))"
Output: 3
Explanation: The digit 6 is enclosed within three pairs of parentheses, so the maximum nesting depth is 3.
```

```
Input: s = "(43+4++3)((3)(9))+1"
Output: 2
Explanation: 
The deepest level of nesting in the expression is 2. 
Both the digits 3 and 9 in the second part of the expression are enclosed within two pairs of parentheses.

```

 **Constraints:** 
1 ≤ |s| ≤ 100
s consists of digits  **0-9**  and characters ' **+** ', ' **-** ', ' * ', ' **/** ', ' **(** ', and ' **)** '.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T06:53:32.923Z  

```java
class Solution {
    public static int maxDepth(String s) {
        // code here
        int depth = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                depth++;
                max = Math.max(max, depth);
            } else if (ch == ')') {
                depth--;
            }
        }

        return max;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-nesting-depth-of-the-parentheses/1)