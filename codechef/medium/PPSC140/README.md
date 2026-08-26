# PPSC140

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Pointer Arithmetic

Listen

Pointer arithmetic is a feature in programming languages like C and C++ that allows you to perform arithmetic operations on pointers.
These operations involve adding or subtracting integer values to/from pointers, which can be useful for navigating through memory and accessing elements of arrays or other data structures.

In pointer arithmetic, the size of the data type being pointed to matters.
When you perform arithmetic on a pointer, it's adjusted by a number of bytes corresponding to the size of the underlying data type.

- Increment (++) and Decrement (--) Operators: When you increment a pointer (ptr++), it moves forward in memory by the size of the data type it points to. When you decrement a pointer (ptr--), it moves backward in memory by the size of the data type.
- Addition (+) and Subtraction (-) Operators: Adding an integer value to a pointer (ptr + n) moves it forward by n times the size of the data type. Subtracting an integer value from a pointer (ptr - n) moves it backward by n times the size of the data type.
### Task

 *Review the code in the IDE. Click on 'Submit' to know the result*

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T13:15:54.194Z  

```c_cpp
#include <stdio.h>

int main() {
    int numbers[] = {10, 20, 30, 40, 50};
    int *ptr = numbers; // Pointer to the first element

    for (int i = 0; i < 5; i++) {
        printf("%d\n", *ptr);
        ptr++; // Move the pointer to the next element
    }

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PPSC140)