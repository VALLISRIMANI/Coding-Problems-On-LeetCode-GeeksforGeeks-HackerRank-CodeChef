# K-th Largest Sum Contiguous Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  of size n, find the sum of the K-th largest sum among all contiguous subarrays. In other words, identify the K-th largest sum from all possible subarrays and return it.

 **Examples:** 

```
Input: arr[] = [3, 2, 1], k = 2 
Output: 5
Explanation: The different subarray sums we can get from the array are = [6, 5, 3, 2, 1]. Where 5 is the 2nd largest.
```

```
Input: arr[] = [2, 6, 4, 1], k = 3
Output: 11
Explanation: The different subarray sums we can get from the arrayare = [13, 12, 11, 10, 8, 6, 5, 4, 2, 1]. Where 11 is the 3rd largest.
```

 **Constraints:** 
1 <= arr.size() <= 1000
1 <= k <= (n*(n+1))/2
-105 <= arr[i] <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T04:48:37.097Z  

```java
class Solution {
    public static int kthLargest(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int currentSum = prefixSum[j] - prefixSum[i - 1];
                
                if (minHeap.size() < k) {
                    minHeap.add(currentSum);
                } else if (currentSum > minHeap.peek()) {
                    minHeap.poll();
                    minHeap.add(currentSum);
                }
            }
        }
        
        return minHeap.peek();
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/k-th-largest-sum-contiguous-subarray/1)