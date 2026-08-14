# RTLL - Rating 1400

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Reverse a Linked List

The Chef gives you a singly linked list $A$ integers and ask you to help him reverse the list.

Complete the function "listReverse" in the code snippet that takes a single argument: head of the linked list.

### Input Format
- The first line contains an integer $N$ - representing the number of elements of the linked list.
- The second line contains $N$ integers - representing the elements of the linked list.
### Output Format

For each testcase, output will be in a single line containing a list returned by the function listReverse.

### Constraints
- $1 \leq N \leq 10^5$
- $-10^9 \leq$ Node->value $\leq 10^9$
### Sample 1:
Input
Output

```
5
1 2 3 4 5
```

```
5 4 3 2 1
```

### Sample 2:
Input
Output

```
5
1 1 3 2 1
```

```
1 2 3 1 1
```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T15:39:36.486Z  

```cpp
/*
public class Main {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }*/
public static Node listReverse(Node head) {
        // Write your code here 
        Node prevNode = null;
        Node currentNode = head;
        Node nextNode = null;
        
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        
        return prevNode;
    }

    


```

---

[View on CodeChef](https://www.codechef.com/problems/RTLL)