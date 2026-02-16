/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
                ArrayList<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }
    
    private void traverse(Node root, ArrayList<Integer> result) {
        if (root == null) return;
        
        traverse(root.left, result);   // Left
        result.add(root.data);         // Root
        traverse(root.right, result);  // Right

    }
}