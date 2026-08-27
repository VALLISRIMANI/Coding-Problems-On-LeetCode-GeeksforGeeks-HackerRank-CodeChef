# CASS05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T03:42:28.007Z  

```c_cpp
#include <stdio.h>

int main() {
    int a, b, c; // side lengths of triangle
    scanf("%d %d %d", &a, &b, &c);
    // Complete the code
    
    if ((a + b > c) && (a + c > b) && (b + c > a)) {
        printf("YES");
    } else {
        printf("NO");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CASS05)