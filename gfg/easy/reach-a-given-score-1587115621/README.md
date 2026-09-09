# Count Ways with 3, 5 and 10

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Consider a game where a player can score  **3**  or  **5**  or  **10**  points in a move. Given a total score  **n**, find number of distinct combinations to reach the given score.

 **Examples:** 

```
Input: n = 10
Output: 2
Explanation:
There are two ways {5,5} and {10}.
```

```
Input: n = 20
Output: 4
Explanation:
There are four possible ways. {5,5,5,5}, {3,3,3,3,3,5}, {10,10}, {5,5,10}.
```

**Constraints:
**1 ≤ n ≤ 5*105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T13:40:41.141Z  

```java
class Solution {
    public int countWays(int n) {
        // code here
        int[] scores = {3, 5, 10};
        int[] dp = new int[n + 1];
        dp[0] = 1;
        
        for (int score : scores) {
            for (int i = score; i <= n; i++) {
                dp[i] += dp[i - score];
            }
        }
        
        return dp[n];
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reach-a-given-score-1587115621/1)