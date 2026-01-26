// User function Template for Java

class Solution {

    public boolean countSub(long arr[], long n) {
        // Your code goes here
        for(int i=0;i<n/2;i++){
            int lc=2*i+1;
            int rc=2*i+2;
            if(lc<n && arr[i]<arr[lc])
                return false;
            if(rc<n && arr[i] <arr[rc]){
                return false;
            }
        }
        return true;
        
        
    }
}