# CASS40

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of Multiples

Write a program to find the sum of all the numbers in the array that are multiples of 3.

### Input Format
- The first line contains an integer, $T$, denoting the number of test cases.
- Each test contain two lines of inputs: The first line contains a positive integer $N$ - the length of the array. Second line of each test case contains $N$ space separated integers - the elements of the array.
### Output Format
- For each test case, print on the new line : sum of the $3$'s multiples present in the array
### Constraints
- 1 ≤ T ≤ 20
- 1 ≤ Length of each array ≤ 1000
- 1 ≤ Elements of each array ≤ 1000
### Sample 1:
Input
Output

```
2
4
1 2 3 9
5
1 2 4 5 7
```

```
12
0
```

### Explanation:

The first array [1, 2, 3, 9] contains two multiples of 3: 3 and 9. Their sum = 12.
The second array [1, 2, 4, 5, 7] doesn't contain any multiple of 3, hence sum = 0.

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:28:49.344Z  

```c_cpp
#include <stdio.h>


int main() {
    int t;
    scanf("%d", &t);

    while (t--) {
        int n;
        scanf("%d", &n);
        int arr[n];
        int sum = 0; 
        for (int i = 0; i < n; i++) {
           scanf("%d", &arr[i]);
           if(arr[i] % 3 == 0)
             sum += arr[i];
        }
        
        printf("%d\n", sum);
    }

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CASS40)