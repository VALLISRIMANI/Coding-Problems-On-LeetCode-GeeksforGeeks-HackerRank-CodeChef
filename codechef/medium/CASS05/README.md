# CASS05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Leap Year

Check if the given year is leap year.

 **Note:**  A year is a leap year if the following conditions are satisfied:

- The year is multiple of 400.
- The year is a multiple of 4 and not a multiple of 100.

 **Output `YES` if the given year is leap year, else `NO`.** 

### Input Format
- The first and only line of input will contain a single integer $Y$ - the year.
### Output Format
- Output on a single line, YES if the given year is leap year, else NO.
### Constraints
- $1900 \leq Y \leq 2100$
### Sample 1:
Input
Output

```
2004
```

```
YES
```

### Sample 2:
Input
Output

```
1999
```

```
NO
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T03:52:47.138Z  

```c_cpp
#include <stdio.h>

int main() {
    // write your code here
    int num;
    scanf("%d", &num);
    
    if (num % 400 == 0 || num % 4 == 0 && num % 100 != 0) {
        printf("YES");
    } else {
        printf("NO");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CASS05)