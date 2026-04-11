class Solution {
    int closer(int[] arr, int x) {
        // code here
                int n = arr.length;
        int i=0,j=n-1;
        while(i<=j){
            int md = i+(j-i)/2;
            if(arr[md]==x)return md;
            if(md>=1 && arr[md-1]==x)return md-1;
            if(md<n-1 && arr[md+1]==x)return md+1;
            if(arr[md]>x)j=md-1;
            else i=md+1;
        }
        return -1;
    }
}