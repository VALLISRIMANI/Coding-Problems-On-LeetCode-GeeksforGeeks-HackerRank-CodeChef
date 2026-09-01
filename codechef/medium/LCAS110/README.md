# LCAS110

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T09:31:57.432Z  

```c_cpp
#include <stdio.h>

int main() {
	// your code goes here
    int num;
    scanf("%d", &num);
    int sum = 0;
    
    while (num > 0) {
        if (num % 2 == 0) sum += num;
        num--;
    }
    
    printf("%d", sum);
}


```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS110)