/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    Node bTreeToCList(Node root) {
        // code here
        Node[] prev = new Node[1];

        Node[] head = new Node[1];

        inorder(root,prev,head);

        head[0].left=prev[0];

        prev[0].right=head[0];

        return head[0];

    }

    void inorder(Node n,Node[] prev,Node[] head){

        if(n==null) return;

        

        inorder(n.left,prev,head);

        if(head[0] == null)

            head[0] = n;

        else{

            prev[0].right=n;

            n.left=prev[0];

        }

        prev[0] = n;

        

        inorder(n.right,prev,head);
    }
}