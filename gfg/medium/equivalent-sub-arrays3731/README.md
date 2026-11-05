# Subarrays Covering All Distinct

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array  **arr[]**. Count the number of subarrays whose count of distinct is exactly the same as the count of distinct in the entire array.

 **Examples:** 

```
Input: arr[] = [2, 1, 3, 2, 3]
Output: 5
Explanation:
The entire array contains 3 distinct elements: [1, 2, 3].
The subarrays that also contain all 3 distinct elements are:
arr[0..2] = [2, 1, 3]
arr[0..3] = [2, 1, 3, 2]
arr[0..4] = [2, 1, 3, 2, 3]
arr[1..3] = [1, 3, 2]
arr[1..4] = [1, 3, 2, 3]
Hence, the total number of such subarrays is 5.
```

```
Input: arr[] = [2, 4, 4, 2, 4]
Output: 9
Explanation: The entire array contains 2 distinct elements: [2, 4]. 
Therefore, we need to count all subarrays that contain both 2 and 4.
The valid subarrays are:
arr[0..1] = [2, 4]
arr[0..2] = [2, 4, 4]
arr[0..3] = [2, 4, 4, 2]
arr[0..4] = [2, 4, 4, 2, 4]
arr[1..3] = [4, 4, 2]
arr[1..4] = [4, 4, 2, 4]
arr[2..3] = [4, 2]
arr[2..4] = [4, 2, 4]
arr[3..4] = [2, 4]
Hence, the total number of such subarrays is 9.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T12:25:06.012Z  

```java
class Solution {
    public int countAllDistinct(int[] arr) {
        // code here
        Set<Integer> distinctSet = new HashSet<>();
        for (int num : arr) {
            distinctSet.add(num);
        }
        
        int k = distinctSet.size(); 

        int n = arr.length;
        int count = 0;
        int left = 0;
        Map<Integer, Integer> windowMap = new HashMap<>();


        for (int right = 0; right < n; right++) {
            windowMap.put(arr[right], windowMap.getOrDefault(arr[right], 0) + 1);

            while (windowMap.size() == k) {

                count += (n - right); 

                windowMap.put(arr[left], windowMap.get(arr[left]) - 1);
                if (windowMap.get(arr[left]) == 0) {
                    windowMap.remove(arr[left]);
                }
                left++;
            }
        }

        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/equivalent-sub-arrays3731/1)