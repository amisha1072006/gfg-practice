/*Complete the function below*/

class Solution {
    // Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X) {
        // code here
                boolean[] visited = new boolean[V];
        int[] levels = new int[V];
        dfs(adj, visited, 0, levels, 0);
        if(visited[X] == true){
            return levels[X];
        }
        return -1;
    }
    void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int node, int[] levels, int level){
        if(visited[node] == true){
            return;
        }
        visited[node] = true;
        levels[node] = level;
        for(int next : adj.get(node)){
            if(!visited[next]){
                dfs(adj, visited, next, levels, level + 1);
            }
        }

    }
}