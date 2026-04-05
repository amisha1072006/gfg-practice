// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    int sum =0;
    // modify the BST and return its root
    public Node modify(Node root) {
        // Write your code here
                if(root == null)
        return root;
        
       modify(root.right);
        sum += root.data;
       root.data = sum;
       modify(root.left);
        return root;

    }
}