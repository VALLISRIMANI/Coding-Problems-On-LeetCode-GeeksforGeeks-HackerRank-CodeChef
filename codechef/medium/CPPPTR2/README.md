# CPPPTR2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Complete the given function which reverses the original array using pointers.

### Input Format
- The first line of input contain a single integer $N$ - the size of the input array.
- Next line contains $N$ space separated integers - the elements of the array.
### Output Format
- Output $N$ space separated integers - the reversed array.
### Sample 1:
Input
Output

```
5
1 2 3 4 5
```

```
5 4 3 2 1
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T13:42:57.977Z  

```c_cpp
#include <stdio.h>

// Function to reverse the elements of an array using pointers
void reverseArray(int* arr, int size) {
    // Complete this function 
    int *start = arr;
    int *end = arr + size - 1;
    
    while (start < end) {
        int temp = *start;
        *start = *end;
        *end = temp;
        
        start++;
        end--;
    }
}

int main() {
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i = 0; i < n; i++){
        scanf("%d",&arr[i]);
    }
   
    // Call the function to reverse the array
    reverseArray(&arr, n);

    for (int i = 0; i < n; i++) {
        printf("%d ",arr[i]);
    }

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CPPPTR2)