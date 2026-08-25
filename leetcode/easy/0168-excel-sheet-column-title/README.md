# Excel Sheet Column Title

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `columnNumber`, return  *its corresponding column title as it appears in an Excel sheet*.

For example:

```
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

```

 

 **Example 1:** 

```
Input: columnNumber = 1
Output: "A"

```

 **Example 2:** 

```
Input: columnNumber = 28
Output: "AB"

```

 **Example 3:** 

```
Input: columnNumber = 701
Output: "ZY"

```

 

 **Constraints:** 

- 1 <= columnNumber <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.5 MB (beats 58.84%)  
**Submitted:** 2026-08-25T09:18:06.529Z  

```java
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int num = columnNumber;
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

[View on LeetCode](https://leetcode.com/problems/excel-sheet-column-title/)