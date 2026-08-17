// Node structure used:
// class Node {
//     int val;
//     Node next;
//     Node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }

class Solution {
static Node reverse(Node head) {
    Node prev = null, curr = head, next = null;
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

public boolean isPalindrome(Node head) {
    if (head == null || head.next == null)
        return true;
        
    Node slow = head, fast = head;
    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }


    Node secondHalf = reverse(slow.next);
    Node firstHalf = head;


    Node temp = secondHalf;
    while (temp != null) {
        if (firstHalf.val != temp.val)
            return false;
        firstHalf = firstHalf.next;
        temp = temp.next;
    }

    return true;
}
}
