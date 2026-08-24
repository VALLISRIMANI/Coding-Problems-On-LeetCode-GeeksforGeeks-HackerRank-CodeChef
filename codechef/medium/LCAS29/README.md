# LCAS29

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Variable Swap Challenge

Write a C program that swaps the values of two integer variables, a =5 and b = 10, and prints their new values using a single printf statement with a space between them

### Sample 1:
Input
Output

```
 
```

```
10 5
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T14:45:25.052Z  

```c_cpp
#include <stdio.h>

int main() {
    int a = 5, b = 10;
    // Complete the code
    int temp = a;
    a = b;
    b = temp;
    
    printf("%d %d", a, b);
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS29)