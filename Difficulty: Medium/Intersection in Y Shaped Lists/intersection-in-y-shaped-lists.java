/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node temp1 = head1;
        Node temp2 = head2;
        Node prev1 = null;
        Node prev2 = null;
        while(temp1.next!=null && temp2.next!=null){
            prev1 = temp1;
            temp1 = temp1.next;
            prev1.next = null;
            if(temp2.next==null){
                return temp2;
            }
            prev2 = temp2;
            temp2 = temp2.next;
            prev2.next = null;
        }
        
        return temp1.next==null ? temp1:temp2;

    }
}