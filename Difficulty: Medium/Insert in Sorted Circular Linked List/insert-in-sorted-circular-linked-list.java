/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
         Node trav=head;
        Node prev=null;
        
        Node ref=head;
        do{
            ref=ref.next;
        }while(ref.next!=head);
        
        
        if(data<=trav.data){
            Node newnode=new Node(data);
            newnode.next=head;
            head=newnode;
            ref.next=head;
            return head;
        }else{
            prev=trav;
            trav=trav.next;
        }
        do{
            if(data>=prev.data && data<=trav.data){
                Node newnode=new Node(data);
                prev.next=newnode;
                newnode.next=trav;
                return head;
            }
            else{
                prev=trav;
                trav=trav.next;
            }
        }while(trav.next!=head);
        
        if(data>=prev.data && data<=trav.data){
                Node newnode=new Node(data);
                prev.next=newnode;
                newnode.next=trav;
                return head;
            }
         Node newnode=new Node(data);
        trav.next=newnode;
        newnode.next=head;
        return head;
        
        
    }
}