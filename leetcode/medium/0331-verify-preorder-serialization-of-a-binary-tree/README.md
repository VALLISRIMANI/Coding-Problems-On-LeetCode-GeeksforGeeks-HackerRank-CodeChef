# Verify Preorder Serialization of a Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

One way to serialize a binary tree is to use  **preorder traversal**. When we encounter a non-null node, we record the node's value. If it is a null node, we record using a sentinel value such as `'#'`.

For example, the above binary tree can be serialized to the string `"9,3,4,#,#,1,#,#,2,#,6,#,#"`, where `'#'` represents a null node.

Given a string of comma-separated values `preorder`, return `true` if it is a correct preorder traversal serialization of a binary tree.

It is  **guaranteed**  that each comma-separated value in the string must be either an integer or a character `'#'` representing null pointer.

You may assume that the input format is always valid.

- For example, it could never contain two consecutive commas, such as "1,,3".

 **Note:** You are not allowed to reconstruct the tree.

 

Original
Java
 **Example 1:** 

```
Input: preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#"
Output: true

```

 **Example 2:** 

```
Input: preorder = "1,#"
Output: false

```

 **Example 3:** 

```
Input: preorder = "9,#,#,1"
Output: false

```

 

 **Constraints:** 

- 1 <= preorder.length <= 104
- preorder consist of integers in the range [0, 100] and '#' separated by commas ','.

## Solution

**Language:** Java  
**Runtime:** 11 ms (beats 5.05%)  
**Memory:** 44.5 MB (beats 66.28%)  
**Submitted:** 2026-11-20T05:46:06.272Z  

```java
class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        List<String> stack = new ArrayList<>();

        for (String node : nodes) {
            stack.add(node);

            while (stack.size() >= 3 
                    && stack.get(stack.size() - 1).equals("#")
                    && stack.get(stack.size() - 2).equals("#")
                    && !stack.get(stack.size() - 3).equals("#")
            ) {
                    stack.remove(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    stack.add("#");
            }
        }

        return stack.size() == 1 && stack.get(0).equals("#");
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/)