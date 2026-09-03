# CASS35

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Search In Array

Given an array of $N$ numbers, write a program to check if a given number $x$ exists in the array.

### Input Format
- The first line of input will contain two space separated numbers $N$ and $x$ - the length of array and the element to be searched.
- The second line of input contains $N$ space separated numbers - the elements of the array.
### Output Format
- Output on a single line, YES if $x$ is present in the array, else NO.
### Constraints
- $1 \leq N \leq 100000$
- All array elements and $x$ are positive integer $\leq 100000$
### Sample 1:
Input
Output

```
6 7
3 4 9 1 7 2
```

```
YES
```

### Explanation:

7 is present in the given array {3, 4, 9, 1, 7, 2}

### Sample 2:
Input
Output

```
4 8
4 2 1 3
```

```
NO
```

### Explanation:

8 is not in array {4, 2, 1, 3}

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:21:21.153Z  

```c_cpp
#include <stdio.h>

int main() {
    int n, x;
 
    scanf("%d %d", &n, &x);

    int arr[n];
    
    for(int i = 0; i < n; i++){
        scanf("%d ", &arr[i]);
    }
    
    int found = 0;
    for(int i = 0; i < n; i++){
        if(arr[i] == x){
            found = 1;
            break;
        }
    }
    
    if(found == 1)
      printf("YES");
    else 
      printf("NO");
      
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CASS35)