# Intersection of Two Linked Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two linked lists  **head1** and  **head2**, find the intersection of two linked lists. Each of the two linked lists contains distinct node values.

 **Note:**  The order of nodes in this list should be the same as the order in which those particular nodes appear in input head1 and return null if no common element is present.

 **Examples:** 

```
Input: head1: 9->6->4->2->3->8, head2: 1->2->8->6
 
Output: 6->2->8
Explanation: Nodes 6, 2 and 8 are common in both of the lists and the order will be according to LinkedList1. 
```

```
Input: head1: 5->3->1->13->14, head2: 3->13
 
Output: 3->13
Explanation: Nodes 3 and 13 are common in both of the lists and the order will be according to LinkedList1. 
```

 **Constraints:** 
1 ≤ no. of nodes in head1, head2 ≤ 104
1 ≤ node->data ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T06:28:50.297Z  

```java
/* structure of list node:

class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data=val;
        next=null;
    }
}

*/

class Solution {
    public Node findIntersection(Node head1, Node head2) {
        // code here
        Set<Integer> set = new HashSet<>();
        Node temp = head2;
        
        while (temp != null) {
            set.add(temp.data);
            temp = temp.next;
        }
        
        Node dummy = head1;
        Node result = new Node(-1);
        Node tail = result;
        
        while (dummy != null) {
            if (set.contains(dummy.data)) {
                tail.next = new Node(dummy.data); 
                tail = tail.next;
            }
            
            dummy = dummy.next;
        }
        
        return result.next; 
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/intersection-of-two-linked-list/1)