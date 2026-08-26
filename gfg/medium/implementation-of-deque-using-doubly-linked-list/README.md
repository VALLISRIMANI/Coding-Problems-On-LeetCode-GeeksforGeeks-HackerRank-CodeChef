# Implementation of Deque using doubly linked list

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Implement a Deque (Double Ended Queue) using a doubly linked list.
The Deque must support the following operations:

 **(i)**   **insertFront**  **(x):**  Adds an element x at the front of Deque.
 **(ii)**   **insertRear**  **(x):**  Adds an element x at the rear of Deque.
 **(iii)**   **deleteFront**  **():**  Deletes an element from front of Deque. 
 **(iv)**   **deleteRear**  **():**  Deletes an element from rear of Deque.
 **(v)**   **getFront**  **():**  Gets the front element from queue. Return -1 if it is empty.
 **(vi)**   **getRear**  **():**  Gets the last element from queue. Return -1 if it is empty.

There will be a sequence of queries  **queries[][]**. The queries are represented in numeric form:

- 1 x : Call insertFront(x)
- 2 x : Call insertRear(x)
- 3 : Call deleteFront()
- 4 : Call deleteRear()
- 5 : Call getFront()
- 6 : Call getRear()

You just have to implement the functions insertFront, insertRear, deleteFront, deleteRear, getFront and getRear and the driver code will handle the input & output.

 **Note:** It is guaranteed that all the queries are valid.

 **Examples:** 

```
Input: q = 6, queries[][] = [[1, 3], [2, 5], [1, 6], [6], [3], [5]]
Output: [5, 3]
Explanation: Queries on Deque are as follows:
insertFront(3): Insert 3 at the front of the Deque.
insertRear(5): Insert 5 at the rear of the Deque.
insertFront(6): Insert 6 at the front of the Deque.
getRear(): Return the rear element i.e 5.
deleteFront(): Remove the front element 6 from the Deque.
getFront(): Return the front element i.e 3.
```

```
Input: q = 4, queries[][] = [[2, 4], [3], [6], [5]]
Output: [-1, -1]
Explanation: Queries on Deque are as follows:
insertRear(4): Insert 4 at the rear of the Deque.
deleteFront(): Remove the front element 4 from the Deque.
getRear(): As the Deque is empty return -1.
getFront(): As the Deque is empty return -1.
```

 **Constraints:** 
1 ≤ number of query ≤ 103
0 ≤ x ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T06:10:52.297Z  

```java
class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

class myDeque {
    Node head;
    Node tail;
    
    myDeque() {
        // Initialize your data members
        head = null;
        tail = null;
    }

    void insertFront(int x) {
        // Insert element at the front
        Node newNode = new Node(x);
        
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void insertRear(int x) {
        // Insert element at the rear
        Node newNode = new Node(x);
        
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void deleteFront() {
        // Delete element from the front
        if (head == null) return;

        head = head.next;

        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
    }

    void deleteRear() {
        // Delete element from the rear
        if (tail == null) return;

        tail = tail.prev;

        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
    }

    int getFront() {
        // Get front element (-1 if empty)
        return head != null ? head.data : -1;
    }

    int getRear() {
        // Get rear element (-1 if empty)
        return tail != null ? tail.data : -1;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/implementation-of-deque-using-doubly-linked-list/1)