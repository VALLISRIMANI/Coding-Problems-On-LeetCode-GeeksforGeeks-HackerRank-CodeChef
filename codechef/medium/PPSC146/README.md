# PPSC146

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a code which does the following:

- Accepts three integer inputs from the user.
- Prints out the maximum and the minimum of these 3 integers on separate lines.
- Update the function and use what you have learnt in pointers.

Notice the call by reference behaviour as you solve this problem.

### Sample 1:
Input
Output

```
6 4 5
```

```
4
6
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T13:27:44.712Z  

```c_cpp
#include <stdio.h>

// Function to find the maximum and minimum of three integers
void findMaxMin(int *a, int *b, int *c, int *max, int *min) {
    *max = *a;
    *min = *a;
    // Update the code below to solve the problem
    
    if (*b > *max) *max = *b;
    if (*c > *max) *max = *c;
    
    if (*b < *min) *min = *b;
    if (*c < *min) *min = *c;
    
}

int main() {
    int num1, num2, num3;
    int max, min;

    // Read three integer values from the user
    scanf("%d %d %d", &num1, &num2, &num3);

    // Call the function to find the maximum and minimum
    findMaxMin(&num1, &num2, &num3, &max, &min);

    // Print the maximum and minimum values
    printf("%d\n", min);
    printf("%d\n", max);

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PPSC146)