# CASS36

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Is Sorted

Write a program to check if a given array of integers is sorted in increasing order.

An array is considered to be sorted in increasing order if each element is greater than the previous element, except for the first element.

### Input Format
- The first line of input will contain a single positive number $N$ - the length of array.
- The second line of input contains $N$ space separated numbers - the elements of the array.
### Output Format
- Output on a single line, YES if the array is sorted, else NO.
### Constraints
- $1 \leq N \leq 100000$
- All array elements are distinct positive integer $\leq 100000$
### Sample 1:
Input
Output

```
6 
3 4 9 1 7 2
```

```
NO
```

### Sample 2:
Input
Output

```
4 
4 5 8 9
```

```
YES
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:21:38.403Z  

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

[View on CodeChef](https://www.codechef.com/problems/CASS36)