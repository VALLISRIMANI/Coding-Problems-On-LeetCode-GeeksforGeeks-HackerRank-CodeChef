# CASS06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of Digit

Given a positive integer $N$, find sum of its digits.

### Input Format
- The first and only line of input will contain a single integer $N$.
### Output Format
- Output on a single line: the sum of digits of $N$.
### Sample 1:
Input
Output

```
87431
```

```
23
```

### Explanation:

8 + 7 + 4 + 3 + 1 = 23

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T09:34:59.792Z  

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

[View on CodeChef](https://www.codechef.com/problems/CASS06)