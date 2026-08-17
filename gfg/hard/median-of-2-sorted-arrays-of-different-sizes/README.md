# Median of 2 Sorted Arrays of Different Sizes

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two sorted arrays  **a[]**  and  **b[]**, find and return the  **median** of the combined array after  **merging**  them into a single sorted array.

 **Examples:** 

```
Input: a[] = [3, 5, 6, 12, 15], b[] = [3, 4, 6, 10, 10, 12]
Output: 6
Explanation: The merged array is [3, 3, 4, 5, 6, 6, 10, 10, 12, 12, 15]. So the median of the merged array is 6.
```

```
Input: a[] = [2, 3, 5, 8], b[] = [10, 12, 14, 16, 18, 20]
Output: 11
Explanation: The merged array is [2, 3, 5, 8, 10, 12, 14, 16, 18, 20]. So the median of the merged array is (10 + 12) / 2 = 11.
```

```
Input: a[] = [], b[] = [2, 4, 5, 6]
Output: 4.5
Explanation: The merged array is [2, 4, 5, 6]. So the median of the merged array is (4 + 5) / 2 = 4.5.

```

 **Constraints:** 
1 ≤ a.size(), b.size() ≤ 106
1 ≤ a[i], b[i] ≤ 109
a.size() + b.size() > 0

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T15:11:00.034Z  

```java
class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
        int n = a.length + b.length;
        int[] arr = new int[n];
        int index = 0;

        for (int num : a) {
            arr[index++] = num;
        }
        for (int num : b) {
            arr[index++] = num;
        }

        Arrays.sort(arr);

        if (n % 2 == 0) {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            return arr[n / 2];
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/median-of-2-sorted-arrays-of-different-sizes/1)