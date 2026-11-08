# Contains Duplicate III

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an integer array `nums` and two integers `indexDiff` and `valueDiff`.

Find a pair of indices `(i, j)` such that:

- i != j,
- abs(i - j) <= indexDiff.
- abs(nums[i] - nums[j]) <= valueDiff, and

Return `true` *if such pair exists or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: nums = [1,2,3,1], indexDiff = 3, valueDiff = 0
Output: true
Explanation: We can choose (i, j) = (0, 3).
We satisfy the three conditions:
i != j --> 0 != 3
abs(i - j) <= indexDiff --> abs(0 - 3) <= 3
abs(nums[i] - nums[j]) <= valueDiff --> abs(1 - 1) <= 0

```

 **Example 2:** 

```
Input: nums = [1,5,9,1,5,9], indexDiff = 2, valueDiff = 3
Output: false
Explanation: After trying all the possible pairs (i, j), we cannot satisfy the three conditions, so we return false.

```

 

 **Constraints:** 

- 2 <= nums.length <= 105
- -109 <= nums[i] <= 109
- 1 <= indexDiff <= nums.length
- 0 <= valueDiff <= 109

## Solution

**Language:** Java  
**Runtime:** 86 ms (beats 74.58%)  
**Memory:** 126.2 MB (beats 17.07%)  
**Submitted:** 2026-11-08T16:05:30.315Z  

```java
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (indexDiff <= 0 || valueDiff < 0) {
            return false;
        }

        long w = (long) valueDiff + 1;

        Map<Long, Long> buckets = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            long num = nums[i];
            long id = Math.floorDiv(num, w);

            if (buckets.containsKey(id)) {
                return true;
            }

            if (buckets.containsKey(id - 1) && num - buckets.get(id - 1) <= valueDiff) {
                return true;
            }

            if (buckets.containsKey(id + 1) && buckets.get(id + 1) - num <= valueDiff) {
                return true;
            }

            buckets.put(id, num);

            if (i >= indexDiff) {
                long oldId = Math.floorDiv((long) nums[i - indexDiff], w);

                buckets.remove(oldId);
            }
        }

        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contains-duplicate-iii/)