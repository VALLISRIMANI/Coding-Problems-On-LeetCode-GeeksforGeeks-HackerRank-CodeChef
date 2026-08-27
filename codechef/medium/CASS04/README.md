# CASS04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Valid Triangle

Write a program to check if given three side of triangle form a valid traingle.

 **Note:**  A triangle is valid if sum of its any two sides is greater than the third side. If three sides are a, b and c, then three conditions should be met.

### Input Format
- The first and only line of input will contain three space separated integer - the side lengths of a triangle.
### Output Format
- Output on a single line: YES if the given sides form a valid triangle. Else NO.
### Sample 1:
Input
Output

```
3 4 5
```

```
YES
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T03:41:42.547Z  

```c_cpp
#include <stdio.h>

int main() {
    int a, b, c; // side lengths of triangle
    scanf("%d %d %d", &a, &b, &c);
    // Complete the code
    
    if ( a + b > c || a + c > b || b + c > a) {
        printf("YES");
    } else {
        printf("NO");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CASS04)