# Kth Permutation of First n Naturals

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers  **n**  and  **k**, find the  **k-th**  permutation sequence of the first n natural numbers arranged in lexicographical order. Return the answer as a string.

 **Examples :** 

```
Input: n = 4, k = 3
Output: 1324
Explanation:The permutations in lexicographical order are 1234, 1243, 1324,..., so the 3rd permutation is 1324.

```

```
Input: n = 3, k = 5
Output: 312
Explanation: The permutations in lexicographical order are 123, 132, 213, 231, 312, 321, so the 5th permutation is 312.
```

 **Constraints:** 
1 ≤ n ≤ 9
1 ≤ k ≤ n!

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T10:42:11.790Z  

```java
class Solution {
    public static String kthPermutation(int n, int k) {
        // code here
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        
        int factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial *= i;
        }
        
        StringBuilder result = new StringBuilder();
        k--;
        
        while (n > 0) {
            int index = k / factorial;
            result.append(nums.get(index));
            nums.remove(index);
            
            k %= factorial;
            n--;
            
            if (n > 0) {
                factorial /= n;
            }
        }
        
        return result.toString();
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-kth-permutation-0932/1)