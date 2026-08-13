public static int getLength(Node head) {
     //write code here...
     int length = 0;
     Node temp = head;
     
     while (temp != null) {
         length++;
         temp = temp.next;
     }
     
     return length;
 }