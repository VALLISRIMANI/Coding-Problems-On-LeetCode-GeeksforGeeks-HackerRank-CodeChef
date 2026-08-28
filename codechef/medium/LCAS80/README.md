# LCAS80

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simple Calculator

Write a C program that takes two numbers and an operator (+, -, *, /) as input and performs the corresponding operation using a switch statement. Print the result upto 2 decimal places.

### Sample 1:
Input
Output

```
1 2
+
```

```
3.00
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T08:51:57.728Z  

```c_cpp
#include <stdio.h>

int main() {
    float num1, num2, result;
    char operator;
    scanf("%f %f", &num1, &num2);
    scanf(" %c", &operator);

    // Perform the operation using a switch statement
    switch (operator) {
        case '+':
            result = num1 + num2;
            printf("%.2f\n", result);
            break;
        case '-':
            result = num1 - num2;
            printf("%.2f\n", result);
            break;
        case '*':
            result = num1 * num2;
            printf("%.2f\n", result);
            break;
        case '/':
            if (num2 != 0) {
                result = num1 / num2;
                printf("%.2f\n", result);
            } else {
                printf("Error: Division by zero\n");
            }
            break;
        default:
            printf("Invalid operator\n");
    }

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS80)