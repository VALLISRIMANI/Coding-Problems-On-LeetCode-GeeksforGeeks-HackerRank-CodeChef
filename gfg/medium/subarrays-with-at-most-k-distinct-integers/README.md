# Subarrays With At Most K Distinct

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array  **arr[]**  of positive integers and an integer  **k**, find the number of  **subarrays**  in  **arr[]** where the  **count** of distinct integers is at most  **k.** 

 **Note:**  A  **subarray**  is a  **contiguous**  part of an array.

 **Examples:** 

```
Input: arr[] = [1, 2, 2, 3], k = 2
Output: 9
Explanation: Subarrays with at most 2 distinct elements are: [1], [2], [2], [3], [1, 2], [2, 2], [2, 3], [1, 2, 2] and [2, 2, 3].
```

```
Input: arr[] = [1, 1, 1], k = 1
Output: 6
Explanation: Subarrays with at most 1 distinct element are: [1], [1], [1], [1, 1], [1, 1] and [1, 1, 1].
```

```
Input: arr[] = [1, 2, 1, 1, 3, 3, 4, 2, 1], k = 2
Output: 24
Explanation: There are 24 subarrays with at most 2 distinct elements.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 2*104
1 ≤ k ≤ 2*104
1 ≤ arr[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T07:48:33.454Z  

```java
class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            
            while (map.size() > k) {
                map.put(arr[left], map.get(arr[left]) - 1);
                
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                
                left++;
            }
            
            count += (right - left + 1);
        }
        
        return count;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/subarrays-with-at-most-k-distinct-integers/1)