# LCAS69

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check Range

Write a program that takes an integer as input and determines whether the number lies in the inclusive range of  **10 to 20**.

The program should print:

- "In Range" if the number is between 10 and 20 (both inclusive).
- "Out of Range" otherwise.
### Sample 1:
Input
Output

```
15
```

```
In Range
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T03:38:42.381Z  

```c_cpp
#include <stdio.h>

int main() {
	// your code goes here
    int num;
    scanf("%d", &num);
    
    if (num >= 10 && num <= 20) {
        printf("In Range");
    } else {
        printf("Out of Range");
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS69)