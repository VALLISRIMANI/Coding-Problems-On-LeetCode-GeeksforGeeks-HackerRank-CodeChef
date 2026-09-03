# CASS43

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Armstrong Number

Write a program to check if the given number $N$ is Armstrong number.

 **Note:**  Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

### Input Format
- The first and only line of input contains a single integer, $N$ - The number that needs to be checked.
### Output Format
- Print on a single line: YES if $N$ is Armstrong number. NO otherwise.
### Constraints
- 0 ≤ $N$ ≤ 1000000
### Sample 1:
Input
Output

```
153
```

```
YES
```

### Explanation:

$1^{\text{3}}$ + $5^{\text{3}}$ + $3^{\text{3}}$ = 1 + 125 + 27 = 153.

The number 153 has 3 digits, so each digit was raised to the power of 3 before summing.

### Sample 2:
Input
Output

```
92727
```

```
YES
```

### Explanation:

$9^{\text{5}}$ + $2^{\text{5}}$ + $7^{\text{5}}$ + $2^{\text{5}}$ + $7^{\text{5}}$ = 59049 + 32 + 16807 + 32 + 16807 = 92727

The number 92727 has 5 digits, so each digit was raised to the power of 5 before summing.

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:24:51.068Z  

```c_cpp
#include <stdio.h>

int countDigits(int n){
    int count = 0;
    while(n > 0){
        count++;
        n /= 10;
    }
    return count;
}
// Function to check if a num is Armstrong: print YES or NO
void isArmstrongNumber(int num) {
    int n = num, sum = 0;
    int digits = countDigits(num);
    while(n > 0){
        int d = n % 10;
        sum += pow(d, digits);
        n /= 10;
    }
    if(sum == num)
      printf("YES");
    else 
      printf("NO");
}



int main() {
    int n;
    scanf("%d", &n);

    isArmstrongNumber(n);
    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CASS43)