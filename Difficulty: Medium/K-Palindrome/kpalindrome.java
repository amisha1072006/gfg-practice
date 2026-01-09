class Solution {
    public int kPalindrome(String str, int n, int k) {
        // code here
                int[][] dp = new int[n][n];

        int mn = func(str,0,str.length()-1,dp);

        return mn<=k?1:0;

    }

     public int func(String s,int l,int r,int[][] dp){

        if(l>=r)

           return 0;

        if(dp[l][r]>0)

           return dp[l][r];

        int v1=0;

        if(s.charAt(l)==s.charAt(r))

            v1=func(s,l+1,r-1,dp);

        else

            v1=1+Math.min(func(s,l+1,r,dp),func(s,l,r-1,dp));

        return dp[l][r] = v1;

   
    }
}