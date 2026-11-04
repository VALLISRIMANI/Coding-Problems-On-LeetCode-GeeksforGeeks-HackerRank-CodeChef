# Count Non-Repeated Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array of integers  **arr[]**. You need to return the count of non-repeated elements in the array.

 **Examples:** 

```
Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 5, 6, 7]
Output: 4
Explanation: 4, 5, 6 and 7 are the elements with frequency 1 and rest elements are repeated so the number of non-repeated elements are 4.

```

```
Input: arr[] = [10, 20, 30, 40, 10]
Output: 3
Explanation: 20, 30, 40 are the elements with the frequency 1 and 10 is the repeated element to number of non-repeated elements are 3.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T15:30:27.433Z  

```java
class Solution {
    public int countNonRepeated(int arr[]) {
        //  code here
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        for (int value : freqMap.values()) {
            if (value == 1) {
                count++;
            }
        }
        
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-distinct-elements-1587115620/1)