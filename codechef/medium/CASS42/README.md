# CASS42

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### All Primes in Range

Write a program to print all prime numbers in the range [$L$, $R$].

### Input Format
- The first and only line of input contains two space separated integers, $L$ and $R$ - The start and end of the range.
### Output Format
- Print on a single line, all prime numbers between $L$ and $R$ (inclusive) in increasing order with a space between them.
### Constraints
- 1 ≤ $L$, $R$ ≤ 1000
- $L$ ≤ $R$
### Sample 1:
Input
Output

```
2 11
```

```
2 3 5 7 11
```

### Explanation:

The prime numbers in the range [$2$, $11$] are: $2$, $3$, $5$, $7$ and $11$

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:24:37.043Z  

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

[View on CodeChef](https://www.codechef.com/problems/CASS42)