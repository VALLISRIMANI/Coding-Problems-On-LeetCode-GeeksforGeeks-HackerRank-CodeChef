# LCAS30B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Temperature Converter - II

Now do the reverse, write a C program that converts a temperature in Fahrenheit to Celsius. The Fahrenheit temperature should be stored in a float variable fahrenheit, and the Celsius equivalent should be printed using a single printf statement.

We can use the same relation between the two scales:

```
fahrenheit = (celsius * 9/5) + 32;

```

Take the Fahrenheit temperature to be 98.3.

### Sample 1:
Input
Output

```
 
```

```
36.83333
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T14:49:20.826Z  

```c_cpp
#include <stdio.h>

int main() {
    float fahrenheit = 98.3;
    // Complete the code
    float celsius = (fahrenheit - 32) * 5 / 9;
    printf("%f", celsius);
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS30B)