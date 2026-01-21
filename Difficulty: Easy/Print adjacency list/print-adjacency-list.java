// User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
           List<List<Integer>> list=new ArrayList<>();
       for(int i=0;i<V;i++){
           list.add(new ArrayList<Integer>());
       }
        for(int []edge:edges){
            int u=edge[0];
            int v=edge[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        return list;
    
    }
}