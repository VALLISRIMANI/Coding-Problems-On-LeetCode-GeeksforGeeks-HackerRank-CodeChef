# CASS24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Count UpperCase and LowerCase Characters

Write a C program that prints the count of uppercase and lowercase alphabets in the given string.

### Task
- A string variable str is given in the IDE, with some string assigned to it.
- The string consists of only English alphabets.
- Count the uppercase and lowercase alphabets and print them on console with a space between them.

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T08:50:40.307Z  

```c_cpp
#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char str[] = "ChefSaysHi";
    int upper_case = 0;
    int lower_case = 0;

    for (int i = 0; i < strlen(str); i++) {
        if (isupper(str[i])) {
            upper_case++;
        } else if (islower(str[i])) {
            lower_case++;
        }
    }
    
    printf("%d %d\n", upper_case, lower_case);
    
    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CASS24)