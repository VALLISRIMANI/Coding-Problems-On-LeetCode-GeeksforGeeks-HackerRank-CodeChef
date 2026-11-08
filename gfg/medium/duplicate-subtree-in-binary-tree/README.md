# Duplicate Subtree Check

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the  **root**  of a binary tree, find if the tree contains any duplicate subtree of size two or more. Two subtrees are considered duplicates if they have the same structure and identical node values.

 **Note:**  Subtrees consisting of only a single leaf node are not considered duplicate subtrees.

 **Examples :** 

```
Input : root = [1, 2, 3] 

Output: false
Explanation: There is no duplicate sub-tree in the given binary tree.
```

```
Input : root = [1, 2, 3, 4, 5, N, 2, N, N, N, N, 4, 5]

Output : true
Explanation : The duplicate subtree is shown below.

```

 **Constraints:** 
0 ≤ Node -> data ≤ 105
1 ≤ Number of nodes ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-08T16:11:51.068Z  

```java
/* Structure of a Tree Node
class Node {
  public:
    int data;
    Node left;
    Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    HashSet<String> set = new HashSet<>();
    boolean found = false;
    
    public boolean dupSub(Node root) {
        // code here
        serialize(root);

        return found;
    }

    private String serialize(Node node) {
        if (node == null) return "#";

        String left = serialize(node.left);
        String right = serialize(node.right);
        String subTree = node.data + "," + left + "," + right;

        if (node.left != null || node.right != null) {
            if (set.contains(subTree)) {
                found = true;
            }

            set.add(subTree);
        }

        return subTree;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/duplicate-subtree-in-binary-tree/1)