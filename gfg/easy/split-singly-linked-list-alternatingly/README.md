# Split Linked List Alternatingly

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the head of a singly linked list, split the list into two sub-linked lists by placing alternating nodes into each list.

- The first node should go to the first list, the second node to the second list, the third node to the first list, and so on.
- Preserve the relative order of nodes in both sub-linked lists and return them as an array of two linked lists.

 **Examples:** 

```
Input: LinkedList = 0->1->0->1->0->1
Output: 0->0->0, 1->1->1
Explanation: After forming two sublists of the given list as required, we have two lists as: 0->0->0 and 1->1->1.

```

```
Input: LinkedList = 2->5->8->9->6
Output: 2->8->6, 5->9
Explanation: After forming two sublists of the given list as required, we have two lists as: 2->8->6 and 5->9.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T06:38:20.633Z  

```java
/* Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {

    public ArrayList<Node> alternatingSplitList(Node head) {
        // code here
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);

        Node tail1 = dummy1;
        Node tail2 = dummy2;

        boolean first = true;

        while (head != null) {

            if (first) {
                tail1.next = new Node(head.data);
                tail1 = tail1.next;
            } else {
                tail2.next = new Node(head.data);
                tail2 = tail2.next;
            }

            first = !first;
            head = head.next;
        }

        return new ArrayList<>(Arrays.asList(dummy1.next, dummy2.next));
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/split-singly-linked-list-alternatingly/1)