# CPRACMCQ9

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Identifying Oneful Pairs - MCQ

Chef defines a pair of positive integers $(a, b)$ to be a $\text{Oneful Pair}$, if

$a + b + (a \cdot b) = 111$

For example, $(1, 55)$ is a $\text{Oneful Pair}$, since $1 + 55 + (1 \cdot 55) = 56 + 55 = 111$.
But $(1, 56)$ is not a $\text{Oneful Pair}$, since $1 + 56 + (1 \cdot 56) = 57 + 56 = 113 \neq 111$.

Which of these pairs are $\text{Oneful Pair}$?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T17:54:51.627Z  

```cpp
#include <stdio.h>

int main() {
    int x, y;
    scanf("%d %d", &x, &y);
    // Your code goes here (if needed)
    if (x >= 2 * y) {
        printf("Yes");
    } else {
        printf("No");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CPRACMCQ9)