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

}*/
// you have to complete this function
class GfG {
    public static Node quickSort(Node node) {
        // Your code here
                Node tail = getTail(node);
        sort(node,tail);
        return node;
    }

static Node getTail(Node head) {
        Node curr = head;
        while(curr != null && curr.next != null)
            curr = curr.next;
        return curr;
    }
    static void sort(Node head,Node tail) {
        if(head == null || head == tail) return;
        Node pivot = partion(head,tail);
        sort(head,pivot);
        sort(pivot.next,tail);
    }
    static void swap(Node node1,Node node2) {
        int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }
    static Node partion(Node head,Node tail) {
        Node pivot = head;
        Node pre = head;
        Node curr = head;
        
        while(curr != tail.next) {
            if(curr.data < pivot.data) {
                swap(curr,pre.next);
                pre = pre.next;
            }
            curr = curr.next;
        }
        
        swap(pre,pivot);
        return pre;

    }
}