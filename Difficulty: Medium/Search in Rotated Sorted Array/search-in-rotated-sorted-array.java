class Solution {
    int search(int[] arr, int key) {
        // code here
                int l=0,h=arr.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]== key){
                return m;
            }
            //case1
            if(arr[m]>=arr[l]){
                if(key>=arr[l]&&key<=arr[m]){
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            }
            // case2 
            if(arr[m]<=arr[h]){
                if(key>=arr[m]&&key<=arr[h]){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }
        }
            return -1;
    }
}