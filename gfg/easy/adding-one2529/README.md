# Adding One to Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a non-negative integer(without leading zeroes) represented as an array  **arr**. Your task is to add  **1**  to the number (increment the number by 1). The digits are stored such that the most significant digit is at the starting index of the array.

 **Examples:** 

```
Input: arr[] = [5, 6, 7, 8]
Output: [5, 6, 7, 9]
Explanation: 5678 + 1 = 5679
```

```
Input: arr[] = [9, 9, 9]
Output: [1, 0, 0, 0]
Explanation: 999 + 1 = 1000

```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 9
There are no leading zeros in the input number.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T16:13:14.567Z  

```java
class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                
                Vector<Integer> result = new Vector<>();
                
                for (int num : arr) {
                    result.add(num);
                }
                
                return result;
            }

            arr[i] = 0;
        }

        Vector<Integer> result = new Vector<>();
        result.add(1);

        for (int i = 0; i < n; i++) {
            result.add(0);
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/adding-one2529/1)