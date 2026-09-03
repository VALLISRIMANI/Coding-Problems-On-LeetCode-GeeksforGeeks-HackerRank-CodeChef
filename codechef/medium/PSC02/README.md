# PSC02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Reverse String

Write a C program to reverse a given string using pointers.

### Input Format
- The first and only line of input contains a single string $S$ - The string which needs to be reversed.
### Output Format
- Output on a single line, the reversed string.
### Sample 1:
Input
Output

```
codechef
```

```
fehcedoc
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:25:31.463Z  

```c_cpp
#include <stdio.h>
#include <string.h>

// Function to reverse a string using pointers
void reverseString(char *str) {
    // Pointer to the beginning of the string
    char *start = str;
    // Pointer to the end of the string (excluding the null terminator)
    char *end = str + strlen(str) - 1;
    char temp;

    // Reverse the string by swapping characters from start to end
    while (start < end) {
        // Swap characters
        temp = *start;
        *start = *end;
        *end = temp;

        // Move pointers
        start++;
        end--;
    }
}

int main() {
    char str[100];

    scanf("%s", &str);

    // Call the reverseString function
    reverseString(str);

    printf("%s\n", str);

    return 0;
}



```

---

[View on CodeChef](https://www.codechef.com/problems/PSC02)