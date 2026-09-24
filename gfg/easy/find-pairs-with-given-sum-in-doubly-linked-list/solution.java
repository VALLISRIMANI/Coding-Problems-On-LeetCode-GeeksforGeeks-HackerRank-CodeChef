/* Structure of Doubly Linked List Node
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}; */

class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        Node start = head;
        Node end = head;
        
        while (end.next != null) {
            end = end.next;
        }
        
        while (start != end && end.next != start) {
            int sum = start.data + end.data;
            
            if (sum == target) {
                result.add(new ArrayList<>(Arrays.asList(start.data, end.data)));
                start = start.next;
                end = end.prev;
            } else if (sum < target) {
                start = start.next;
            } else {
                end = end.prev;
            }
        }
        
        return result;
    }
}