# Count Odd and Even

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]** of positive integers. The task is to return the count of the number of  **odd** and  **even** elements in the array.

Note: Return two elements where the first one in the count of odd & second one is the count of even.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5]
Output: 3 2
Explanation: There are 3 odd elements (1, 3, 5) and 2 even elements (2 and 4).
```

```
Input: arr[] = [1, 1]
Output: 2 0
Explanation: There are 2 odd elements (1, 1) and no even elements.
```

 **Constraints:** 
1 <= arr.size <= 106
1 <= arr[i] <= 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T10:35:06.813Z  

```java
class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int even = 0, odd = 0;
        
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        
        return new int[]{odd, even};
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-odd-even/1)