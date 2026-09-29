# Count Sum Pairs in Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer  **target**  and an array  **arr[]**. You need to find number of pairs in arr[] which sums up to target. It is given that the elements of the arr[] are in sorted order.

 **Note:**   Pairs should have elements of distinct indexes. 

 **Examples :** 

```
Input: arr[] = [-1, 1, 5, 5, 7], target = 6
Output: 3
Explanation: There are 3 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.

```

```
Input: arr[] = [1, 1, 1, 1], target = 2
Output: 6
Explanation: There are 6 pairs which sum up to 2 : {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1} and {1, 1}.
```

```
Input: arr[] = [-1, 10, 10, 12, 15], target = 125
Output: 0
Explanation: There is no such pair which sums up to 125.
```

 **Constraints:** 
-105 <= target <=105
 2 <= arr.size() <= 105
-105 <= arr[i] <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T13:35:08.662Z  

```java
class Solution {
    int countPairs(int arr[], int target) {
        //  Code Here
        HashMap<Integer, Integer> map = new HashMap<>();
    
        int count = 0;
        for (int num : arr) {
            int complement = target - num;
            
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        return count;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1)