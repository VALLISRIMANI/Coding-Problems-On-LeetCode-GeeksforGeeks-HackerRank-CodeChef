# LCAS129

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find First Occurrence

Write a program using a 'for' loop to find and print the index of the first occurrence of the number 8 in any given list of $N$ integers. If 8 is not present in the list, print -1.

Check the sample input / output below for further details.

Note that your output needs to take into account that the array is $0$ indexed.

### Sample 1:
Input
Output

```
5
2 4 8 12 8
```

```
2

```

### Explanation:

The first occurrence of the number 8 is at the 2nd index.

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T15:24:12.625Z  

```c_cpp
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    int numbers[n];
    for (int i = 0; i < n; ++i) {
        scanf("%d", &numbers[i]);
    }
    int index = -1;
    for (int i = 0; i < n; i++) {
        if (numbers[i] == 8) {
           index = i;       
           break;
        }
    }
    printf("%d", index);     
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS129)