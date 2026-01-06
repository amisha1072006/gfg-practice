/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBST(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();

        inOrder(root,arr);

        for(int i=1;i<arr.size();i++){

            if(arr.get(i-1)>arr.get(i)) return false;

        }

        return true;

    }

     void inOrder(Node root,ArrayList<Integer> arr){

         if(root==null) return;

         

         inOrder(root.left,arr);

         arr.add(root.data);

         inOrder(root.right,arr);

  
    }
}