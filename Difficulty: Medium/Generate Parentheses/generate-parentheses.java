class Solution {
    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        
        String temp = "";
        
        recur(n/2,0,temp,ans);
        
        return ans;
    }
    
    public void recur(int n,int open,String temp, ArrayList<String> ans){
        
        if(temp.length()==2*n){
            ans.add(temp);
            return;
        }
        

        if(open<n)
            recur(n,open+1,temp+"(",ans);
        
        int close = temp.length()-open;
        
        if(close<open)
            recur(n,open,temp+")",ans);
    }
}