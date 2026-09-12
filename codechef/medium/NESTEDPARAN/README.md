# NESTEDPARAN

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chef and Nested Parentheses

Chef is playing with a string  **$s$**  that contains digits, arithmetic operators, and parentheses. He wants to find the  **maximum nesting depth**  of parentheses in the string.

The nesting depth is the maximum number of parentheses that are open at the same time. Chef wants you to help him calculate this value.

### Function Declaration
- Function Name: $maxNestingDepth$
- Parameters: $s$ (string) A string that may contain digits, arithmetic operators +, -, *, /, and parentheses (,).
- Return Value: Returns an int representing the maximum nesting depth of parentheses in the string.
## Constraints
- $1 \le T \le 100$
- $1 \le |s| \le 100$
- $s$ consists of digits $0$–$9$, arithmetic operators +, -, *, /, and parentheses (,)
- $s$ is guaranteed to be a valid parentheses string (VPS)
### Input Format
- The first line contains an integer $T$ — the number of test cases.
- Each of the next $T$ lines contains a string $s$ — a valid parentheses string (VPS).
### Output Format
- For each test case, print a single integer — the maximum nesting depth of parentheses in the string.
### Sample 1:
Input
Output

```
4
((1+2)+3)
(5+(6*7))
(1+(2*(3+4)))
()()()

```

```
2
2
3
1

```

### Explanation:

 **Test case 1** : Maximum nesting depth is 2.
 **Test case 2** : Maximum nesting depth is 2.
 **Test case 3** : Maximum nesting depth is 3 (inside `2*(3+4)`).
 **Test case 4** : Maximum nesting depth is 1 (no nested parentheses).

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T15:40:38.782Z  

```java
 private static int maxNestingDepth(String s) {
     //write your code here...
     int count = 0;
     int maxDepth = Integer.MIN_VALUE;
     
     for (int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);
         
         if (ch == '(') {
             count++;
         } else if (ch == ')') {
             maxDepth = Math.max(maxDepth, count);
             count--;
         }
     }
     
     return maxDepth == Integer.MIN_VALUE ? 0 : maxDepth;
 }
```

---

[View on CodeChef](https://www.codechef.com/problems/NESTEDPARAN)