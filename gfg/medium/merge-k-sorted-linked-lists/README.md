# Merge K sorted linked lists

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]** of  **n**   **sorted linked lists**  of different sizes. Your task is to  **merge** all these lists into a single  **sorted**  linked list and return the  **head** of the merged list.

 **Examples:** 

```
Input:
   
Output: 1 -> 2 -> 3 -> 4 -> 7 -> 8 -> 9
Explanation: The arr[] has 3 sorted linked list of size 3, 3, 1.
1st list: 1 -> 3 -> 7
2nd list: 2 -> 4 -> 8
3rd list: 9
The merged list will be: 
    
```

```
Input:
   
Output: 1 -> 3 -> 4 -> 5 -> 6 -> 8
Explanation: The arr[] has 3 sorted linked list of size 2, 1, 3.
1st list: 1 -> 3
2nd list: 8
3rd list: 4 -> 5 -> 6
The merged list will be: 
    
```

 **Constraints** 
1 ≤ total no. of nodes ≤ 105
1 ≤ node->data ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T15:19:43.586Z  

```java
/*
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
    Node mergeKLists(Node[] arr) {
        // code here
        if (arr == null || arr.length == 0) return null;

        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

        for (Node node : arr) {
            if (node != null) pq.add(node);
        }

        Node dummy = new Node(0);
        Node tail = dummy;

        while (!pq.isEmpty()) {
            Node min = pq.poll();
            tail.next = min;
            tail = tail.next;

            if (min.next != null) {
                pq.add(min.next);
            }
        }    

        return dummy.next;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1)