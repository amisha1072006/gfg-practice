// User function Template for Java

class Solution {
    static int countMin(String str) {
        // code here
                int n= str.length();
        StringBuilder sb = new StringBuilder(str);
        String str2 = sb.reverse().toString();
        int dp[][]= new int[n+1][n+1];
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(str.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        int palidromelen = dp[n][n];
        return n-palidromelen;
    }
}