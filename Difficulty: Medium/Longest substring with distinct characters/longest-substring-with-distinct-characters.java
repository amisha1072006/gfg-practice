class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
                int left = 0 ; 
        int right = 0 ;
        int ans = 0 ;
        int[] count = new int[256];
        
        while(right < s.length()){
            char ch = s.charAt(right);
            count[ch]++;
            
            while(count[ch] > 1){
                char leftchar = s.charAt(left);
                count[leftchar]--;
                left ++;
                
            }
         ans =    Math.max(ans , right - left + 1);
            right++;
        }
        return ans;
        

    }
}