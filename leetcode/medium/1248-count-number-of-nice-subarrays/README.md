# Count Number of Nice Subarrays

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` and an integer `k`. A continuous subarray is called  **nice**  if there are `k` odd numbers on it.

Return  *the number of  **nice**  sub-arrays*.

 

 **Example 1:** 

```
Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].

```

 **Example 2:** 

```
Input: nums = [2,4,6], k = 1
Output: 0
Explanation: There are no odd numbers in the array.

```

 **Example 3:** 

```
Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
Output: 16

```

 

 **Constraints:** 

- 1 <= nums.length <= 50000
- 1 <= nums[i] <= 10^5
- 1 <= k <= nums.length

## Solution

**Language:** Java  
**Runtime:** 47 ms (beats 6.23%)  
**Memory:** 56.2 MB (beats 86.94%)  
**Submitted:** 2026-10-03T10:40:47.486Z  

```java
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int currentSum = 0, subarraysCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            currentSum += num % 2;

            if (map.containsKey(currentSum - k)) {
                subarraysCount += map.get(currentSum - k);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return subarraysCount;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-number-of-nice-subarrays/)