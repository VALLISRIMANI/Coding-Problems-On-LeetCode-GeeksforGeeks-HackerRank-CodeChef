# LCAS70

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check for Even and Divisibility by 5

Write a C program that takes an integer as input and checks if the number is both  **even**  and  **divisible by 5**. If the number meets both conditions, the program should print `"Even and Divisible by 5"`. Otherwise, it should print `"Not Even or Not Divisible by 5"`.

You should use logical operators in your program to combine the conditions for checking evenness and divisibility by 5.

### Sample 1:
Input
Output

```
 10
```

```
Even and Divisible by 5
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T03:40:06.372Z  

```c_cpp
#include <stdio.h>

int main() {
	// your code goes here
    int num;
    scanf("%d", &num);
    
    if (num % 2 == 0 && num % 5 == 0) {
        printf("Even and Divisible by 5");
    } else {
        printf("Not Even or Not Divisible by 5");
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS70)