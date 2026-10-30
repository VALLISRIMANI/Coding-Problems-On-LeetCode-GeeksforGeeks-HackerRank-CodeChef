# Position According to Parity

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**, the task is to arrange the array such that odd elements occupy the odd positions and even elements occupy the even positions. The order of elements must remain the same. Consider zero-based indexing. After printing according to conditions, if remaining, print the remaining elements as it is.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5, 6]
Output: [2, 1, 4, 3, 6, 5]
Explanation: Even elements are at even position and odd elements are at odd position keeping the order maintained.
```

```
Input:  arr[] = [3, 7, 4, 1]
Output: [4, 3, 7, 1]

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T15:49:16.660Z  

```java
class Solution {
    public static ArrayList<Integer> arrangeOddAndEven(int arr[]) {
        // code here
        int n = arr.length;

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        Integer[] ans = new Integer[n];

        int ei = 0, oi = 0;

        // Fill even positions
        for (int i = 0; i < n && ei < even.size(); i += 2) {
            ans[i] = even.get(ei++);
        }

        // Fill odd positions
        for (int i = 1; i < n && oi < odd.size(); i += 2) {
            ans[i] = odd.get(oi++);
        }

        // Fill remaining positions
        for (int i = 0; i < n; i++) {
            if (ans[i] == null) {
                if (ei < even.size()) {
                    ans[i] = even.get(ei++);
                } else {
                    ans[i] = odd.get(oi++);
                }
            }
        }

        return new ArrayList<>(Arrays.asList(ans));
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/even-and-odd-elements-at-even-and-odd-positions1342/1)