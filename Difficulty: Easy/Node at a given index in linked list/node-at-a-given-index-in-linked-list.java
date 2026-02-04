/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public int GetNth(Node head, int index) {
        // Code here
         if(head==null){
            return -1;
        }
        Node temp= head;
        for(int i =1; i<index; i++){
            if(temp==null) return -1;
            temp=temp.next;
        }
        if(temp==null)
            return -1;
            
        return temp.data;
   
    }
}