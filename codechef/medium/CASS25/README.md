# CASS25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### String Length II - MCQ

Which function is used to find the length of a string in C?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T08:51:10.575Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/CASS25)