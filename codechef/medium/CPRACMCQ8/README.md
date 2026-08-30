# CPRACMCQ8

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Count Black Chessboard Cells - MCQ

Determine the number of  **black cells**  in an $6 \times 6$ chessboard.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T04:29:48.004Z  

```cpp
#include <stdio.h>

int main() {
    int n, a, b;
    scanf("%d %d %d", &n, &a, &b);

    // Users who get a rating
    int rated_users = n - a;

    // Users who get a rating strictly greater than 1000
    int high_rated_users = n - a - b;

    printf("%d %d\n", rated_users, high_rated_users);

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CPRACMCQ8)