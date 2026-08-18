# Print n to 1 without loop

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Print numbers from  **n to 1**  (space separated) without the help of loops.

 **Examples :** 

```
Input: n = 10
Output: 10 9 8 7 6 5 4 3 2 1
```

 **Constraints :** 
1 ≤ n ≤ 1000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T09:07:38.581Z  

```java
class Solution {
    void printNos(int n) {
        // code here
        if (n <= 0) {
            return;
        }
        System.out.print(n + " ");
        printNos(n - 1);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-n-to-1-without-loop/1)