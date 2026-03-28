class Solution {
    public static int minSuperSeq(String s1, String s2) {
        // code here
        int n=s1.length();
        int m=s2.length();
        int [][]dp =new int[n+1][m+1];
        for(int []x1:dp)
        {
            Arrays.fill(x1,-1);
        }
        dp[n][m]=LCS(s1,s2,n,m,dp);
        
        
        return (n+m-dp[n][m]);
    }
    public static int LCS(String x,String y,int n,int m,int [][]dp)
    {
        if(n==0||m==0)
        {
           return 0;    
        }
        if(dp[n][m]!=-1)
        {
            return dp[n][m];
        }
        if(x.charAt(n-1)==y.charAt(m-1))
        {
            dp[n][m]=1+LCS(x,y,n-1,m-1,dp);
            return dp[n][m];
        }
        
        dp[n][m]=Math.max(LCS(x,y,n-1,m,dp),LCS(x,y,n,m-1,dp));
        return dp[n][m];
    }
}