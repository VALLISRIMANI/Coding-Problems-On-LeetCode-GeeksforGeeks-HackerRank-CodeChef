# Interleave the First Half of the Queue with Second Half

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a queue  **q**  of  **even** size, rearrange the queue by interleaving its  **first half** with the **second half**.

 **Interleaving**  is the process of mixing two sequences by alternating their elements while preserving their relative order.
In other words, Interleaving means place the first element from the first half and then first element from the 2nd half and again second element from the first half and then second element from the 2nd half and so on.

 **Examples:** 

```
Input: q = [2, 4, 3, 1]
Output: [2, 3, 4, 1]
Explanation: We place the first element of the first half 2 and after that place the first element of second half 3 and after that repeat the same process one more time so the resulting queue will be [2, 3, 4, 1]
```

```
Input: q = [3, 5]
Output: [3, 5]
Explanation: We place the first element of the first half 3 and first element of the second half 5 so the resulting queue is [3, 5]
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:25:05.342Z  

```java
class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        int n = q.size();
        
        Queue<Integer> q1 = new LinkedList<>();
        for (int i = 0; i < n / 2; i++) {
            q1.offer(q.poll());
        }
        
        Queue<Integer> q2 = new LinkedList<>();
        for (int i = n / 2; i < n; i++) {
            q2.offer(q.poll());
        }
        
        while (!q1.isEmpty() && !q2.isEmpty()) {
            q.offer(q1.poll());
            q.offer(q2.poll());
        }
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/interleave-the-first-half-of-the-queue-with-second-half/1)