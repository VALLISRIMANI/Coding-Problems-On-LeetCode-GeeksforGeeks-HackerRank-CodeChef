# Scientific Format

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

There are times when your answer is a  **double**  data type and you want to show the same in scientific format. You need to take a double data type variable as   **a** and output its value in scientific format upto 4 precision **.** 

 **Examples :** 

```
Input: a = 5.43 
Output: 5.4300e+00
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:45:00.352Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        // code here
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.printf("%.4e", a);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/scientific-format--141631/1)