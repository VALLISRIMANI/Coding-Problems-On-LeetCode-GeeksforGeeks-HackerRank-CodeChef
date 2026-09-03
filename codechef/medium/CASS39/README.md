# CASS39

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of Digits - II

Write a program to calculate the sum of the digits present in an alphanumeric string.

### Input Format
- The first line contains an integer, T, denoting the number of test cases.
- Each of the next T lines contains a string consisting of lowercase/uppercase English letters, along with digits 0 to 9. (There shall be no space in the string)
### Output Format
- For each test case, print the sum of digits in each string.
### Constraints
- 1 ≤ T ≤ 20
- 1 ≤ Length of each string ≤ 1000
### Sample 1:
Input
Output

```
1
Hel#284!lo23Chef
```

```
19
```

### Explanation:

2 + 8 + 4 + 2 + 3 = 19

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:28:34.888Z  

```c_cpp
#include <stdio.h>


int main() {
    int t;
    scanf("%d", &t);

    while (t--) {
        char str[1002];
        scanf("%s", str);
        int sum = 0; 
        for (int i = 0; str[i] != '\0'; i++) {
            char ch = str[i];
            if (ch >= '0' && ch <= '9') {
                sum += str[i] - '0'; // Convert character to integer and add to sum
            }
        }
        printf("%d\n", sum);
    }

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CASS39)