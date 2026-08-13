// Node is defined as:
// class Node{
//     int val;
//     Node next;
//     Node(int x){
//     	val = x; next = null;
//     }
// }
class Solution{
    static int solve(Node root){
        int criticalPoints = 0;
        if (root == null || root.next == null || root.next.next == null) return criticalPoints;
        
        Node previous = root;
        Node current = root.next;
        Node nextNode = current.next;
        
        while (current.next != null) {
            if ((previous.val < current.val && current.val > nextNode.val)
                || (previous.val > current.val && current.val < nextNode.val)) {
                criticalPoints++;
            }
            
            previous = current;
            current = nextNode;
            nextNode = nextNode.next;
        }
        
        return criticalPoints;
    }
}