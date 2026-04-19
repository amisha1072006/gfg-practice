class Solution {
     boolean works(int pg, int [] arr, int k){
        int curr = arr[0];
        int st = 1;
        int n = arr.length;
        
        for(int i=1;i<n;i++){
            if(curr + arr[i] > pg){
                st++;
                curr = arr[i];
            } else{
                curr += arr[i];
            }
            
            if(st>k){
                return false;
            }
        }
        
        return true;
    }
    public int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(k>n)return -1;
        
        int sum=0,maxi=0;
        for(int a: arr){
            sum+=a;
            maxi=Math.max(maxi,a);
        }
        
        int s = maxi, h = sum;
        int ans = Integer.MAX_VALUE;
        while(s<=h){
            int mid = s + (h-s)/2;
            
            if(works(mid,arr,k)){
                ans=mid;
                h=mid-1;
            } else{
                s=mid+1;
            }
        }
        
        return ans;
    }
}