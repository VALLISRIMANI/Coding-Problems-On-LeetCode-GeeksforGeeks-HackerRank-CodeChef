# CASS29

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Which Day It Is

Debug the code in the IDE to solve the problem.

The code is supposed to do the following:

- Take a positive integer as input.
- If its between 1 - 7, prints the corresponding day of the week.
- Else print, Invalid input. Check the sample test case.
### Sample 1:
Input
Output

```
5
```

```
Friday
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T04:45:07.458Z  

```c_cpp
// Debug the code
#include <stdio.h>


int main() {
    int day;
    scanf("%d", &day);
    
    switch (day) {
        case 1:
            printf("Monday");
            break;
        case 2:
            printf("Tuesday");
            break;
        case 3:
            printf("Wednesday");
            break;
        case 4:
            printf("Thursday");
            break;
        case 5:
            printf("Friday");
            break;
        case 6:
            printf("Saturday");
            break;
        case 7:
            printf("Sunday");
            break;
        default:
            printf("Invalid input");
    }

    return 0;
}



```

---

[View on CodeChef](https://www.codechef.com/problems/CASS29)