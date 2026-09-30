# PEAKINARRAY - Rating 950

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Find the peak elements in an array

Given an array `A` of size `N`, your task is to find and print all the peak elements in the array. A peak element is one that is strictly greater than its neighboring elements. For the first and last elements, only consider their single adjacent element.

If no peak element exists in the array, print `-1`.

### Input Format
- The first line contains the integer $N$ — the size of array
- The second line contains all the elements of array $A$
### Output Format

Output all the peak elements in the array in the order they are present in the original array.

### Constraints
- $1 \leq N \leq 10^5$
- $1 \leq A_i \leq 10^5$
### Sample 1:
Input
Output

```
5
1 2 4 3 1
```

```
4
```

### Explanation:

1 is smaller than it's adjacent element 2.
2 is greater than 1 but smaller than 4.
4 is greater than both 2 and 3, thus it is a  **peak**  element.
Again 3 and 1 are also smaller than their adjacent elements.
Thus the output is only 4.

### Sample 2:
Input
Output

```
5
7 3 5 2 10
```

```
7 5 10
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T14:04:12.614Z  

```java
public static void findPeaks(int[] A, int n) {
    boolean hasPeak = false;

    for (int i = 0; i < n; i++) {
        if ((i == 0 || A[i] > A[i - 1]) && (i == n - 1 || A[i] > A[i + 1])) {
            System.out.print(A[i] + " ");
            hasPeak = true;
        }
    }

    if (!hasPeak) {
        System.out.print("-1");
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PEAKINARRAY)