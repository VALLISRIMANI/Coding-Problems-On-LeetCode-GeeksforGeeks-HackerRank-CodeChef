# Find Duplicate Subtrees

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a binary tree, return all  **duplicate subtrees**.

For each kind of duplicate subtrees, you only need to return the root node of any  **one**  of them.

Two trees are  **duplicate**  if they have the  **same structure**  with the  **same node values**.

 

 **Example 1:** 

```
Input: root = [1,2,3,4,null,2,4,null,null,4]
Output: [[2,4],[4]]

```

 **Example 2:** 

```
Input: root = [2,1,1]
Output: [[1]]

```

 **Example 3:** 

```
Input: root = [2,2,2,3,null,3,null]
Output: [[2,3],[3]]

```

 

 **Constraints:** 

- The number of the nodes in the tree will be in the range [1, 5000]
- -200 <= Node.val <= 200

## Solution

**Language:** Java  
**Runtime:** 13 ms (beats 86.40%)  
**Memory:** 52.8 MB (beats 84.98%)  
**Submitted:** 2026-11-08T16:18:18.850Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    HashMap<String, Integer> ids = new HashMap<>();
    HashMap<Integer, Integer> freq = new HashMap<>();
    List<TreeNode> result = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return result;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        int left = dfs(node.left);
        int right = dfs(node.right);

        String key = node.val + "," + left + "," + right;
        int id = ids.computeIfAbsent(key, k -> ids.size() + 1);

        int count = freq.getOrDefault(id, 0);

        if (count == 1) result.add(node);

        freq.put(id, count + 1);

        return id;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-duplicate-subtrees/)