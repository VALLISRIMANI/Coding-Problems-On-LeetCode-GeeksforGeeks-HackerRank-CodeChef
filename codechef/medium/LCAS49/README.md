# LCAS49

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Product of Two Numbers

Write a C program that takes two floating-point numbers as input and calculates their product. Print the result with two decimal places.

### Sample 1:
Input
Output

```
0.2 2.1
```

```
Product: 0.42

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T10:05:25.002Z  

```c_cpp
#include <stdio.h>

int main() {
    float num1, num2, product;
    scanf("%f %f", &num1, &num2);
    product = num1 * num2;
    printf("Product: %.2f", product);
    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS49)