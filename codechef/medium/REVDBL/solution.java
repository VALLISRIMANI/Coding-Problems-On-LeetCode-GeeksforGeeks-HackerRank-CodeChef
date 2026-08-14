//class Main {

//    static class Node {
//        int data;
//      Node prev, next;
//        Node(int d) { data = d; }
//    }


static Node reverseDLL(Node head) {
    //write code here...
    if (head == null) return null;
    
    Node curr = head;
    Node prevNode = null;
    
    while (curr != null) {
        prevNode = curr.prev;
        curr.prev = curr.next;
        curr.next = prevNode;
        curr = curr.prev;
    }
    
    if (prevNode != null) {
        head = prevNode.prev;
    }
    
    return head;
}