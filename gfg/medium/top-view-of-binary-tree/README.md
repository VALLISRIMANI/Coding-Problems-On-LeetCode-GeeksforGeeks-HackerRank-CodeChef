# Top View of Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the  **root**  of a binary tree, and your task is to return its  **top view**. The top view of a binary tree is the set of nodes visible when the tree is viewed from the top.

 **Note:** 

- Return the nodes from the leftmost node to the rightmost node.
- If multiple nodes overlap at the same horizontal position, only the topmost (closest to the root) node is included in the view. 

 **Examples:** 

```
Input: root = [1, 2, 3]
Output: [2, 1, 3]
Explanation: The Green colored nodes represents the top view in the below Binary tree.
 
```

```
Input: root = [10, 20, 30, 40, 60, 90, 100]
Output: [40, 20, 10, 30, 100]
Explanation: The Green colored nodes represents the top view in the below Binary tree.

```

 **Constraints:** 
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:43:01.335Z  

```java
/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    static class Pair {
        Node node;
        int hd;
        Pair(Node n, int h) {
            node = n;
            hd = h;
        }
    }
    
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;
    
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
    
        queue.add(new Pair(root, 0));
    
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            Node curr = p.node;
            int hd = p.hd;
    
            if (!map.containsKey(hd)) {
                map.put(hd, curr.data);
            }
    
            if (curr.left != null) queue.add(new Pair(curr.left, hd - 1));
            if (curr.right != null) queue.add(new Pair(curr.right, hd + 1));
        }
    
        result.addAll(map.values());
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1)