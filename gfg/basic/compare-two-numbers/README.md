# Compare Two Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers  **a**  and  **b**, print 1 if a is greater than b; otherwise, print 0.

 **Example :** 

```
Input: a = 4, b = 6
Output: 0
Explanation: Since 4 is smaller than 6, the output is 0.
```

```
Input: a = 2, b = -9
Output: 1
Explanation: Since 2 is greater than -9, the output is 1.
```

```
Input: a = 5, b = 5
Output: 0
Explanation: Since both numbers are equal, a is not greater than b.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:48:53.087Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // code here
        System.out.println(a > b ? 1 : 0);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/compare-two-numbers/1)