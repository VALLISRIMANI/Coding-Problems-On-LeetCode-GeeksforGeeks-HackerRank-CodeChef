# Permutation Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

The set `[1, 2, 3,..., n]` contains a total of `n!` unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for `n = 3`:

- "123"
- "132"
- "213"
- "231"
- "312"
- "321"

Given `n` and `k`, return the `kth` permutation sequence.

 

 **Example 1:** 

```
Input: n = 3, k = 3
Output: "213"

```

 **Example 2:** 

```
Input: n = 4, k = 9
Output: "2314"

```

 **Example 3:** 

```
Input: n = 3, k = 1
Output: "123"

```

 

 **Constraints:** 

- 1 <= n <= 9
- 1 <= k <= n!

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.46%)  
**Memory:** 42.9 MB (beats 56.91%)  
**Submitted:** 2026-09-06T10:37:30.006Z  

```java
class Solution {
    public String getPermutation(int n, int k) {
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

[View on LeetCode](https://leetcode.com/problems/permutation-sequence/)