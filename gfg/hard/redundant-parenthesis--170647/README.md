# Remove Redundant Parenthesis

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a valid expression containing only binary operators  **'+', '-', '*', '/'** and operands, remove all the redundant parenthesis.

A set of parenthesis is said to be redundant if, removing them, does not change the value of the expression.

 **Note:** The operators  **'+'**  and  **'-'**  have the same priority.  **' *'**  and  **'/'**  also have the same priority.  **'* '**  and  **'/'**  have more priority than  **'+'**  and  **'-'**.

 **Example 1:** 

```
Input:
Exp = (A*(B+C))
Output: A*(B+C)
Explanation: The outermost parenthesis
are redundant.

```

 **Example 2:** 

```
Input:
Exp = A+(B+(C))
Output: A+B+C
Explanation: All the parenthesis
are redundant.
```

 **Your Task:** 
You don't need to read input or print anything. Your task is to complete the function  **removeBrackets()**  which takes the string  **Exp** as input parameters and returns the updated expression.

 **Expected Time Complexity:**  O(N)
 **Expected Auxiliary Space:**  O(N)

 **Constraints:** 
1 < Length of Exp < 105
Exp contains uppercase English letters, '(', ')', '+', '-', '*' and '/'.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T06:06:30.250Z  

```java
class Solution {
    public String removeBrackets(String s) {
        // code here
        int n = s.length();
        boolean[] remove = new boolean[n];

        char[] leftOp = new char[n];
        char[] rightOp = new char[n];

        char last = '#';
        for (int i = 0; i < n; i++) {
            leftOp[i] = last;
            char ch = s.charAt(i);
            if (isOperator(ch)) last = ch;
        }

        char next = '#';
        for (int i = n - 1; i >= 0; i--) {
            rightOp[i] = next;
            char ch = s.charAt(i);
            if (isOperator(ch)) next = ch;
        }

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Boolean> hasPlusMinus = new ArrayDeque<>();
        Deque<Boolean> hasMulDiv = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
                hasPlusMinus.push(false);
                hasMulDiv.push(false);
            } else if (ch == '+' || ch == '-') {
                if (!hasPlusMinus.isEmpty()) {
                    hasPlusMinus.pop();
                    hasPlusMinus.push(true);
                }
            } else if (ch == '*' || ch == '/') {
                if (!hasMulDiv.isEmpty()) {
                    hasMulDiv.pop();
                    hasMulDiv.push(true);
                }
            } else if (ch == ')') {
                int openIdx = stack.pop();
                boolean pm = hasPlusMinus.pop();
                boolean md = hasMulDiv.pop();

                char left = leftOp[openIdx];
                char right = rightOp[i];

                boolean needed = false;
                
                if (pm && (left == '*' || left == '/' || right == '*' || right == '/')) {
                    needed = true;
                }
                
                if (left == '-' && pm) {
                    needed = true;
                }
                
                if (left == '/' && (pm || md)) {
                    needed = true;
                }

                if (!needed) {
                    remove[openIdx] = true;
                    remove[i] = true;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (!remove[i]) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    private boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/redundant-parenthesis--170647/1)