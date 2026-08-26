# CASS26

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Another Coding Problem

Given two space separated integers as user inputs, $a$ and $b$, print the sum of $a^{\text{2}}$ and $b^{\text{3}}$.

### Sample 1:
Input
Output

```
 2 3
```

```
31
```

### Explanation:

$a^{\text{2}}$ + $b^{\text{3}}$ = $2^{\text{2}}$ + $3^{\text{3}}$ = 4 + 27 = 31

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T10:07:11.201Z  

```c_cpp
// Solution
#include <stdio.h>

int main() {
    int a, b;
    scanf("%d %d", &a, &b);
    int result = a * a + b * b * b;
    printf("%d", result);
    
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CASS26)