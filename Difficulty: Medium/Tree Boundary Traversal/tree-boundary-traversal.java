/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {

        // code here
            ArrayList<Integer> list = new ArrayList<>();
    void left(Node root)
    {
        // System.out.println(root.data);
        if(root.left == null && root.right == null)
        {
            return;
        }
        if(root.left == null)
        {
            list.add(root.data);
            left(root.right);
        }
        if(root.left != null)
        {
            list.add(root.data);
            left(root.left);
        }
    }
    void leaf(Node root)
    {
        if(root != null && root.left == null && root.right == null)
        {
            list.add(root.data);
        }
        if(root == null)
        {
            return;
        }
        leaf(root.left);
        leaf(root.right);
    }
    void right(ArrayList<Integer> lis, Node root)
    {
        // System.out.println(root.data);
        if(root.left == null && root.right == null)
        {
            return;
        }
        if(root.right == null)
        {
            // System.out.println(root.data);
            lis.add(0, root.data);
            right(lis, root.left);
        }
        if(root.right != null)
        {
            // System.out.println(root.data);
            lis.add(0, root.data);
            right(lis, root.right);
        }
    }
        ArrayList<Integer> boundaryTraversal(Node root) {
          ArrayList<Integer> leaflist = new ArrayList<>();
        ArrayList<Integer> rightnode = new ArrayList<>();
        if(root.left == null && root.right == null)
        {
            list.add(root.data);
            return list;
        }
        list.add(root.data);
        if(root.left != null)
        {
            left(root.left);
        }
        leaf(root);
        if(root.right != null)
        {
            right(rightnode, root.right);
        }
        list.addAll(rightnode);
        return list;
      
    }
}