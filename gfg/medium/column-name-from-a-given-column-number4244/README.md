# Excel Column Name from Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a positive integer  **n**, return its corresponding Excel column title. In Excel, column titles follow this pattern:

A, B, C,..., Z, AA, AB,..., AZ, BA,..., ZZ, AAA, AAB,...

This is similar to a base-26 numbering system, but instead of digits 0–25, the letters A–Z represent values 1–26.

 **Examples:** 

```
Input: n = 28
Output: AB
Explanation: 1 to 26 are A to Z, then 27 is AA and 28 is AB.

```

```
Input: n = 13
Output: M
Explanation: M is the 13th character of alphabet.

```

```
Input: n = 5473578
Output: KYJZF
```

 **Constraints:** 
1 ≤ n ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T09:02:57.781Z  

```java
class Solution {
    public String colName(int n) {
        // code here
        StringBuilder sb = new StringBuilder();
        int num = n;
        
        while (num > 0) {
            num--;
            sb.append((char) ((num % 26) + 'A'));
            num /= 26;
        }        

        return sb.reverse().toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/column-name-from-a-given-column-number4244/1)