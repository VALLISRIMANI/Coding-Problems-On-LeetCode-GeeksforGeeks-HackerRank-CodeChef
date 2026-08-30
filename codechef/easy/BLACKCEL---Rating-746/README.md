# BLACKCEL - Rating 746

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Black cells in a chessboard

Given $n$ ($n$ is  **even**), determine the number of  **black cells**  in an $n \times n$ chessboard.

### Input Format

The only line of the input contains a single integer $n$.

### Output Format

Output the number of black cells in an $n \times n$ chessboard.

### Constraints
- $2 \leq n \leq 100$
- $n$ is even
### Sample 1:
Input
Output

```
8
```

```
32
```

### Explanation:

There are $32$ black cells and $32$ white cells in an $8 \times 8$ chessboard. So the answer is $32$.

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T04:30:19.646Z  

```c_cpp
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    // Total cells is n * n, and half of them are black
    int black_cells = (n * n) / 2;
    
    printf("%d\n", black_cells);

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BLACKCEL)