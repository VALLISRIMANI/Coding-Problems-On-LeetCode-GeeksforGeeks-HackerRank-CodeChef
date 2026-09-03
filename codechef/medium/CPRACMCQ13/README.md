# CPRACMCQ13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Squat Set Calculation - MCQ

Somu went to the gym today.
He decided to do $X$ sets of squats.
Each set consists of $15$ squats.
What is the total number of squats that he did today?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:18:23.128Z  

```cpp
#include <stdio.h>

int main() {
    int t;

    // Input for the number of test cases using scanf
    scanf("%d", &t);

    // Loop for each test case
    while (t--) {
        int x, y, a;
        scanf("%d %d %d", &x, &y, &a);

        // Check eligibility: age must be >= X and < Y
        if (a >= x && a < y) {
            printf("YES\n");
        } else {
            printf("NO\n");
        }
    }

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CPRACMCQ13)