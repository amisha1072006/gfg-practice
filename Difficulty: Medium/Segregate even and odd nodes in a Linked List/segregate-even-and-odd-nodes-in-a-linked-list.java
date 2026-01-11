// User function Template for Java

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
    Node divide(Node head) {
        // code here
            if (head == null || head.next == null)
        return head;

    Node evenHead = null, evenTail = null;
    Node oddHead = null, oddTail = null;

    Node temp = head;

    while (temp != null) {
        if (temp.data % 2 == 0) {
            if (evenHead == null) {
                evenHead = evenTail = temp;
            } else {
                evenTail.next = temp;
                evenTail = evenTail.next;
            }
        } else {
            if (oddHead == null) {
                oddHead = oddTail = temp;
            } else {
                oddTail.next = temp;
                oddTail = oddTail.next;
            }
        }
        temp = temp.next;
    }

    if (evenTail != null)
        evenTail.next = oddHead;

    if (oddTail != null)
        oddTail.next = null;

    return (evenHead != null) ? evenHead : oddHead;

    }
}