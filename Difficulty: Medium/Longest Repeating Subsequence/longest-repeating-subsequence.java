class Solution {
    public int LongestRepeatingSubsequence(String s) {
        // code here
                int n=s.length();
        int m=s.length();
        int [][]dp =new int[n+1][m+1];
        for(int []x1:dp)
        {
            Arrays.fill(x1,-1);
        }
        dp[n][m]=LCS(s,s,n,m,dp);
        return dp[n][m];
        
    }
    public int LCS(String x,String y,int n,int m,int [][]dp)
    {
        if(n==0||m==0)
        {
          return 0;    
        }
        if(dp[n][m]!=-1)
        {
          return dp[n][m];    
        }
        if(x.charAt(n-1)==y.charAt(m-1)&&((n-1)!=(m-1)))
        {
            dp[n][m]=1+LCS(x,y,n-1,m-1,dp);
            return dp[n][m];
        }
        dp[n][m]=Math.max(LCS(x,y,n-1,m,dp),LCS(x,y,n,m-1,dp));
        return dp[n][m];

    }
}