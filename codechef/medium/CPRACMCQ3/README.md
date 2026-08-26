# CPRACMCQ3

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple Choice Question

Chef needs to park her car while she watches a movie. The parking charges at the theater are as follows:

- Rs. $X$ for the first 1 hour
- Rs. $Y$ for every extra hour after the first hour

If Chef parks her car for $H$ hours, what is the total parking charges that she should pay?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T10:24:16.897Z  

```cpp
#include <stdio.h>

int main() {
    int R, C, E;
    scanf("%d %d %d", & R, & C, & E); 

    int total_cells = (R + E) * C; 
    printf("%d\n", total_cells); 

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CPRACMCQ3)