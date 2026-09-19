# Product of Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array,  **arr[]**  of positive integers. Your task is to return the product of array elements under the given modulo,  **mod** with the value of 1000000007.

Note: The modulo operation finds the remainder after the division of one by another. For example, k(mod(m)) = k%m = remainder obtained when k is divided by m

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4]
Output: 24
Explanation: The product of the elements in the array is 1×2×3×4=24. Since 24 is less than 1000000007, the output is simply 24.
```

```
Input: arr[] = [100000, 100000, 100000]
Output: 993000007
Explanation:  The product of the array elements is 100000 × 100000 × 100000 = 1000000000000000. Taking modulo 1000000007, the result is 1000000000000000 % 1000000007 = 993000007
```

 **Constraints:** 
1<=arr.size<=105
1<=arr[i]<=105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T15:57:24.619Z  

```java
class Solution {
    public long product(long arr[]) {
        // code here
        long mod = 1000000007L;
        long result = 1;
        
        for (int i = 0; i < arr.length; i++) {
            result = (result * (arr[i] % mod)) % mod;
        }
        
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/product-of-array-element/1)