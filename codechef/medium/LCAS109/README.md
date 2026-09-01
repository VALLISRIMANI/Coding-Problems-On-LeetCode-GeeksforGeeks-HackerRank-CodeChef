# LCAS109

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Even Sum

Write a C program that calculates and prints the sum of all even numbers from 1 to a given positive integer n. Use a while loop to iterate through the numbers.

### Sample 1:
Input
Output

```
6
```

```
12
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T09:31:48.722Z  

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

[View on CodeChef](https://www.codechef.com/problems/LCAS109)