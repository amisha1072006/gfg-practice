/* structure for link list node
class Node {
    Node next;
    int data;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node deleteK(Node head, int k) {
        // Your code here
        Node temp=head;
        Node prev=null;
        int count=0;
        while(temp != null){
            count++;
            if(count%k==0){
                prev.next=temp.next;
            }
            prev=temp;
            temp=temp.next;
            
        }
        return head;
    }
}