# Find Subarrays With Equal Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a  **0-indexed**  integer array `nums`, determine whether there exist  **two**  subarrays of length `2` with  **equal**  sum. Note that the two subarrays must begin at  **different**  indices.

Return `true` *if these subarrays exist, and* `false` *otherwise.* 

A  **subarray**  is a contiguous non-empty sequence of elements within an array.

 

 **Example 1:** 

```
Input: nums = [4,2,4]
Output: true
Explanation: The subarrays with elements [4,2] and [2,4] have the same sum of 6.

```

 **Example 2:** 

```
Input: nums = [1,2,3,4,5]
Output: false
Explanation: No two subarrays of size 2 have the same sum.

```

 **Example 3:** 

```
Input: nums = [0,0,0]
Output: true
Explanation: The subarrays [nums[0],nums[1]] and [nums[1],nums[2]] have the same sum of 0. 
Note that even though the subarrays have the same content, the two subarrays are considered different because they are in different positions in the original array.

```

 

 **Constraints:** 

- 2 <= nums.length <= 1000
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 43.3 MB (beats 77.07%)  
**Submitted:** 2026-08-27T05:42:13.029Z  

```java
class Solution {
    public boolean findSubarrays(int[] nums) {
        /*
        int partialSum = 0;
        int totalSum = 0;

        for(int num : nums) {
            totalSum += num;
        }

        for(int i = nums.length - 1; i >= 0; i--) {
            partialSum += nums[i];

            if(partialSum == totalSum) {
                return true;
            } 

            totalSum -= nums[i];
        }

        return false; 
        */

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];

            if (set.contains(sum)) {
                return true;
            }

            set.add(sum);
        }

        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-subarrays-with-equal-sum/)