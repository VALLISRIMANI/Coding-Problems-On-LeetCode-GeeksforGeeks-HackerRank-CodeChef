# Check if Linked List Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the head of a singly linked list, find whether the given linked list is sorted or not.

 **Note:**  The sorting can either be non-increasing or non-decreasing.

 **Examples:** 

```
Input: head = 1 -> 5 -> 2 -> 9

Output: false
Explanation: The list is neither in non-decreasing order nor in non-increasing order.
```

```
Input: head = 2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40

Output: true
Explanation: The nodes are arranged in non-decreasing order.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T16:08:58.681Z  

```java
/* Structure of linked list Node
class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }
};*/

class Solution {
    public boolean isSorted(Node head) {
        // code here
        boolean increasing = true;
        boolean decreasing = true;
        
        Node curr = head;
        
        while (curr.next != null) {
            if (curr.data > curr.next.data) {
                increasing = false;
            }
            
            if (curr.data < curr.next.data) {
                decreasing = false;
            }
            
            curr = curr.next;
        }
        
        return increasing || decreasing;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/is-linked-list-sorted/1)