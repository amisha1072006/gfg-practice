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
    public ArrayList<Integer> topView(Node root) {
        // code here
        TreeMap<Integer,Integer[] > map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        helper(root,map,0,0);
        
        for(Integer[] val: map.values()){
            ans.add(val[1]);
        }
        
        return ans;
        
    }
    
    public static void helper(Node root,TreeMap<Integer,Integer[]> map, int col,int row){
        if(root==null){return;}
        
        map.putIfAbsent(col,new Integer[]{row,root.data});
        if(map.get(col)[0]>row){
            map.remove(col);
            map.put(col,new Integer[]{row,root.data});
        }
        
        helper(root.left,map,col-1,row+1);
        helper(root.right,map,col+1,row+1);
    }
}