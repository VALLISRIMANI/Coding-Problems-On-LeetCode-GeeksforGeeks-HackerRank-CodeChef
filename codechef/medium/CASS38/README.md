# CASS38

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Alphabets Extractor

Write a program to extract the English alphabetic characters from a string containing a mixture of lowercase, uppercase, and special characters.

### Input Format
- The first line contains an integer, T, denoting the number of test cases.
- Each of the next T lines contains a string consisting of lowercase and uppercase English letters, along with some other characters. (There shall be no space in the string)
### Output Format
- For each test case, print the string with the only English letters of each string in the same order.
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
HelloChef
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:28:24.692Z  

```c_cpp
#include <stdio.h>


int main() {
    char str[1002];
    int t;
    scanf("%d", &t);

    while(t--){
        scanf("%s", str);
        for (int i = 0; str[i] != '\0'; i++) {
            if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z')) {
                printf("%c", str[i]);
            }
        }
        printf("\n");
    }

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CASS38)