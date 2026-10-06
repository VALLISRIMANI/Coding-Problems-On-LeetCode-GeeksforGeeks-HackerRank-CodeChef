# Intersection Sorted Linked Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two singly linked lists  **head1**  and **head2**, where both lists are sorted in increasing order, find their intersection and create a new linked list containing all the common elements.
- If an element occurs multiple times in both lists, it should appear in the intersection as many times as it occurs in both lists.
- The original linked lists should not be modified.
 **Examples:** 

```
Input: head1 = 1 -> 2 -> 3 -> 4 -> 6, head2 = 2 -> 4 -> 6 -> 8
Output: 2 -> 4-> 6
Explanation: For the given two linked list, 2, 4 and 6 are the elements in the intersection.

```

```
Input: head1 = 1 -> 2 -> 2 -> 3 -> 4, head2 = 2 -> 2 -> 2 -> 4 -> 5
Output: 2 -> 2 -> 2 -> 3 -> 4
Explanation: For the given two linked list, 2, 2 and 4 are the elements in the intersection.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T06:24:07.767Z  

```java
/* Structure of a Linked list Node
 class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node findIntersection(Node head1, Node head2) {
        // code here
        Node temp1 = head1, temp2 = head2;
        
        Node result = new Node(-1);
        Node temp = result;
        
        while (temp1 != null && temp2 != null) {
            if (temp1.data == temp2.data) {
                temp.next = new Node(temp1.data);
                temp = temp.next;
                
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else if (temp1.data < temp2.data) {
                temp1 = temp1.next;
            } else {
                temp2 = temp2.next;
            }
        }
        
        return result.next;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1)