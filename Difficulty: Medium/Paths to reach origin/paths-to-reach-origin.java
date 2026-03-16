// User function Template for Java

class Solution {
    public static int ways(int n, int m) {
        // complete the function
                if(n == 0 || m == 0) return 1;
        int[] prev = new int[m+1];
        for(int i =n; i >= 0; i--){
            int [] curr = new int[m+ 1];
            for(int j = m; j >= 0; j--){
                if(i == n && j == m) curr[j] = 1;
                else{
                    int right = 0, left = 0;
                    if(i < n) right = prev[j];
                    if(j < m) left = curr[j+1];
                    curr[j] = (left + right) % 1000000007;
                }
            }
            prev = curr;
        }
    return prev[0] % 1000000007;
    }
}