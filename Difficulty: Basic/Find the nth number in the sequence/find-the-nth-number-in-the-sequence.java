// User function Template for Java

class Solution {
    static long get(long n) {
        // complete the function here
                if(n ==1 || n==2){
            return 1;
        }
        if(n==3){
            return n-1;
        }
        long j=0;
        long i=0;
        
        for(i=0; i<=n; i += j){
            j++;
        }
        i = i-j;
        if(n ==i){
            return --j;
        }
        
        return n-i;
    }
}