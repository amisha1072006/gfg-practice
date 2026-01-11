/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    public static Node findUnion(Node head1, Node head2) {
        // Add your code here.
           Node head=new Node(0);
        Node curr=head;
        Map<Integer,Integer> list=new TreeMap<>();
        while(head1!=null){
            if(!list.containsKey(head1.data)){
            list.put(head1.data,head1.data);
            }
            head1=head1.next;
        }
         while(head2!=null){
              if(!list.containsKey(head2.data)){
            list.put(head2.data,head2.data);
              }
            head2=head2.next;
        }
       for(int num:list.keySet()){
           Node temp=new Node(list.get(num));
           curr.next=temp;
           curr=curr.next;
           
       }
       return head.next;

    }
}