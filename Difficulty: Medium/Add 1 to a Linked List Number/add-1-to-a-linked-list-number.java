/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // code here.
                if (head.next == null) {
            head.data = head.data + 1;
            return head;
        }
        
        Node curr = addOne(head.next);
        
        if (curr.data > 9) {
            int add = curr.data % 10;
            int carry = curr.data / 10;
            curr.data = add;
            head.next = curr;
            head.data = head.data + carry;
        } else {
            head.next = curr;
        }
        
        
        return head;

    }
}