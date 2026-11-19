# Remove K Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given string num representing a non-negative integer `num`, and an integer `k`, return  *the smallest possible integer after removing*  `k`  *digits from*  `num`.

 

Original
Java
 **Example 1:** 

```
Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.

```

 **Example 2:** 

```
Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.

```

 **Example 3:** 

```
Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.

```

 

 **Constraints:** 

- 1 <= k <= num.length <= 105
- num consists of only digits.
- num does not have any leading zeros except for the zero itself.

## Solution

**Language:** Java  
**Runtime:** 19 ms (beats 58.60%)  
**Memory:** 47.5 MB (beats 33.83%)  
**Submitted:** 2026-11-19T13:03:15.265Z  

```java
class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";

        Stack<Integer> st = new Stack<>();

        for (char ch : num.toCharArray()) {
            int digit = ch - '0';

            while (!st.isEmpty() && k > 0 && digit < st.peek()) {
                st.pop();
                k--;
            }

            st.push(digit);
        }

        while (!st.isEmpty() && k > 0) {
            st.pop();
            k--;
        }

        if (st.isEmpty()) return "0";

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        String result = sb.reverse().toString().replaceFirst("^0+", "");
        return result.isEmpty() ? "0" : result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-k-digits/)