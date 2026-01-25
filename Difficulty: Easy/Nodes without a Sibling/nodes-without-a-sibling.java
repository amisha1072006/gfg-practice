/*  A Binary Tree nodea
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Tree {
    ArrayList<Integer> noSibling(Node node) {
        // code here
                ArrayList<Integer> res = new ArrayList<>();
        solve(node, res);
        if(res.size() == 0) res.add(-1);
        Collections.sort(res);
        return res;
    }
    public void solve(Node node, ArrayList<Integer> res)
    {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        
        
        while(queue.size() > 0)
        {
            Node curr = queue.poll();
            if(curr.left != null && curr.right == null)
            {
                res.add(curr.left.data);
            }
            if(curr.right != null && curr.left == null)
            {
                res.add(curr.right.data);
            }
            
            if(curr.left != null) queue.add(curr.left);
            if(curr.right != null) queue.add(curr.right);
        }
  
    }
}