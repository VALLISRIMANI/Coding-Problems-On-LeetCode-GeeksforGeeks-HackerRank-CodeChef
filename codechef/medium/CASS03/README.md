# CASS03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### First ten multiples

Write a program to print first ten multiples of $N$.

### Input Format
- The first and only line of input will contain a single integer $N$.
### Output Format
- Output on a single line, ten space separated numbers - first ten multiples of $N$.
### Sample 1:
Input
Output

```
2
```

```
2 4 6 8 10 12 14 16 18 20
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T15:21:16.257Z  

```c_cpp
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    for(int i = 1; i <= 10; i++)
      printf("%d ", n * i);
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CASS03)