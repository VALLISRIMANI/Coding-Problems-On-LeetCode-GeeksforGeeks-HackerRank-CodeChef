# CPRACMCQ11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Determining Good Dice Turns - MCQ

Chef and Chefina are playing with dice. In one turn, both of them roll their dice at once.

They consider a turn to be  *good*  if the  **sum**  of the numbers on their dice is greater than $6$.
Given that in a particular turn Chef and Chefina got $X$ and $Y$ on their respective dice, select the options which are good turns.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T15:25:12.508Z  

```cpp
#include <stdio.h>

int main() {
    int T, A, B;
    
    // Read number of test cases
    scanf("%d", &T);
    
    // Loop through each test case
    for (int i = 0; i < T; i++) {
        scanf("%d %d", &A, &B);
        printf("%d\n", A + B);
    }
    
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CPRACMCQ11)