
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
