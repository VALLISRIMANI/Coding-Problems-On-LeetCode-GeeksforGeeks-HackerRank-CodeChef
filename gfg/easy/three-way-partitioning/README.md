# Three Way Partitioning

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  and a range  **a**,  **b**. The task is to partition the array around the range such that the array is divided into three parts.

- All elements smaller than a come first.
- All elements in range a to b come next.
- All elements greater than b appear in the end.

The individual elements of three sets can appear in any order. You are required to return the modified array.

 **Note** : The generated output is true if you modify the given array successfully. Otherwise false.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 3, 4], a = 1, b = 2
Output: true
Explanation: One possible arrangement is: {1, 2, 3, 3, 4}. If you return a valid arrangement, output will be true.

```

```
Input: arr[] = [1, 4, 3, 6, 2, 1], a = 1, b = 3
Output: true
Explanation: One possible arrangement is: {1, 3, 2, 1, 4, 6}. If you return a valid arrangement, output will be true.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T15:33:20.084Z  

```java
class Solution {
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] < a) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }
            else if (arr[mid] > b) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
            else {
                mid++;
            }
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/three-way-partitioning/1)