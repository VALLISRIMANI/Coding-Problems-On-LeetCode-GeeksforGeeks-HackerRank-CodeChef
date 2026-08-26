# LCAS50

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Reverse Digits Output

Write a C program that takes a three-digit integer as input and prints its digits in reverse order (With a string message and spaces between the digits. See the sample output).

### Sample 1:
Input
Output

```
456
```

```
Digits in reverse order: 6 5 4

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T10:06:25.748Z  

```c_cpp
#include <stdio.h>

int main() {
    int number, digit1, digit2, digit3;
    scanf("%d", &number);
    digit1 = number % 10;
    digit2 = (number / 10) % 10;
    digit3 = number / 100;
    printf("Digits in reverse order: %d %d %d", digit1, digit2, digit3);
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS50)