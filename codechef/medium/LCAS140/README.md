# LCAS140

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fibonacci Series using Recurssion

Write a C program that generates and prints the fibonacci(n) using a recurssion function. The function should take an integer n as an argument and returns the Fibonacci to the nth term.

 **Note:**  The  **Fibonacci sequence**  $F_0, F_1, \ldots F_n$ is a special infinite sequence of non-negative integers, where $F_0 = 0$, $F_1 = 1$ and for each integer $n \ge 2$, $F_n = F_{n-1} + F_{n-2}$.

### Sample 1:
Input
Output

```
6
```

```
8
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:24:22.917Z  

```c_cpp
#include <stdio.h>

int fibonacci(int n) {
    if (n <= 1) {
        return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

int main() {
    int terms;
    scanf("%d", &terms);
    printf("%d",fibonacci(terms));

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS140)