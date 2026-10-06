# Relative Ranks

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `score` of size `n`, where `score[i]` is the score of the `ith` athlete in a competition. All the scores are guaranteed to be  **unique**.

The athletes are  **placed**  based on their scores, where the `1st` place athlete has the highest score, the `2nd` place athlete has the `2nd` highest score, and so on. The placement of each athlete determines their rank:

- The 1st place athlete's rank is "Gold Medal".
- The 2nd place athlete's rank is "Silver Medal".
- The 3rd place athlete's rank is "Bronze Medal".
- For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").

Return an array `answer` of size `n` where `answer[i]` is the  **rank**  of the `ith` athlete.

 

 **Example 1:** 

```
Input: score = [5,4,3,2,1]
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
```

 **Example 2:** 

```
Input: score = [10,3,8,9,4]
Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].

```

 

 **Constraints:** 

- n == score.length
- 1 <= n <= 104
- 0 <= score[i] <= 106
- All the values in score are unique.

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 76.01%)  
**Memory:** 47.2 MB (beats 92.26%)  
**Submitted:** 2026-10-06T06:04:36.275Z  

```java
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{score[i], i});
        }

        String[] result = new String[n];
        int rank = 1;

        while (!pq.isEmpty()) {
            int idx = pq.poll()[1];

            if (rank == 1) {
                result[idx] = "Gold Medal";
            } else if (rank == 2) {
                result[idx] = "Silver Medal";
            } else if (rank == 3) {
                result[idx] = "Bronze Medal";
            } else {
                result[idx] = String.valueOf(rank);
            }

            rank++;
        }

        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/relative-ranks/)