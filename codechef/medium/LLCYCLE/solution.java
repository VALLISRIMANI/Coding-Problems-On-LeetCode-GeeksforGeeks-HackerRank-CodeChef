// class Node {
//     int val;
//     Node next;
//     Node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }



public static int detectCycle(Node head) {
    //write your code here...
    Node slow = head;
    Node fast = head;
    
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        
        if (slow == fast) {
            break;
        }
    }
    
    if (fast == null || fast.next == null) return -1;
    
    slow = head;
    int index = 0;  
    while (slow != fast) {
        slow = slow.next;
        fast = fast.next;
        index++;
    }
    
    return index;
}
