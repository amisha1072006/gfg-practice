// User function Template for Java

/*
class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    // Function that constructs BST from its preorder traversal.
    public Node Bst(int pre[], int size) {
        // code here
                Stack<Node> s = new Stack<>();
        Node root = new Node(pre[0]);
        s.push(root);
        for(int i=1;i<size;i++){
            Node x = new Node(pre[i]);
            if(s.isEmpty()){
                s.push(x);
                continue;
            }
            Node cur = s.peek();
            if(pre[i]<cur.data){
                cur.left=x;
            }else{
                while(!s.isEmpty() && s.peek().data<pre[i]){
                    cur=s.pop();
                }
                
                cur.right=x;
                s.push(x);
            }
            s.push(x);
        }
        return root;

    }
}