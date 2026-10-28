# Pythagorean Triplet

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**, return true if there is a  **triplet (a, b, c)**  from the array (where a, b, and c are on different indexes) that satisfies  **a2 + b2 = c2**, otherwise return false.

 **Examples:** 

```
Input: arr[] = [3, 2, 4, 6, 5]
Output: true
Explanation: a=3, b=4, and c=5 forms a pythagorean triplet.

```

```
Input: arr[] = [3, 8, 5]
Output: false
Explanation: No such triplet possible.
```

```
Input: arr[] = [1, 1, 1]
Output: false
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T15:18:08.269Z  

```java
class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        int max = 0;

        for (int num : arr) {
            max = Math.max(max, num);
        }

        boolean[] present = new boolean[max + 1];

        for (int num : arr) {
            present[num] = true;
        }

        for (int a = 1; a <= max; a++) {
            if (!present[a]) continue;

            for (int b = a; b <= max; b++) {
                if (!present[b]) continue;

                int cSquared = a * a + b * b;
                int c = (int) Math.sqrt(cSquared);

                if (c <= max && c * c == cSquared && present[c]) {
                    if (a == b && count(arr, a) < 2) continue;
                    if (a == c && count(arr, a) < 2) continue;
                    if (b == c && count(arr, b) < 2) continue;
                    return true;
                }
            }
        }

        return false;
    }

    private int count(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) count++;
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pythagorean-triplet3018/1)