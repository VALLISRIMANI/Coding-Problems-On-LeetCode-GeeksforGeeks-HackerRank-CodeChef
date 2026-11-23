# Two Sum IV - Input is a BST

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a binary search tree and an integer `k`, return `true`  *if there exist two elements in the BST such that their sum is equal to*  `k`,  *or*  `false`  *otherwise*.

 

 **Example 1:** 

```
Input: root = [5,3,6,2,4,null,7], k = 9
Output: true

```

 **Example 2:** 

```
Input: root = [5,3,6,2,4,null,7], k = 28
Output: false

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 104].
- -104 <= Node.val <= 104
- root is guaranteed to be a valid binary search tree.
- -105 <= k <= 105

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 31.87%)  
**Memory:** 47.2 MB (beats 34.39%)  
**Submitted:** 2026-11-23T16:45:39.361Z  

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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> seen = new HashSet<>();
        return dfs(root, k, seen);
    }

    private boolean dfs(TreeNode node, int k, Set<Integer> seen) {
        if (node == null) {
            return false;
        }

        int complement = k - node.val;
        if (seen.contains(complement)) {
            return true;
        }

        seen.add(node.val);
        return dfs(node.left, k, seen) || dfs(node.right, k, seen);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/two-sum-iv-input-is-a-bst/)