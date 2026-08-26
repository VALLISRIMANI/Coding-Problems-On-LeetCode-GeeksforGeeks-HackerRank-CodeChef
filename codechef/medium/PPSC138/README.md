# PPSC138

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Pointer Declaration and Initialization

Listen

 **Pointer Declaration**  While variables store the actual value, pointers store the addresses.
The syntax for declaring a pointer is as follows:

```
data_type *pointer_name;

```

 **Pointer Initialization**  After declaring a pointer, you typically initialize it with the memory address of another variable. This allows the pointer to "point" to that variable. You can use the `address-of` operator (**`&`**) to obtain the memory address of a variable.

```
int main() {
    int num = 42;  // Declare and initialize an integer variable
    int *ptr;      // Declare a pointer to an integer
    ptr = &num;    // Initialize the pointer with the address of 'num'
    return 0;
}

```

 *Review the code in the IDE to understand how pointers are used to swap two numbers.* 

### Sample 1:
Input
Output

```
5 7
```

```
7 5
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T13:07:44.619Z  

```c_cpp
#include <stdio.h>

// Function to swap two numbers using pointers
void swap(int *a, int *b) {
    int temp = *a;  // Store the value at address 'a' in a temporary variable 'temp'
    *a = *b;        // Set the value at address 'a' to the value at address 'b'
    *b = temp;      // Set the value at address 'b' to the value stored in 'temp'
}

int main() {
    int num1, num2;

    // Read the first number from the user and store it in 'num1'
    scanf("%d", &num1);

    // Read the second number from the user and store it in 'num2'
    scanf("%d", &num2);

    // Call the swap function with the addresses of 'num1' and 'num2'
    swap(&num1, &num2);

    // Print the swapped numbers
    printf("%d %d\n", num1, num2);

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PPSC138)