# DSAPROB20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Largest Common Element in Two Arrays

You are given two arrays of positive integers, $arr1$ and $arr2$, of sizes $n$ and $m$ respectively. Your task is to find the largest common element that appears in both arrays. If no common element exists, return $-1$.

### Constraints
- $1 \leq n, m \leq 10^5$
- $0 \leq arr1[i], arr2[i] \leq 10^9$
### Sample 1:
Input
Output

```
5 6
1 3 4 6 7
2 3 5 6 7 8
```

```
7
```

### Explanation:

In the given arrays, the common elements are 3, 6, and 7. The largest common element is 7.

### Sample 2:
Input
Output

```
4 3
1 2 3 4
5 6 7
```

```
-1
```

### Explanation:

In the given arrays, there are no common elements. Therefore, the output is -1.

### Sample 3:
Input
Output

```
4 4
9 2 1 10
3 11 9 2
```

```
9
```

### Explanation:

The common elements are 2,9. The largest one is 9.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T15:28:26.575Z  

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int largestCommonElement(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = arr1.length - 1, j = arr2.length - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] == arr2[j]) {
                return arr1[i];
            } else if (arr1[i] > arr2[j]) {
                i--;
            } else {
                j--;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();
        System.out.println(largestCommonElement(arr1, arr2));
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSAPROB20)