# Adjacent XOR Transformation

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]** of size  **n,**   transform it according to the following rule:

- For every index i from 0 to n - 2, replace arr[i] with arr[i] XOR arr[i + 1].
- The last element has no next element, so it remains unchanged.

Return the resulting array after performing the transformation.

 **Examples:** 

```
Input: arr[] = [10, 11, 1, 2, 3]
Output : [1, 10, 3, 1, 3]
Explanation:
At index 0, arr[0] xor arr[1] = 1.
At index 1, arr[1] xor arr[2] = 10.
At index 2, arr[2] xor arr[3] = 3.
At index 2, arr[3] xor arr[4] = 1.
At index 4, No element is left so, it will remain as
it is.
New Array will be [1, 10, 3, 1, 3].
```

```
Input: arr[] = [5, 9, 7, 6]
Output: [12, 14, 1, 6]
Explanation:
At index 0, arr[0] xor arr[1] = 12.
At index 1, arr[1] xor arr[2] = 14.
At index 2, arr[2] xor arr[3] = 1.
At index 3, No element is left So, it will remain as it is.
New Array will be [12, 14, 1, 6].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T15:12:11.452Z  

```java
class Solution {
    public ArrayList<Integer> xorArray(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            result.add(arr[i] ^ arr[i + 1]);
        }
        
        result.add(arr[n - 1]);
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/game-with-nos3123/1)