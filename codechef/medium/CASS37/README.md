# CASS37

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:21:41.309Z  

```c_cpp
#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);
    int arr[N];
   
    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }

    // Check if array is sorted
    int sorted = 1; // Assume sorted initially
    for (int i = 1; i < N; i++) {
        if (arr[i] < arr[i - 1]) {
            sorted = 0; // Array is not sorted
            break;
        }
    }

    if (sorted == 1) {
        printf("YES");
    } else {
        printf("NO");
    }

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CASS37)