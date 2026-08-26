# PPSC148 - Rating 970

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Factorial using Pointer

Listen

You are given an integer $N$.
Update the function given in the IDE and use pointers to output the factorial of integer $N$.

### Sample 1:
Input
Output

```
5
```

```
120
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T13:45:18.582Z  

```c_cpp
#include <stdio.h>

void calculateFactorial(int *numPtr) {
   // Complete the function
   int n = *numPtr;
   int fact = 1;
   
   for (int i = 1; i <= n; i++) {
       fact *= i;
   }
   *numPtr = fact;
}

int main() {
    int number;
    scanf("%d", &number);

    calculateFactorial(&number); // Pass the address of 'number' to the function

    printf("%d\n", number); // number should store factorial of number after function call

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PPSC148)