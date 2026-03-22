class Solution {

    public int minCoins(int coins[], int sum) {
        // code here
                int[] dp=new int[sum+1];
        Arrays.fill(dp,sum+1);
        dp[0]=0;
        for(int coin:coins){
            for(int j=coin;j<=sum;j++){
                dp[j]=Math.min(1+dp[j-coin],dp[j]);
            }
        }
        return dp[sum]==sum+1?-1:dp[sum];

    }
}