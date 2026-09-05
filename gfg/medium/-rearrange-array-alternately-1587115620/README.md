# Rearrange Array Alternately

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of non-negative integers. Your task is to rearrange the array elements alternatively i.e. first element should be the max value, the second should be the min value, the third should be the second max, the fourth should be the second min, and so on.

 **Note:** Modify the original array itself. You do not have to return anything.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5, 6]
Output: [6, 1, 5, 2, 4, 3]
Explanation: Max element = 6, min = 1, second max = 5, second min = 2, and so on... The modified array is: [6, 1, 5, 2, 4, 3]
```

```
Input: arr[]= [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110]
Output: [110, 10, 100, 20, 90, 30, 80, 40, 70, 50, 60]
Explanation: Max element = 110, min = 10, second max = 100, second min = 20, and so on... Modified array is : [110, 10, 100, 20, 90, 30, 80, 40, 70, 50, 60]

```

```
Input: arr[]= [1]
Output: [1]
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T05:02:15.529Z  

```java
class Solution {
    public void rearrange(int arr[]) {
        // code here
        int n = arr.length;
        if (n == 1) return;
        
        Arrays.sort(arr);
        int[] firstHalf;
        int[] secondHalf;
        
        if (n % 2 == 0) {
            firstHalf = new int[n / 2];
            secondHalf = new int[n / 2];
            
            for (int i = 0; i < n / 2; i++) {
                firstHalf[i] = arr[i]; 
                secondHalf[i] = arr[n - 1 - i];
            }
        } else {
            firstHalf = new int[n / 2 + 1];
            secondHalf = new int[n / 2];
            
            for (int i = 0; i < n / 2; i++) {
                firstHalf[i] = arr[i]; 
                secondHalf[i] = arr[n - 1 - i];
            }
            
            firstHalf[n / 2] = arr[n / 2];
        }
        
        int idx = 0;
        
        for (int i = 0; i < secondHalf.length; i++) {
            arr[idx++] = secondHalf[i];
            arr[idx++] = firstHalf[i];
        }
        
        if (n % 2 != 0) {
            arr[n - 1] = firstHalf[firstHalf.length - 1];
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1)