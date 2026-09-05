# Partition a Linked List around a given value

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the head of a linked list and an integer  **x**, rearrange the list such that:
- All nodes with values less than x appear first,
- Followed by nodes with values equal to x,
- Followed by nodes with values greater than x.
The relative order of nodes within each partition must remain unchanged, and the rearrangement should be performed  **in-place**.
 
 **Examples:** 

```
Input: head: 1->4->2->10, x = 3
 
Output: 1->2->4->10

Explanation: Nodes with value less than 3 come first, then equal to 3 and then greater than 3.
```

```
Input: head: 1->4->3->2->5->2->3, x = 3
 
Output: 1->2->2->3->3->4->5
 
Explanation: Nodes with a value less than 3 come first, then equal to 3 and then greater than 3.

```

 **Constraints:** 
1 ≤ size of linked list ≤ 105
1 ≤ data of node ≤ 105
1 ≤ x ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T06:02:01.679Z  

```java
/* Structure of linked list Node
class Node {
  public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = null;
    }
};
*/
class Solution {
    public Node partition(Node head, int x) {
        // code here
        if (head == null) return head;

        Node lessHead = new Node(-1);
        Node equalHead = new Node(-1);
        Node greaterHead = new Node(-1);
        Node less = lessHead, equal = equalHead, greater = greaterHead;
        Node temp = head;

        while (temp != null) {
            if (temp.data == x) {
                equal.next = temp;
                equal = equal.next;
            } else if (temp.data < x) {
                less.next = temp;
                less = less.next;
            } else {
                greater.next = temp;
                greater = greater.next;
            }

            temp = temp.next;
        }
        
        greater.next = null;

        less.next = (equalHead.next != null) ? equalHead.next : greaterHead.next;
        if (equalHead.next != null) equal.next = greaterHead.next;
        return lessHead.next;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/partition-a-linked-list-around-a-given-value/1)