# CASS30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Whats Wrong

Debug the code in the IDE.

The code is supposed to do the following:

- Input three space-separated integers on a single line.
- If the middle integer is greater than the sum of the other two integers and is odd, print 1; otherwise, print 0.
### Sample 1:
Input
Output

```
1 7 4
```

```
1
```

### Explanation:

7 is greater than sum of 1 and 4, and its an odd integer, hence the output is 1.

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T04:47:04.854Z  

```c_cpp
// Debug the code
#include <stdio.h>


int main() {
    int a, b, c;
    scanf("%d %d %d", & a, & b, & c);

    printf("%d", (b > a + c) && (b % 2 == 1));

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CASS30)