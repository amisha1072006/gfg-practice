// User function Template for Java

class Solution {
    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int graph[][]) {
        // code here
                ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i=0;i<N;i++){
            ArrayList<Integer> list =new ArrayList<>(Collections.nCopies(N,0));
            
            dfs(graph,list,i,N);
            ans.add(list);
        }
        return ans;
    }
    static void dfs(int[][] graph,ArrayList<Integer> list , int src ,int N){
        // mark
        list.set(src,1);
        // visit unvisited nbr
        for(int nbr=0;nbr<N;nbr++){
            if(graph[src][nbr]==1 && list.get(nbr)==0) dfs(graph, list, nbr,N);
        }

    }
}