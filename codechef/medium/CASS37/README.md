# CASS37

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Separate Odd Even

Write a program to separate odd and even integers of the given array and print them on two different lines in the same original order.

### Input Format
- The first line of input will contain a single positive integer $N$ - the length of array.
- The second line of input contains $N$ space separated integers - the elements of the array.
### Output Format
- Output $X$ space separated integers on the first line - the odd elements of the array, if their total count is $X$. The order must be same as in given array.
- Output $Y$ space separated integers on the second line - the even elements of the array, if their total count is $Y$. Again, the order must be the same.
### Constraints
- $1 \leq N \leq 100000$
- All array elements are distinct positive integer $\leq 100000$
### Sample 1:
Input
Output

```
6 
3 4 9 1 7 2
```

```
3 9 1 7
4 2
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:21:50.571Z  

```c_cpp
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int a[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    // Odd numbers
    for (int i = 0; i < n; i++) {
        if (a[i] % 2 == 1)
            printf("%d ", a[i]);
    }
    printf("\n");

    // Even numbers
    for (int i = 0; i < n; i++) {
        if (a[i] % 2 == 0)
            printf("%d ", a[i]);
    }
    printf("\n");

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CASS37)