# Rotate Deque By K

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a deque  **dq** (double-ended queue) containing non-negative integers, along with two positive integer  **type** and  **k**. The task is to rotate the deque circularly by  **k**  positions.
There are two types of rotation operations:

- Right Rotation (Clockwise): If type = 1, rotate the deque to the right. This means moving the last element to the front, and repeating the process k times.
- Left Rotation (Anti-Clockwise): If type = 2, rotate the deque to the left. This means moving the first element to the back, and repeating the process k times.

 **Examples:** 

```
Input: dq = [1, 2, 3, 4, 5, 6], type = 1, k = 2
Output: [5, 6, 1, 2, 3, 4] 
Explanation: The type is 1 and k is 2. So, we need to right rotate dequeue by 2 times.
In first right rotation we get [6, 1, 2, 3, 4, 5].
In second right rotation we get [5, 6, 1, 2, 3, 4].
```

```
Input: dq = [10, 20, 30, 40, 50], type = 2, k = 3 
Output: [40, 50, 10, 20, 30] 
Explanation: The type is 2 and k is 3. So, we need to left rotate dequeue by 3 times.
In first left rotation we get [20, 30, 40, 50, 10]. 
In second left rotation we get [30, 40, 50, 10, 20].
In third left rotation we get [40, 50, 10, 20, 30].
```

 **Constraints:** 
1 ≤ dq.size() ≤ 105 
1 ≤ k ≤ 105 
1 ≤ type ≤ 2

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T05:26:51.862Z  

```java
class Solution {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // code here
        /* int n = dq.size();
        k = k % n;
        
        if (k == 0) return;
        
        List<Integer> temp = new ArrayList<>(dq);
        dq.clear();
        
        if (type == 1) {
            for (int i = n - k; i < n; i++) dq.addLast(temp.get(i));
            for (int i = 0; i < n - k; i++) dq.addLast(temp.get(i));
        } else {
            for (int i = k; i < n; i++) dq.addLast(temp.get(i));
            for (int i = 0; i < k; i++) dq.addLast(temp.get(i));
        } */
        
        int n = dq.size();
        k = k % n;
        
        if (k == 0) return;
        
        if (type == 1) {
            for (int i = 0; i < k; i++) {
                dq.addFirst(dq.removeLast());
            }
        } else {
            for (int i = 0; i < k; i++) {
                dq.addLast(dq.removeFirst());
            }
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rotate-deque-by-k/1)