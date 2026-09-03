# LCAS139

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Power of a Number

Write a C program that calculates and prints the power of a number.

You are required to implement a function named `power` that takes two integers as arguments:

$base:$ the number to be raised
$exponent:$ the power to which the base is raised

The function should return the result of raising $base$ to the power of $exponent$.

### Input Format
- A single line containing two integers: $base$ and $exponent$
### Output Format
- Print a single integer representing $base$ raised to the power of $exponent$
### Sample 1:
Input
Output

```
2 3
```

```
8
```

### Explanation:

$2^{\text{3}}$ = 8

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:24:11.187Z  

```c_cpp
#include <stdio.h>

int power(int base, int exponent) {
    int result = 1;

    for (int i = 1; i <= exponent; i++) {
        result *= base;
    }

    return result;
}

int main() {
    int base, exponent;
    scanf("%d", &base);
    scanf("%d", &exponent);

    int result = power(base, exponent);

    printf("%d\n",result);

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS139)