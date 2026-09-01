# Check for 4 Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array  **arr[]**  and an integer  **x**, determine whether there exist four distinct elements in the array whose sum is equal to x.

Return true if such four elements exist. Otherwise, return false.

 **Examples:** 

```
Input: arr[] = [1, 5, 1, 0, 6, 0], x = 7
Output: true
Explanation: The four elements 1, 5, 1, 0 have a sum equal to 7.

```

```
Input: arr[] = [1, 2, 3, 4, 5], x = 50
Output: false
Explanation: No combination of four distinct elements has a sum equal to 50.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T06:53:35.413Z  

```java
class Solution {
    public boolean fourSum(int[] arr, int x) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
                
                int left = j + 1, right = n - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                
                    if (sum < x) {
                        left++;
                    } else if (sum > x) {
                        right--;
                    } else {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/four-elements2452/1)