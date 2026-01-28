class Solution {
    public int editDistance(String s1, String s2) {
        // Code here
        int n = s1.length();
        int m = s2.length();

        // dp[i][j] represents minimum operations to convert
        // first i characters of word1 to first j characters of word2
        int[][] dp = new int[n+1][m+1];

        // Base case: if word2 is empty, delete all characters of word1
        for(int i=0; i<n+1; i++){
            dp[i][0] = i;
        }
        // Base case: if word1 is empty, insert all characters of word2
        for(int j=0; j<m+1; j++){
            dp[0][j] = j;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    // Characters match: no operation needed
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    // Characters don't match: consider all 3 operations
                    int insert = 1 + dp[i][j-1]; // Insert a character
                    int delete = 1 + dp[i-1][j]; // Delete a character
                    int replace = 1 + dp[i-1][j-1]; // Replace a character
                    dp[i][j] = Math.min(insert, Math.min(delete, replace)); // Take the minimum
                }
            }
        }
        // Result: min operations to convert word1 to word2
        return dp[n][m];
    
    }
}