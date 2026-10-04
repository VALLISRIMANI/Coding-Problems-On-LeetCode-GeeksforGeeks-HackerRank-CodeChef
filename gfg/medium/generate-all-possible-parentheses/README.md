# Generate Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a number  **n**, return all the combinations of balanced parentheses of length n.
 **Note:**  A sequence of parentheses is  **balanced**  if every opening bracket has a corresponding closing bracket in the  **correct order**.
For example, "(())", "()()", and "(()())" are balanced, whereas ")()(", "))((", and "()))" are not.

 **Examples:** 

```
Input: n = 6
Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]
Explanation: These are the only possible valid balanced parentheses.
```

```
Input: n = 4
Output: ["(())", "()()"]
Explanation: These are the only possible valid balanced parentheses.
```

 **Constraints:** 
1 ≤ n ≤ 16
n % 2 == 0

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T14:11:26.222Z  

```java
class Solution {
    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n / 2);
        return result;
    }
    
    private void backtrack(ArrayList<String> result, String current, int open, int close, int n) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        } 
        
        if (open < n) backtrack(result, current + "(", open + 1, close, n);
        if (close < open) backtrack(result, current + ")", open, close + 1, n);
    } 
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/generate-all-possible-parentheses/1)