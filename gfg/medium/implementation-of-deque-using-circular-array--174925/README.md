# Deque using Circular Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Implement a  **Deque** (Double Ended Queue) using a circular array, where the size of the array,  **n**  is given.
The Deque must support the following operations:

 **(i)**   **insertFront**  **(x):**  Adds an element x at the front of Deque.
 **(ii)**   **insertRear**  **(x):**  Adds an element x at the rear of Deque.
 **(iii)**   **deleteFront**  **():**  Deletes an element from front of Deque. 
 **(iv)**   **deleteRear**  **():**  Deletes an element from rear of Deque.
 **(v)**   **frontEle**  **():**  Gets the front element from queue. Return -1 if it is empty.
 **(vi)**   **rearEle**  **():**  Gets the last element from queue. Return -1 if it is empty.

There will be a sequence of queries  **queries[][]**. The queries are represented in numeric form:

- 1 x : Call insertFront(x)
- 2 x : Call insertRear(x)
- 3 : Call deleteFront()
- 4 : Call deleteRear()
- 5 : Call frontEle()
- 6 : Call rearEle()

You just have to implement the functions  **insertFront**  **,**  **insertRear**  **,**  **deleteFront**  **,**  **deleteRear**  **,**  **frontEle** and  **rearEle**  and the driver code will handle the input & output.

 **Note:** It is guaranteed that all the queries are valid.

 **Examples:** 

```
Input: n = 3, q = 6, queries[][] = [[1, 3], [2, 5], [1, 6], [6], [3], [5]]
Output: [5, 3]
Explanation: Queries on Deque are as follows:
insertFront(3): Insert 3 at the front of the Deque.
insertRear(5): Insert 5 at the rear of the Deque.
insertFront(6): Insert 6 at the front of the Deque.
rearEle(): Return the rear element i.e 5.
deleteFront(): Remove the front element 6 from the Deque.
frontEle(): Return the front element i.e 3.
```

```
Input: n = 2, q = 4, queries[][] = [[2, 4], [3], [6], [5]]
Output: [-1, -1]
Explanation: Queries on Deque are as follows:
insertRear(4): Insert 4 at the rear of the Deque.
deleteFront(): Remove the front element 4 from the Deque.
rearEle(): As the Deque is empty return -1.
frontEle(): As the Deque is empty return -1.
```

 **Constraints:** 
1 ≤ n ≤ 103
1 ≤ number of query ≤ 103
0 ≤ x ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T05:48:16.084Z  

```java
class myDeque {
    int[] deque;
    int front, size, capacity;
    
    public myDeque(int n) {
        // Initialize your data members
        deque = new int[n];
        front = 0;
        size = 0;
        capacity = n;
    }

    public void insertFront(int x) {
        // Insert element at the front
        if (size == capacity) return;
        front = (front - 1 + capacity) % capacity;
        deque[front] = x;
        size++;
    }

    public void insertRear(int x) {
        // Insert element at the rear
        if (size == capacity) return;
        int rear = (front + size) % capacity;
        deque[rear] = x;
        size++;
    }

    public void deleteFront() {
        // Delete element from the front
        if (size == 0) return;
        front = (front + 1) % capacity;
        size--;
    }

    public void deleteRear() {
        // Delete element from the rear
        if (size == 0) return;
        size--;
    }

    public int frontEle() {
        // Get the front element
        if (size == 0) return -1;

        return deque[front]; 
    }

    public int rearEle() {
        // Get the rear element
        if (size == 0) return -1;

        int rear = (front + size - 1) % capacity;
        return deque[rear]; 
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/implementation-of-deque-using-circular-array--174925/1)