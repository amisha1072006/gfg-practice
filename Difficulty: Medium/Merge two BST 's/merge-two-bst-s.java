/*
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> merge(Node root1, Node root2) {
        // code here
                ArrayList<Integer> sortedList = new ArrayList<>();
        inOrderTraversal(root1, sortedList);
        inOrderTraversal(root2, sortedList);
        sortedList.sort(Integer::compareTo);
        return sortedList;
    }
    
    private void inOrderTraversal(Node root, List<Integer> sortedList) {
        if (root == null) return;
        inOrderTraversal(root.left, sortedList);
        sortedList.add(root.data);
        inOrderTraversal(root.right, sortedList);
    
    }
}