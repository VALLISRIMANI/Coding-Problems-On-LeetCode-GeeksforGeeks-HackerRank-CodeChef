# CASS31

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Maximum of Two Numbers

Write a C program to find maximum between two numbers using switch case statement.

### Input Format
- The first and only line of input contains two space separated integers.
### Output Format
- Output the maximum of two input integers.
### Sample 1:
Input
Output

```
3 4
```

```
4
```

### Sample 2:
Input
Output

```
7 2
```

```
7
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T08:41:53.742Z  

```c_cpp
// Update the code below
#include <stdio.h>

int main() {
    int num1, num2;
    scanf("%d %d", &num1, &num2);

    // Expression (num1 > num2) will return either 0 or 1 
    switch(num1 > num2) {   
        // If condition (num1 > num2) is false 
        case 0:
            printf("%d", num2);
            break;


        // If condition (num1 > num2) is true 
        case 1:
            printf("%d", num1);
            break;


    }

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CASS31)