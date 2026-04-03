// User function Template for Java

class Solution {
        long mod = 1000000007;
    long fun(int[][]graph, int u, int v, int k, long [][]dp){
        if(k==0){
            if(u==v)
                return 1;
            return 0;
        }
        
        if(dp[u][k]!=0){
            return dp[u][k] % mod;
        }
        
        long cou=0;
        
        for(int i=0; i<graph.length; i++){
            if(graph[u][i]==1)
                cou += fun(graph, i, v, k-1, dp) % mod;
        }
        
        cou = cou%mod;
        if(cou<0){
            cou += mod;
        }
        
        dp[u][k] = cou ;
        
        return cou;
    }

    public int MinimumWalk(int[][] graph, int u, int v, int k) {
        // Code here
        long[][] dp = new long[graph.length][k+1];
        
        return (int)fun(graph, u, v, k, dp);
    }
}