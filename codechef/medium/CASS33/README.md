# CASS33

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Count Vowels

Given a string, count number of vowels in it and print the count.

 **Note:**  lowercase vowels are: `a`, `e`, `i`, `o` and `u`.

### Input Format
- The first line of input will contain a single integer $N$ - the length of string
- The second line of input will contain a string of length n consists of only lowercase english letters.
### Output Format
- Output on a single line, the number of vowels in given string.
### Constraints
- $1 \leq N \leq 100$
- String consists of only lowercase english letters.
### Sample 1:
Input
Output

```
8
codechef
```

```
3
```

### Explanation:

The string "codechef" contain three vowels, one 'o' and two 'e'

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T15:21:43.684Z  

```c_cpp
// Solution
#include <stdio.h>

int main() {
    int n, count = 0;
    scanf("%d", &n);
    char str[n];
    scanf("%s", &str);
    for(int i = 0; i < n; i++){
        char ch = str[i];
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
           count++;
    }
    printf("%d", count);
    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CASS33)