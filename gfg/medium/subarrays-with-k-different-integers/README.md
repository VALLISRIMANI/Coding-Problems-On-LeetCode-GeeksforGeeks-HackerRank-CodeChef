# Subarrays with K Distinct Integers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  of positive integers and an integer  **k**, find the number of  **subarrays**  in  **arr[]** where the count of distinct integers is exactly  **k.** 

 **Note:**  A  **subarray**  is a  **contiguous**  part of an array.

 **Examples:** 

```
Input: arr[] = [1, 2, 2, 3], k = 2
Output: 4
Explanation: Subarrays formed with exactly 2 different integers are: arr[0..1], arr[0..2], arr[1..3] and arr[2..3].
```

```
Input: arr[] = [3, 1, 2, 2, 3], k = 3
Output: 4
Explanation: Subarrays formed with exactly 3 distinct integers are: arr[0..2], arr[0..3], arr[0..4], arr[1..4].
```

```
Input: arr[] = [1, 1, 1, 1], k = 2
Output: 0
Explanation: There is no subarray having exactly 2 distinct integers.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T14:17:04.930Z  

```java
class Solution {
    public int exactlyK(int arr[], int k) {
        // code here
        Map<Integer, Integer> count = new HashMap<>();
        int left = 0, result = 0, distinct = 0;

        for (int right = 0; right < arr.length; right++) {
            count.put(arr[right], count.getOrDefault(arr[right], 0) + 1);
            if (count.get(arr[right]) == 1) distinct++;

            while (distinct > k) {
                count.put(arr[left], count.get(arr[left]) - 1);
                if (count.get(arr[left]) == 0) distinct--;
                left++;
            }

            // Count subarrays with exactly k distinct elements
            if (distinct == k) {
                int tempLeft = left;
                while (distinct == k) {
                    result++;
                    count.put(arr[tempLeft], count.get(arr[tempLeft]) - 1);
                    if (count.get(arr[tempLeft]) == 0) distinct--;
                    tempLeft++;
                }
                // Restore counts for next iteration
                for (int i = left; i < tempLeft; i++) {
                    count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
                    if (count.get(arr[i]) == 1) distinct++;
                }
            }
        }

        return result;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/subarrays-with-k-different-integers/1)