# Hollow Diamond

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number  **n**. Print Hollow Diamond Pattern with n lines.

 **Note:**  There is a space between two adjacent stars (*) in the pattern.

 **Examples:** 

```
Input: n = 3
Output:
    *         
   ** 
 ** 
   ** 
    * 
```

```
Input: n = 5
Output:
        * 
       ** 
     ** 
   ** 
 ** 
   ** 
     ** 
       ** 
        *
```

**Constraints:
**1 ≤ n ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T15:55:28.342Z  

```java
class Solution {
    void printPat(int n) {
        // code here
        // Upper Half
        for (int i = 1; i <= n; i++) {
    
            // Leading spaces
            for (int j = n - 1; j >= i; j--) {
                System.out.print("  ");
            }
    
            // Stars and hollow spaces
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == 1 || k == i * 2 - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
    
            System.out.println();
        }
    
        // Lower Half
        for (int i = n - 1; i >= 1; i--) {
    
            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
    
            // Stars and hollow spaces
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == 1 || k == i * 2 - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
    
            System.out.println();
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/hollow-diamond/1)