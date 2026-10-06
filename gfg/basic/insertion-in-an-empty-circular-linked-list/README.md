# Insertion in Empty Circular List

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an empty circular linked list,  inserts a new node into the empty circular linked list.

 **Examples:** 

```
Input: 1
Output: 1

Explanation: The list is empty, so the first node with value 1 is inserted and points to itself.
```

```
Input: 5
Output: 5

Explanation: The list is empty, so the first node with value 5 is inserted and points to itself.
```

**Constraints:
**1 ≤ node->data ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T06:14:12.746Z  

```java
/*class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public Node insertIntoEmpty(Node last, int data) {
        // code here
        Node newNode = new Node(data);
        newNode.next = newNode;
        last = newNode;
        
        return last;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/insertion-in-an-empty-circular-linked-list/1)