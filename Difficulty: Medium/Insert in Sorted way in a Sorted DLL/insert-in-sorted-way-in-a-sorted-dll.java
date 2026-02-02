/*class of the node of the DLL is as
/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node newnode=new Node(x);
        if(head==null) return head=newnode;
        if(head.data>newnode.data)
        {
            newnode.next=head;
            head.prev=newnode;
            return head=newnode;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.data<=newnode.data&&newnode.data<temp.next.data)
            {
                newnode.next=temp.next;
                temp.next.prev=newnode;
                newnode.prev=temp;
                temp.next=newnode;
                return head;
            }
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        return head;
   
    }
}