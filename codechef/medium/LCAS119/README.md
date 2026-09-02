# LCAS119

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of Squares

Write a C program that calculates and prints the sum of the squares of all numbers from 1 to a given positive integer n using a for loop.

### Sample 1:
Input
Output

```
4
```

```
30
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T15:21:30.898Z  

```c_cpp
#include <stdio.h>

int main() {
    int n, sum = 0;
    scanf("%d", &n);

    for (int i = 1; i <= n; i++) {
        sum += i * i;
    }

    printf("%d", sum);

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS119)