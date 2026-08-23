# DSCPPAS263

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Valid Matrix Sum

You are given an integer $n$ and $m$, representing the dimensions of an $n×m$ matrix. You need to construct an $n×m$ matrix such that the following properties are satisfied:

- Each element in the matrix is 1.
- The sum of the elements of the matrix is even.

If it is not possible then print $-1$.

### Input Format
- The first line contains one integer $n$ and $m$, the size of the matrix.
### Output Format
- Print a 2d matrix with given properties or $-1$.
### Constraints
- $1 \leq n, m \leq 100$
### Sample 1:
Input
Output

```
2 2
```

```
1 1
1 1
```

### Explanation:

The sum of elements of the matrix is 4 which is even.

### Sample 2:
Input
Output

```
1 1
```

```
-1
```

### Explanation:

No such matrix is possible.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T16:49:19.473Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Calculate the total number of elements
        int total_elements = n * m;

        // Check if the total number of elements is even
        if (total_elements % 2 != 0) {
            System.out.println(-1);
        } else {
            // Construct the n x m matrix filled with 1s
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    System.out.print(1 + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSCPPAS263)