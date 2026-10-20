# Minimum Absolute Difference in BST

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a Binary Search Tree (BST), return  *the minimum absolute difference between the values of any two different nodes in the tree*.

 

 **Example 1:** 

```
Input: root = [4,2,6,1,3]
Output: 1

```

 **Example 2:** 

```
Input: root = [1,0,48,null,null,12,49]
Output: 1

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [2, 104].
- 0 <= Node.val <= 105

 

 **Note:**  This question is the same as 783: https://leetcode.com/problems/minimum-distance-between-bst-nodes/

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 39.79%)  
**Memory:** 46.7 MB (beats 67.49%)  
**Submitted:** 2026-10-20T06:39:23.260Z  

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
    Integer prev = null;
    int minDiff = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, root.val - prev);
        }

        prev = root.val;

        inorder(root.right);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-absolute-difference-in-bst/)