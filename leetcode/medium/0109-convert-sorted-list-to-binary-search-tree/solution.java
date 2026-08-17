/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    ListNode head; 

    int countNodes(ListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    TreeNode sortedListToBSTUtil(int n) {
        if (n <= 0) return null;

        TreeNode left = sortedListToBSTUtil(n / 2);

        TreeNode root = new TreeNode(head.val);
        root.left = left;

        head = head.next;

        root.right = sortedListToBSTUtil(n - n / 2 - 1);

        return root;
    }

    public TreeNode sortedListToBST(ListNode node) {
        head = node;
        int n = countNodes(node);
        return sortedListToBSTUtil(n);
    }
}