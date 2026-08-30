# ABDIFF - Rating 347

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T04:31:18.016Z  

```js
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    // Total cells is n * n, and half of them are black
    int black_cells = (n * n) / 2;
    
    printf("%d\n", black_cells);

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ABDIFF)