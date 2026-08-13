// class Node {
//     int data;
//     Node next;

//     Node(int val) {
//         data = val;
//         next = null;
//     }
// }


static Node removeKey(Node head, int key) {
    //write code here...
    Node dummy = new Node(-1);
    dummy.next = head;
    Node prev = dummy;
    Node curr = head;

    while (curr != null) {
        if (curr.data == key) {
            prev.next = curr.next;
        } else {
            prev = curr;
        }
        curr = curr.next;
    }

    return dummy.next;
}