/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */

class Solution {
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root) {
        // Your code here
        if(root==null) return null;
        
        // calling preorder traversal or
        // any you want and sort them
        ArrayList<Integer> st=new ArrayList<>();
        pre(root,st);
       Collections.sort(st);
       
    //   calling bst maker and returning 
    return bst(st,0,st.size()-1);
       }
       
    //   funtion that traverse preorder
    public static void pre(Node root,ArrayList<Integer> st){
        // base case of pre
        if(root==null) return;
        
        st.add(root.data);
        pre(root.left,st);
        pre(root.right,st);
    }
    public static Node bst(ArrayList<Integer>st,int i,int j){
        // base case of bst
        if(i>j) return null;
        
        // calculating mid
        int mid=i+(j-i)/2;
        
        // creating root node
        Node root=new Node(st.get(mid));
        
        // addind left and right node to root and returning
        root.left=bst(st,i,mid-1);
        root.right=bst(st,mid+1,j);
        return root;
    
    }
}