# Largest Number with One Swap

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string **s**, return the  **lexicographically largest**  string that can be obtained by swapping at most  **one pair**  of characters in s.

 **Examples:** 

```
Input: s = "768"
Output: "867"
Explanation: Swapping the 1st and 3rd characters(7 and 8 respectively), gives the lexicographically largest string.
```

```
Input: s = "333"
Output: "333"
Explanation: Performing any swaps gives the same result i.e "333".

```

 **Constraints:** 
1 ≤ |s| ≤ 105
'0' ≤ s[i] ≤ '9'

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T16:43:24.426Z  

```java
class Solution {
    public String largestSwap(String s) {
        // code here
        char[] arr = s.toCharArray();
        int n = arr.length;

        int[] maxRight = new int[n];
        maxRight[n - 1] = n - 1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[maxRight[i + 1]]) {
                maxRight[i] = i;
            } else {
                maxRight[i] = maxRight[i + 1];
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[maxRight[i + 1]]) {
                char temp = arr[i];
                arr[i] = arr[maxRight[i + 1]];
                arr[maxRight[i + 1]] = temp;
                break;
            }
        }

        return new String(arr);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/largest-number-in-one-swap1520/1)