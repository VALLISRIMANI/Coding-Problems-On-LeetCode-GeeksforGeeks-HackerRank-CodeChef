# PPSC139

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Pointers - Debug this code

Listen

The code in the IDE is trying to write a program that takes an integer as input, increments its value by 1 using a function, and then prints the updated value.

The code is trying to use the concept of pointers - however, it is incorrect.

Debug the code to solve this problem.

### Sample 1:
Input
Output

```
5
```

```
6
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T13:18:16.934Z  

```c_cpp
// Debug the code below to solve the problem

#include <stdio.h>

// Function to increment a number using a pointer
void incrementByOne(int *numPtr) {
    (*numPtr)++; // Increment the value pointed to by numPtr
}

int main() {
    int number;
    scanf("%d", &number);

    // Call the increment function and pass the address of 'number'
    incrementByOne(&number);

    printf("%d\n", number);

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PPSC139)