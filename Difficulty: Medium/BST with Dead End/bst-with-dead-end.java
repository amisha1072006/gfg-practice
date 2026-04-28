/*
class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
}*/

class Solution {
    public boolean isDeadEnd(Node root) {
        // Code here.
                return helper(root, 0, 100000);
    }
    
    public boolean helper(Node root, int minLimit, int maxLimit){
        if(root == null) return false;
        
        if(root.left == null && root.right == null && root.data - minLimit <= 1 && maxLimit - root.data <= 1){
            return true;
        }
        
        int newMin = minLimit, newMax = maxLimit;
        if(root.data < minLimit) newMin = root.data;
        if(root.data > maxLimit) newMax = root.data;
        
        return helper(root.left, newMin, root.data) || helper(root.right, root.data, newMax);
    }
}