/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        leftViewDFS(root, 0, ans);
        return ans;
    }

    private void leftViewDFS(Node node, int level, ArrayList<Integer> ans) {
        if (node == null) return;

        // If this is the first node of this level
        if (level == ans.size()) {
            ans.add(node.data);
        }

        // Go left first, then right
        leftViewDFS(node.left, level + 1, ans);
        leftViewDFS(node.right, level + 1, ans);
    
    }
}