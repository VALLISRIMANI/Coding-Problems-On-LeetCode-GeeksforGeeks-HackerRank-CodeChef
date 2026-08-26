# PSC01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a C program to find the maximum and minimum elements in an array using pointers.

### Input Format
- The first line of input contains a single integer $N$, denoting the number of elements in the array.
- Second line of input contains $N$ space separated integers, the elements of the array.
### Output Format
- Output on a single line, the max value in the array.
### Sample 1:
Input
Output

```
5
3 4 1 2 3
```

```
4
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T13:26:19.423Z  

```c_cpp
#include <stdio.h>

// Function to find maximum  element in an array using pointers
void findMax(int arr[], int size, int *max) {
   // Complete the function 
   *max = arr[0];
   
   int i;
   for (i = 1; i < size; i++) {
       if (arr[i] > *max) *max = arr[i];
   }
   
}

int main() {
    int n;
    scanf("%d", &n);
    int array[n];
    for(int i = 0; i < n; i++){
        scanf("%d", &array[i]);
    }
    int max;

    // Call the findMaxMin function
    findMax(array, n, &max);

    printf("%d\n", max); // Output the max element 

    return 0;
}


```

---

[View on CodeChef](https://www.codechef.com/problems/PSC01)