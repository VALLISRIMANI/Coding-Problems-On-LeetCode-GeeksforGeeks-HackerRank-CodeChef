# Reverse Two Parts of Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a linked list and an integer  **k**, reverse the first k nodes and separately reverse the remaining n - k nodes of the linked list.

 **Examples:** 

```
Input: head: 1 -> 2 -> 3 -> 4 -> 5,  k = 2
 
Output: 2 -> 1 -> 5 -> 4 -> 3
 
Explanation: Since k = 2, split the linked list into two parts:
First part: 1 -> 2
Second part: 3 -> 4 -> 5
Reversed first part: 2 -> 1
Reversed second part: 5 -> 4 -> 3
Finally, connect the reversed parts to obtain: 2 -> 1 -> 5 -> 4 -> 3
```

```
Input: head: 1 -> 2 -> 4 -> 3,  k = 3
 
Output: 4 -> 2 -> 1 -> 3

Explanation: Since k = 3, split the linked list into two parts:
First part: 1 -> 2 -> 4
Second part: 3
Reversed first part: 4 -> 2 -> 1
Reversed second part: 3
Finally, connect the reversed parts to obtain: 4 -> 2 -> 1 -> 3
```

  **Constraints:** 
1 ≤ size of linked list ≤ 106   
1 ≤ node->data ≤ 106
1 ≤  k < size of linked list

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T15:55:35.546Z  

```java
/* Structure of linked list Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public static Node reverse(Node head, int k) {
        // code here
        Node curr = head;

        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }

        Node secondHead = curr.next;
        curr.next = null; 

        Node firstRev = reverseParts(head);
        Node secondRev = reverseParts(secondHead);

        Node temp = firstRev;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = secondRev;

        return firstRev;  
        
    }
    
    static Node reverseParts(Node head) {
        Node prev = null;
        Node curr = head;
        
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-both-parts--170647/1)