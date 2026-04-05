// User function Template for Java

class Solution {
    public static Long findMaxScore(Node root) {
        // code here
                long[]ans={0};
        solve(root,1l,ans);
        return ans[0];
    }
    public static void solve(Node root,long sum,long []ans)
    {
        if(root==null)
        {
            return;
        }
        sum*=root.data;
        if(root.left==null&&root.right==null)
        {
            ans[0]=Math.max(ans[0],sum);
        }
        solve(root.left,sum,ans);
        solve(root.right,sum,ans);
    }
}