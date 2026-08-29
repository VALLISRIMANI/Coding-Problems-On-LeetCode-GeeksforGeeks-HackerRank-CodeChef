# CPRACMCQ6

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Alice Happiness Condition - MCQ

Alice has scored $X$ marks in her test and Bob has scored $Y$ marks in the same test.
Alice is happy if she scored at least twice the marks of Bob’s score.
Print "Yes" is she is happy.
Other wise print nothing.

 **Option 1:** 

```
if (X >= 2 * Y) {
    printf("YES");
}

```

 **Option 2:** 

```
if (X > 2*Y) {
    printf("YES");
}

```

 **Option 3:** 

```
if (2*Y <= X) {
    printf("YES");
}

```

 **Option 4:** 

```
if (2*Y >= X) {
    printf("YES");
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T17:51:39.362Z  

```cpp
#include <stdio.h>

int main() {
    int x, y;
    scanf("%d %d", &x, &y);
    // Your code goes here (if needed)
    if (y > x) {
        printf("YES");
    } else {
        printf("NO");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CPRACMCQ6)