// User function Template for Java
class Solution {
    public int maximumPath(int[][] mat) {
        // code here
        int m =mat.length;
        int n = mat[0].length;
        int dp[][] = new int [m][n];
        for(int j=0;j<n;j++){
            dp[0][j]= mat[0][j];
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int leftdiagonal = (j>0) ? dp[i-1][j-1] : 0;
                int up = dp[i-1][j];
                int rightdiagonal =(j+1 <n) ? dp[i-1][j+1] : 0;
                dp[i][j]=mat[i][j]+Math.max(leftdiagonal,Math.max(rightdiagonal,up));
            }
        }
        int max =-1;
        for(int j=0;j<n;j++){
            max = Math.max(max,dp[m-1][j]);
        }
        return max;

    }
}