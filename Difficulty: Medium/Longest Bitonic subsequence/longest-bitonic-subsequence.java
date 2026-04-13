class Solution {
    public static int longestBitonicSequence(int n, int[] nums) {
        // code here
         int[] dp1=new int[n];
        int[] dp2=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            dp1[i]=1;
            for(int prev=0;prev<i;prev++)
                if(nums[i]>nums[prev])dp1[i]=Math.max(1+dp1[prev],dp1[i]);
        }
        for(int i=n-1;i>=0;i--){
            dp2[i]=1;
            for(int prev=n-1;prev>=i;prev--)
                if(nums[i]>nums[prev])dp2[i]=Math.max(dp2[i], 1+dp2[prev]);
        }
        for(int i=0;i<n;i++) if (dp1[i] > 1 && dp2[i] > 1)max=Math.max(max,dp1[i]+dp2[i]-1);
        return max;
    }
}
