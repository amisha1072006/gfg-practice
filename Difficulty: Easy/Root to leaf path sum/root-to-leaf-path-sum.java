/*
// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int target) {
        // Your code here
                return helper(root, 0, target);
    }
    
    boolean helper(Node root, int sum, int target) {
        if(root == null) {
            return false;
        }
        
        if(root.left==null && root.right==null) {
            sum += root.data;
            if(sum == target) return true;
            return false;
        }
        
        boolean b1 = helper(root.left, root.data + sum, target);
        boolean b2 = helper(root.right, root.data + sum, target);
        
        return b1 || b2;
   
    }
}