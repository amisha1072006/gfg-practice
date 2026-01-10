// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
private Node top; 

    public myStack() {
        // Initialize your data members
        this.top=null;
    }

    public boolean isEmpty() {
        // check if the stack is empty
               return top==null;

    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
                Node newNode=new Node(x);
        newNode.next=top;
        top=newNode;

    }

    public void pop() {
        // Removes the front element of the stack.
                if(isEmpty())return;
        int poppedData=top.data;
        top=top.next;
    
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
                if(isEmpty())return -1;
        return top.data;
    
    }

    public int size() {
        // Returns the current size of the stack.
                int count=0;
        Node temp=top;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;

    }
}
