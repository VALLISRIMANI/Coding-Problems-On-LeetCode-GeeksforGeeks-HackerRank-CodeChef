# Logical Operators

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two boolean variables  **x**  and  **y**, perform the following logical operations:

- p: Logical AND of x and y.
- q: Logical OR of x and y.
- r: Logical NOT of x.
- s: Logical NOT of y.

 **Examples:** 

```
Input: x = true, y = false
Output: false true false true
Explanation: The given logical operations are performed:
Logical AND of x and y = false
Logical OR of x and y = true
Logical NOT of x = false
Logical NOT of y = true
Hence, the output is false true false true.
```

```
Input: x = true, y = true
Output: true true false false
Explanation: The given logical operations are performed:
Logical AND of x and y = true
Logical OR of x and y = true
Logical NOT of x = false
Logical NOT of y = false
Hence, the output is true true false false.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:46:34.722Z  

```java
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean x = sc.nextBoolean();
        boolean y = sc.nextBoolean();

        // code here
        boolean p = x && y;
        boolean q = x || y;
        boolean r = !x;
        boolean s = !y;

        System.out.printf("%s %s %s %s", p ? "true" : "false", q ? "true" : "false",
                          r ? "true" : "false", s ? "true" : "false");
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/logical-operators-1605596247--132814/1)