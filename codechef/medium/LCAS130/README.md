# LCAS130

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Skip Odd Numbers

Write a C program that prints all the even numbers till the input given by the user.

### Sample 1:
Input
Output

```
10
```

```
2 4 6 8 10
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T15:24:25.690Z  

```c_cpp
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    for (int i = 1; i <= n; i++) {
        if (i % 2 != 0)
            continue;

        printf("%d ", i);
    }

    printf("\n");

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS130)