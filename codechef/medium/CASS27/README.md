# CASS27

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Even Sum

Given two space separated integers as user inputs, print `YES` if their sum is even else `NO`.

### Sample 1:
Input
Output

```
2 3
```

```
NO
```

### Explanation:

2 + 3 = 5 (Odd)

### Sample 2:
Input
Output

```
3 5
```

```
YES
```

### Explanation:

3 + 5 = 8 (Even)

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T03:33:08.102Z  

```c_cpp
#include <stdio.h>

int main() {
    int a, b;
    // Take inputs and complete the code
    scanf("%d %d", &a, &b);
    
    if ((a + b) % 2 == 0) {
        printf("YES");
    } else {
        printf("NO");
    }
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CASS27)