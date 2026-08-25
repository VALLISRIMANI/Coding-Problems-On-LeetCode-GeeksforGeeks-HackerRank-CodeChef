# LCAS39

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Palindrome Check

Write a C program to turn the string "CIVVIX" into a Palindrome. To do this, take the last character of the string and make changes to the string as needed. Finally, print the resulting palindrome.

### Sample 1:
Input
Output

```
 
```

```
CIVVIC
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T07:15:41.383Z  

```c_cpp
#include <stdio.h>

int main() {
	// your code goes here
    char string[] = "CIVVIx";
    string[5] = 'C';
    printf("%s", string);
}


```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS39)