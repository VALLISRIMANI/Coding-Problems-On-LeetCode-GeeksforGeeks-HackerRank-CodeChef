/*class Node{
    int val;
    Node next;
    Node(int x){
    	val = x; next = null;
    }
}*/

static Node rotateRight(Node head, int R){
    if (head == null || head.next == null || R == 0) return head;
    
    Node last = head;
    int count = 1;
    while (last.next != null) {
        count++;
        last = last.next;
    }
    
    R = R % count;
    if (R == 0) return head;
    
    Node newLast = head;
    for (int i = 0; i < count - R - 1; i++) {
        newLast = newLast.next;
    }
    
    Node newHead = newLast.next;
    newLast.next = null;
    last.next = head;
    
    return newHead;
}