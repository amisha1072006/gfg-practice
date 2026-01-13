/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
         Node temp=head;
        if(x==1){
            head=head.next;
            return head;
        }
        Node prev=null;
        for(int i=0;i<x-2 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            return head;
        }
        else{
            temp.next=temp.next.next;
        }
        
        
        return head;
    
    }
}