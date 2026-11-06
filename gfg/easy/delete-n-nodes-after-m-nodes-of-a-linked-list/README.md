# Delete n After Every m n Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a linked list, delete  **n**  nodes after skipping  **m**  nodes of a linked list until the last of the linked list.

 **Examples:** 

```
Input: head: 9 -> 1 -> 3 -> 5 -> 9 -> 4 -> 10 -> 1, n = 1, m = 2

Output: 9 -> 1 -> 5 -> 9 -> 10 -> 1

Explanation: Deleting 1 node after skipping 2 nodes each time, we have list as 9 -> 1 -> 5 -> 9 -> 10 -> 1.
```

```
Input: head: 1 -> 2 -> 3 -> 4 -> 5 -> 6, n = 1, m = 6

Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6

Explanation: After skipping 6 nodes for the first time, we will reach of end of the linked list, so, we will get the given linked list itself.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T15:49:19.936Z  

```java
/* Structure of Linked List Node
class Node
{
  int data;
  Node next;
  Node(int data)
  {
      this.data = data;
      this.next = null;
  }
}*/

class Solution {
    static void linkDelete(Node head, int n, int m) {
        // code here
        Node curr = head;

        while (curr != null) {
            for (int i = 0; i < m - 1 && curr != null; i++) {
                curr = curr.next;
            }

            if (curr == null) {
                return;
            }

            Node temp = curr.next;
            for (int i = 0; i < n && temp != null; i++) {
                temp = temp.next;
            }

            curr.next = temp;
            curr = temp;
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/1)