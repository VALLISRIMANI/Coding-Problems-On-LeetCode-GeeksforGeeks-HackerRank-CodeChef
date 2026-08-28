# LCAS79

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Day Of The Week

Write a C program that takes an integer representing the day of the week (1 to 7) as input and prints the corresponding day's name.
If the given integer is any number other than 1 to 7 - then you need to output 'Invalid day number'.

Use a switch statement to implement this.

Check the sample input / output below to for further clarity.

### Sample 1:
Input
Output

```
2
```

```
Tuesday
```

### Sample 2:
Input
Output

```
7
```

```
Sunday
```

### Sample 3:
Input
Output

```
10
```

```
Invalid day number
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T08:38:11.544Z  

```c_cpp
#include <stdio.h>

int main() {
    int day;
    scanf("%d", &day);

    // Print the day of the week using a switch statement
    switch (day) {
        // Update your code below this line
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
            printf("Invalid day number");
    }

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS79)