# CASS34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Prime Check

Write a program using `while` loop to check if the positive number $N$ is prime or not.

 **Note:**  Prime numbers are the numbers that are divisible by only 1 and the number itself.

### Input Format
- The first and only line of input will contain a single positive number $N$.
### Output Format
- Output on a single line, YES if $N$ is prime, else NO.
### Constraints
- $0 \leq N \leq 100000$
### Sample 1:
Input
Output

```
4
```

```
NO
```

### Explanation:

4 is divisible by 2 also apart from 1 and 4

### Sample 2:
Input
Output

```
11
```

```
YES
```

### Explanation:

11 is not divisible by any number other than 1 and 11

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T09:43:07.963Z  

```c_cpp
#include <stdio.h>

int main() {
    int num, i = 2;
 
    scanf("%d", &num);

    if (num <= 1) {
        printf("NO");
    } 
    else {
        int is_prime = 1;
        while (i <= num / 2) {
            if (num % i == 0) {
               is_prime = 0;
               break;
            }
            i++;
        }
        if (is_prime) {
            printf("YES");
        } else {
            printf("NO");
        }
    }
    
    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CASS34)