# LCAS99

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Array Sum

Write a C program that takes input for an array of 5 integers and calculates the sum of all elements in the array. Print the sum.

### Sample 1:
Input
Output

```
1 2 3 4 5
```

```
15
```

### Sample 2:
Input
Output

```
2 3 1 6 9
```

```
21
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:20:53.894Z  

```c_cpp
#include <stdio.h>

int main() {
    int numbers[5];
    int sum = 0;

    // Input: Enter 5 integers
    for (int i = 0; i < 5; i++) {
        scanf("%d", &numbers[i]);
    }

    // Calculate the sum of array elements
    for (int i = 0; i < 5; i++) {
        sum += numbers[i];
    }

    // Output: Print the sum
    printf("%d\n", sum);

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS99)