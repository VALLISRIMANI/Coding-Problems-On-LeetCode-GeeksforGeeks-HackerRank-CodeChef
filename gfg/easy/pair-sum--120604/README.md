# Largest Pair Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Find the largest pair sum in an array of  **distinct**  integers.

 **Examples :** 

```
Input: arr[] = [12, 34, 10, 6, 40]
Output: 74
Explanation: Sum of 34 and 40 is the largest, i.e, 34 + 40 = 74.
```

```
Input: arr[] = [10, 20, 30]
Output: 50
Explanation: 20 + 30 = 50.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T16:07:27.931Z  

```java
class Solution {
    public static int pairsum(int[] arr) {
        // code here
        int firstHighest = -1;
        int secondHighest = -1;
        
        for (int num : arr) {
            if (num > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = num;
            } else if (num > secondHighest) {
                secondHighest = num;
            }
        }
        
        return firstHighest + secondHighest;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pair-sum--120604/1)