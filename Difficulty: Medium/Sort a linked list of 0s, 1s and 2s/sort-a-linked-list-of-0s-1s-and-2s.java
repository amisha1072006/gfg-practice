/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
          int zeroes = 0;
        int ones = 0;
        int twos = 0;
        
        Node temp = head;

        while(temp != null){
            if(temp.data == 0) zeroes++;
            else if(temp.data == 1) ones++;
            else twos++;
            
            temp = temp .next;
        }
        
        temp = head;
        for(int i=1; i<=zeroes; i++){
            temp.data = 0;
            temp = temp.next;
            
        }
        
        for(int i=1; i<=ones; i++){
            temp.data = 1;
            temp = temp.next;
            
        }
        
        for(int i=1; i<=twos; i++){
            temp.data = 2;
            temp = temp.next;
            
        }
        return head;
    
    }
}