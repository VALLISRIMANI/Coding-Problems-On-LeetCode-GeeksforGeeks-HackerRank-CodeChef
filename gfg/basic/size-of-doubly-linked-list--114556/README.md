# Size of Doubly Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a doubly linked list. The task is to find the number of nodes in the doubly linked list.

 **Examples:** 

```
Input:  1<->2<->3<->4
Output: 4
Explanation: The size of the liked list is 4 which is the number of nodes in it
```

```
Input:  1<->2
output: 2
Explanation: The size of the liked list is 2 which is the number of nodes in it. 
```

 **Constraints:** 

1 ≤ number of nodes ≤ 109
1 ≤ node->data ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T15:50:12.808Z  

```java
/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int a) {
        data = a;
        next = null;
        prev = null;
    }
} */

class Solution {
    public int findSize(Node head) {
        // Code Here
        Node temp = head;
        int count = 0;
        
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        
        return count;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/size-of-doubly-linked-list--114556/1)