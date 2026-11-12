# Connect Nodes of Same Levels

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary tree, connect all nodes at the same level using an additional nextRight pointer for each node.

- Initially, all nextRight pointers contain garbage values (or null).
- Your function should set each node’s nextRight pointer to point to its immediate neighbor on the same level. The driver code will print the level-order traversal
- For the rightmost node of a level, the nextRight would stay null.

 **Examples:** 

```
Input: root = [1, 2, 3, 4, 5, N, 6]

Output: [1, #, 2, 3, #, 4, 5, 6, #]
Explanation:The connected tree is:

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T15:10:35.509Z  

```java
/*  Structure of Binary Tree Node
class Node{
    int data;
    Node left;
    Node right;
    Node nextRight;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
        nextRight = null;
    }
} */

class Solution {
    public Node connect(Node root) {
        // code here.
        Node curr = root;

        while (curr != null) {
            Node dummy = new Node(0);
            Node tail = dummy;

            while (curr != null) {
                if (curr.left != null) {
                    tail.nextRight = curr.left;
                    tail = tail.nextRight;
                }
                if (curr.right != null) {
                    tail.nextRight = curr.right;
                    tail = tail.nextRight;
                }
                curr = curr.nextRight;
            }

            curr = dummy.nextRight;
        }

        return root;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/connect-nodes-at-same-level/1)