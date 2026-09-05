# Rearrange a linked list

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a singly linked list, the task is to rearrange it in a way that all odd position nodes are together and all even position nodes are together. (Considering 1-based indexing.)

 **Note:**  You should place all odd-positioned nodes first and then the even-positioned ones. Also, the relative order of odd-positioned nodes and even-positioned nodes should be maintained. 

 **Examples:** 

```
Input: head: 1->2->3->4
Output: 1->3->2->4 
Explanation: Odd elements are 1, 3 and even elements are 2, 4. Hence, resultant linked list is 1->3->2->4
 
```

```
Input: head: 1->2->3->4->5
Output: 1->3->5->2->4 
Explanation: Odd elements are 1, 3, 5 and even elements are 2, 4. Hence, resultant linked list is 1->3->5->2->4.
 
```

 **Constraints:** 
1 ≤ number of nodes ≤ 104
0 ≤ node->data ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T05:17:39.392Z  

```java
/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public void rearrangeEvenOdd(Node head) {
        // code here
        if (head == null || head.next == null) return;
        
        Node odd = head, even = head.next, evenHead = even;
        
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            
            even.next = odd.next;
            even = even.next;
        }
        
        odd.next = evenHead;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rearrange-a-linked-list/1)