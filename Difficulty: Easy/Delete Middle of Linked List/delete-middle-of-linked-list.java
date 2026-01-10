/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
           // If list is empty or has one node
        if (head == null || head.next == null) {
            return null;
        }

        // Step 1: count nodes
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Step 2: find middle index
        int mid = count / 2;

        Node curr = head;   // will point to middle node
        Node prev = null;   // node before middle

        int i = 0;
        while (i < mid) {
            prev = curr;
            curr = curr.next;
            i++;
        }

        // Step 3: delete middle node
        prev.next = curr.next;
        curr.next = null;

        return head;
    }
}