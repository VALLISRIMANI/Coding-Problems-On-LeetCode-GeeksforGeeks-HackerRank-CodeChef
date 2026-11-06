# Set Mismatch

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You have a set of integers `s`, which originally contains all the numbers from `1` to `n`. Unfortunately, due to some error, one of the numbers in `s` got duplicated to another number in the set, which results in  **repetition of one**  number and  **loss of another**  number.

You are given an integer array `nums` representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return  *them in the form of an array*.

 

 **Example 1:** 

```
Input: nums = [1,2,2,4]
Output: [2,3]

```

 **Example 2:** 

```
Input: nums = [1,1]
Output: [1,2]

```

 

 **Constraints:** 

- 2 <= nums.length <= 104
- 1 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 23 ms (beats 13.23%)  
**Memory:** 46.7 MB (beats 97.74%)  
**Submitted:** 2026-11-06T15:54:37.492Z  

```java
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int dup = -1, missing = -1;
        
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        for (int i = 1; i <= n; i++) {
            if (!countMap.containsKey(i)) {
                missing = i;
            } else if (countMap.get(i) == 2) {
                dup = i;
            }
        }
        
        return new int[] { dup, missing };
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/set-mismatch/)