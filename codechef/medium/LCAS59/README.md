# LCAS59

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Even Or Odd

Write a C program that takes an integer as input and determines whether it is an even or odd number. Print "Even" if the number is even and "Odd" if it is odd.

### Sample 1:
Input
Output

```
 5
```

```
Odd
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T03:29:42.046Z  

```c_cpp
#include <stdio.h>

int main() {
	// your code goes here
    int num;
    scanf("%d", &num);
    
    if (num % 2 == 0) {
        printf("Even");
    } else {
        printf("Odd");
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS59)