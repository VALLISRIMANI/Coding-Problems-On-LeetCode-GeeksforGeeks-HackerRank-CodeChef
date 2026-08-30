# CPRACMCQ7

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Absolute Difference Calculation - MCQ

Given $X$ and $Y$, which of these statements outputs the absolute difference between them?

 **Option 1:** 

```
if (X >= Y) {
    printf("%d", X - Y);
}
else{
    printf("%d", Y - X);
}

```

 **Option 2:** 

```
if (X > Y){
    printf("%d", X - Y);
}
else{
    printf("%d", Y - X);
}

```

 **Option 3:** 

```
if (X > Y){
    printf("%d", X - Y);
}
printf("%d", Y - X);

```

 **Option 4:** 

```
if (X > Y{
    printf("%d", Y - X);
}
else{
    printf("%d", X - Y);
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T04:31:16.247Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/CPRACMCQ7)