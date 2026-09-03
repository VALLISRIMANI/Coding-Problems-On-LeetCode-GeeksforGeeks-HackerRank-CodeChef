# CASS41

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of Primes

Write a program to check whether a number can be express as sum of two prime numbers.

### Input Format
- The first line contains an integer, $T$, denoting the number of test cases.
- Each test contain a single positive integer $N$ - the number that needs to be checked.
### Output Format
- For each test case, print: YES if $N$ can be expressed as sum of two primes. NO if not.
### Constraints
- 1 ≤ T ≤ 10
- 1 ≤ $N$ ≤ 1000
### Sample 1:
Input
Output

```
3
7
19
11
```

```
YES
YES
NO
```

### Explanation:

$7$ is sum of two primes, $2$ and $5$.
$19$ is sum of two primes, $2$ and $17$.
However, $11$ is not sum of any two primes.

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:29:00.599Z  

```c_cpp
#include <stdio.h>

// Function to check if a number is prime
int isPrime(int num) {
    if (num <= 1) return 0; // 0 and 1 are not prime numbers
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) return 0; // If divisible by any number, not prime
    }
    return 1; // If not divisible by any number, prime
}

// Function to check if a number can be expressed as the sum of two prime numbers
int canExpressAsSumOfPrimes(int num) {
    for (int i = 2; i <= num / 2; i++) {
        if (isPrime(i) && isPrime(num - i)) {
            return 1; // If both i and num - i are prime, it's expressible as the sum of two prime numbers
        }
    }
    return 0; // If no such pair found, it's not expressible as the sum of two prime numbers
}

int main() {
    int t;
   
    scanf("%d", &t);

    for (int i = 0; i < t; i++) {
        int num;
       
        scanf("%d", &num);

        if (canExpressAsSumOfPrimes(num)) {
            printf("YES\n");
        } else {
            printf("NO\n", num);
        }
    }

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CASS41)