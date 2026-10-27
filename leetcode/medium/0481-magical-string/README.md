# Magical String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A magical string `s` consists of only `'1'` and `'2'` and obeys the following rule:

- Concatenating the sequence of lengths of its consecutive groups of identical characters '1' and '2' generates the string s itself.

The first few elements of `s` is `s = "1221121221221121122……"`. If we group the consecutive `1`'s and `2`'s in `s`, it will be `"1 22 11 2 1 22 1 22 11 2 11 22......"` and counting the occurrences of `1`'s or `2`'s in each group yields the sequence `"1 2 2 1 1 2 1 2 2 1 2 2......"`.

You can see that concatenating the occurrence sequence gives us `s` itself.

Given an integer `n`, return the number of `1`'s in the first `n` number in the magical string `s`.

 

 **Example 1:** 

```
Input: n = 6
Output: 3
Explanation: The first 6 elements of magical string s is "122112" and it contains three 1's, so return 3.

```

 **Example 2:** 

```
Input: n = 1
Output: 1

```

 

 **Constraints:** 

- 1 <= n <= 105

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 62.24%)  
**Memory:** 43.5 MB (beats 90.23%)  
**Submitted:** 2026-10-27T16:37:34.867Z  

```java
class Solution {
    public int magicalString(int n) {
        if (n <= 3) {
            return n == 1 ? 1 : 1;
        }

        int[] s = new int[n];
        s[0] = 1;
        s[1] = 2;
        s[2] = 2;

        int count = 3;
        int ones = 1;
        int i = 2;
        int num = 1;

        while (count < n) {
            int freq = s[i];

            for (int j = 0; j < freq && count < n; j++) {
                s[count] = num;

                if (num == 1) {
                    ones++;
                }

                count++;
            }

            num = 3 - num;
            i++;
        }

        return ones;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/magical-string/)