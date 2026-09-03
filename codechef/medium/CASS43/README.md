# CASS43

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:24:41.469Z  

```c_cpp
#include <stdio.h>

// Function to check if a number is prime
int isPrime(int num) {
    if (num <= 1) return 0; // 0 and 1 are not prime numbers
    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) return 0; // If divisible by any number, not prime
    }
    return 1; // If not divisible by any number, prime
}

// Function to print prime numbers in the range [L, R]
void printPrimesInRange(int L, int R) {
    for (int i = L; i <= R; i++) {
        if (isPrime(i)) {
            printf("%d ", i);
        }
    }
    printf("\n");
}

int main() {
    int L, R;
    scanf("%d %d", &L, &R);

    printPrimesInRange(L, R);

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CASS43)