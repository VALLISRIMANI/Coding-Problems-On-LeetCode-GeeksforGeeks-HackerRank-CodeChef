# CASS34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T09:35:01.323Z  

```c_cpp
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    // Complete the code
    int sum = 0;
    
    while (n > 0) {
        sum += n % 10;
        n /= 10;
    }
    
    printf("%d", sum);
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CASS34)