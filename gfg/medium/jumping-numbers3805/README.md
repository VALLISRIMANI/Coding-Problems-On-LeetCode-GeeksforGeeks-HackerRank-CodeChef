# Jumping Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a positive number,  **n**, find the largest Jumping Number that is smaller than or equal to x. 

- A number is called a Jumping Number if all adjacent digits in it differ by only 1.
- All single-digit numbers are considered as Jumping Numbers.
- For example, 7, 898, 7 and 4343456 are Jumping numbers but 796, 677, and 89098 are not.

 **Examples:** 

```
Input: n = 10
Output: 10
Explanation: 10 is the largest Jumping Number possible for x = 10.
```

```
Input: n = 50
Output: 45
Explanation: 45 is the largest Jumping Number possible for X = 50.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-15T15:31:08.585Z  

```java
class Solution {
    static long jumpingNums(long n) {
        // code here
        long maxJumping = 0;

        // BFS for each starting digit from 1 to 9
        for (int i = 1; i <= 9 && i <= n; i++) {
            Queue<Long> queue = new LinkedList<>();
            queue.add((long) i);

            while (!queue.isEmpty()) {
                long curr = queue.poll();

                if (curr <= n) {
                    maxJumping = Math.max(maxJumping, curr);

                    long lastDigit = curr % 10;

                    // If last digit is greater than 0, we can append (lastDigit - 1)
                    if (lastDigit > 0) {
                        long nextNum = curr * 10 + (lastDigit - 1);
                        if (nextNum <= n) {
                            queue.add(nextNum);
                        }
                    }

                    // If last digit is less than 9, we can append (lastDigit + 1)
                    if (lastDigit < 9) {
                        long nextNum = curr * 10 + (lastDigit + 1);
                        if (nextNum <= n) {
                            queue.add(nextNum);
                        }
                    }
                }
            }
        }

        return maxJumping;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/jumping-numbers3805/1)