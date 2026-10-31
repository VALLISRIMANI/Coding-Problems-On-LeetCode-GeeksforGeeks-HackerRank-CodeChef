# Dominant Pairs

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an even-sized integer array  **arr[]**, count the number of dominant pairs. A pair of indices (i, j) is called dominant if all of the following conditions hold:

- 0 ≤ i < arr.size() / 2
- arr.size() / 2 ≤ j < arr.size() 
- arr[i] ≥ 5 × arr[j] 

Return the total number of dominant pairs.

 **Note:**  0-based indexing is used.

  Examples:  

```
Input: arr[] = [10, 2, 2, 1]
Output: 2
Explanation: First half: [10, 2], Second half: [2, 1]. So valid two pairs are: 
{0, 2}: 10 >= 5 × 2 
{0, 3}: 10 >= 5 × 1 
```

```
Input: arr[] = [10, 8, 2, 1, 1, 2]
Output: 5
Explanation: First half: [10, 8, 2], Second half: [1, 1, 2]. So valid five pairs are: 
{0, 3}: 10 >= 5 × 1
{0, 4}: 10 >= 5 × 1 
{0, 5}: 10 >= 5 × 2
{1, 3}: 8 >= 5 × 1 
{1, 4}: 8 >= 5 × 1 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T16:08:31.113Z  

```java
class Solution {
    public int dominantPairs(int[] arr) {
        // Code here
        int n = arr.length;
        int mid = n / 2;

        int[] first = Arrays.copyOfRange(arr, 0, mid);
        int[] second = Arrays.copyOfRange(arr, mid, n);

        Arrays.sort(first);
        Arrays.sort(second);

        int count = 0;
        int i = 0;

        for (int j = 0; j < second.length; j++) {
            while (i < mid && first[i] < 5L * second[j]) {
                i++;
            }

            count += (mid - i);
        }

        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/dominant-pairs/1)