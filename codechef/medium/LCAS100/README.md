# LCAS100

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find Max In Array

Write a C program that takes input for an array of 8 integers and finds the maximum value in the array. Print the maximum value.

### Input Format
- A single line containing 8 space-separated integers.
### Sample 1:
Input
Output

```
1 3 2 4 6 5 7 8
```

```
8
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:21:10.358Z  

```c_cpp
#include <stdio.h>

int main() {
    int values[8];
    int max;

    // Input: Enter 8 integers
    for (int i = 0; i < 8; i++) {
        scanf("%d", &values[i]);
    }

    // Initialize max with the first element
    max = values[0];

    // Find the maximum value in the array
    for (int i = 1; i < 8; i++) {
        if (values[i] > max) {
            max = values[i];
        }
    }

    // Output: Print the maximum value
    printf("%d\n", max);

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS100)