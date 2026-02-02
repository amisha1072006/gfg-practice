/* Structure of LinkedList
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        // Your code here
                if(head==null || head.next==null){
            return false;
            
        }
        Node prev = head;
        Node curr = head.next;
        while(curr.next != null){
           curr=curr.next;
           if(curr.next==prev){
            return true;
            
        }
        }
        return false;
        
        

    }
}