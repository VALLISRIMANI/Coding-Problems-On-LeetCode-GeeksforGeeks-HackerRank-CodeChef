# Count Commas in Range II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer `n`.

Return the  **total**  number of commas used when writing all integers from `[1, n]` (inclusive) in  **standard**  number formatting.

In  **standard**  formatting:

- A comma is inserted after every three digits from the right.
- Numbers with fewer than 4 digits contain no commas.

 

 **Example 1:** 

 **Input:**  n = 1002

 **Output:**  3

 **Explanation:** 

The numbers `"1,000"`, `"1,001"`, and `"1,002"` each contain one comma, giving a total of 3.

 **Example 2:** 

 **Input:**  n = 998

 **Output:**  0

 **Explanation:** 

 **​​​​​​​** All numbers from 1 to 998 have fewer than four digits. Therefore, no commas are used.

 

 **Constraints:** 

- 1 <= n <= 1015

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.36%)  
**Memory:** 43.2 MB (beats 11.54%)  
**Submitted:** 2026-09-09T13:22:42.293Z  

```java
class Solution {
    public long countCommas(long n) {
        long[][] ranges = {
            {1000L, 1000000L, 1},
            {1000000L, 1000000000L, 2},
            {1000000000L, 1000000000000L, 3},
            {1000000000000L, 1000000000000000L, 4},
            {1000000000000000L, 10000000000000000L, 5}
        };
        
        long total = 0;
        for (long[] r : ranges) {
            long low = r[0], high = r[1], commas = r[2];
            if (n >= low) {
                total += (Math.min(n, high - 1) - low + 1) * commas;
            }
        }
        return total;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-commas-in-range-ii/)