# Odd to Largest Even with One Swap

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an odd number in the form of string, the task is to make largest even number possible from the given number provided one is allowed to do exactly only one swap operation, if no such number is possible then return the input string itself.

 **Examples** 

```
Input: s = 4543
Output: 4534
Explanation: Swap second 4 and 3.
```

```
Input: s = 1539
Output: 1539
Explanation: No even no. present.
```

  **Constraints:** 
1 <= Length of odd number string<= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T16:15:31.699Z  

```java
class Solution {
    public String makeEven(String s) {
        // code here.
        char[] arr = s.toCharArray();
        int n = arr.length;

        char last = arr[n - 1];
        int evenIndex = -1;

        for (int i = 0; i < n - 1; i++) {
            if ((arr[i] - '0') % 2 == 0) {
                if (arr[i] < last) {
                    swap(arr, i, n - 1);
                    return new String(arr);
                }

                evenIndex = i;
            }
        }

        if (evenIndex == -1) {
            return s;
        }

        swap(arr, evenIndex, n - 1);

        return new String(arr);
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/odd-to-even0537/1)