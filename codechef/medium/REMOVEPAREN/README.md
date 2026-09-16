# REMOVEPAREN

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Remove Outermost Parentheses

You are given a valid parentheses string $s$.
A valid parentheses string is composed of `'('` and `')'` that are properly balanced.

A valid parentheses string is called  **primitive**  if it cannot be split into two smaller valid parentheses strings.

Your task is to  **remove the outermost parentheses**  from every primitive part of $s$ and print the final result.

## Function Declaration
### Function Name

$removeOuterParentheses$ – This function removes the outermost parentheses from every primitive substring of a valid parentheses string.

### Parameters
- $s$: A valid parentheses string consisting only of the characters ‘(’ and ‘)’. The string may contain multiple primitive valid parentheses substrings concatenated together.
### Return Value
- Returns a new string formed by removing the outermost parentheses from every primitive part of the input string.
- The returned string preserves the internal structure of the parentheses inside each primitive substring.
## Constraints
- $1 \le T \le 100$
- $1 \le |s| \le 10^{5}$
- ${s} \text{ contains only the characters `(' and `)'.}$
- ${s} \text{ is guaranteed to be a valid parentheses string.}$
### Input Format

The first line contains an integer $T$, the number of test cases.

Each test case consists of a single line containing the string $s$.

### Output Format

For each test case, print the modified string after removing the outermost parentheses.

### Sample 1:
Input
Output

```
4
((()))
(()(()))
()()
((())())(()(()))

```

```
(())
()(())
(())()()(())

```

### Explanation:

 **Test Case 1** :
`s = ((()))`
Primitive decomposition = `"((()))"`
After removing the outermost parentheses -> `(())`

 **Test Case 2:** 
`s = (()(()))` Primitive decomposition = `"(()(()))"` After removing the outermost -> `()(())`

 **Test Case 3:** 
`s = ()()`
Primitive decomposition = `"()" + "()"`
After removing the outermost from each -> `"" + "" = ""`

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T12:30:37.166Z  

```java
public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) result.append(ch);
                depth++;
            } else {
                depth--;
                if (depth > 0) result.append(ch);
            }
        }
        return result.toString();
    }

   

```

---

[View on CodeChef](https://www.codechef.com/problems/REMOVEPAREN)