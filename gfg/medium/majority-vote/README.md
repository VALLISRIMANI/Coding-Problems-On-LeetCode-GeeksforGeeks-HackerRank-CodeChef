# Majority Element - More Than n/3

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr**  **[]**  consisting of  **n**  integers, find all the array elements which occurs more than  **floor(n/3)**  times. Return the resulting array in strictly increasing order. If no such elements exist, return an empty array.

 **Examples:** 

```
Input: arr[] = [2, 2, 3, 1, 3, 2, 1, 1]
Output: [1, 2]
Explanation: The frequency of 1 and 2 is 3, which is more than floor n/3 (8/3 = 2).
```

```
Input:  arr[] = [-5, 3, -5]
Output: [-5]
Explanation: The frequency of -5 is 2, which is more than floor n/3 (3/3 = 1).

```

```
Input:  arr[] = [3, 2, 2, 4, 1, 4]
Output: []
Explanation: There is no majority element.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T16:06:08.050Z  

```java
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        int n = arr.length;
        int frequency = (int) Math.floor(n / 3);
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > frequency) {
                result.add(entry.getKey());
            }
        }
        
        Collections.sort(result);
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/majority-vote/1)