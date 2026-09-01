# LCAS110

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Reverse a Number

Write a C program that takes an integer as input and prints its reverse. Use a while loop for the reversal process.

### Sample 1:
Input
Output

```
12345
```

```
54321
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T09:34:10.478Z  

```c_cpp
#include <stdio.h>

int main() {
	// your code goes here
    int num;
    scanf("%d", &num);
    
    int reverse = 0;
    
    while (num != 0) {
        reverse = reverse * 10 + (num % 10);
        num /= 10;
    }
    
    printf("%d", reverse);
}


```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS110)