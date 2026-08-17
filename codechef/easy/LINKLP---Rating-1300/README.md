# LINKLP - Rating 1300

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Count loop length in Linked List

Given a linked list, there may exist a single loop or no loop. If there are a total of  **X**  elements present in a loop, return  **X-1**  as your answer; otherwise, in case no loop exists, return  **-1**.

To solve this problem, complete the function present in the submit solution tab.

### Input Format
- The first line will contain N, representing the elements in the linked list.

(For example, if N equals 5, the linked list looks like 1 -> 2 -> 3 -> 4 -> 5)

- The second line contains M, representing the last node's connection point. If the second line contains -1, then the last node will be connected to a null node; otherwise, it will be connected to one of the previous nodes.

(Example 1: If M equals -1 and N equals 5, the linked list looks like 1 -> 2 -> 3 -> 4 -> 5 -> NULL)

(Example 2: If M equals 2 and N equals 5, the linked list looks like 1 -> 2 -> 3 -> 4 -> 5 -> 2)

### Constraints

Maximum elements in the linked list can be 10^5.

### Sample 1:
Input
Output

```
5
-1
```

```
-1
```

### Sample 2:
Input
Output

```
5
2
```

```
3
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:28:08.011Z  

```java

// Node is defined as:
// class Node{
//     int val;
//     Node next;
//     Node(){
//         val =0;
//         next = null;
//     }
//     Node(int x){
//     	val = x; next = null;
//     }
// }
class Solution{
    static int solve(Node root){
        if (root == null || root.next == null) {
            return -1;
        }
        
        Node slow = root;
        Node fast = root;
        boolean hasLoop = false;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }
        
        if (!hasLoop) {
            return -1;
        }
        
        int loopLength = 1;
        fast = fast.next;
        while (fast != slow) {
            fast = fast.next;
            loopLength++;
        }
        
        return loopLength;
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LINKLP)