class Solution {
    public boolean findTriplets(int[] arr) {
        // code here.
         int n = arr.length;
        Arrays.sort(arr);
        
        for(int i = 0; i < n; i++){
            int l = i + 1;
            int r = n - 1;
            while(l < r){
                int sum = arr[i] + arr[l] + arr[r];
                
                if(sum == 0){
                    return true;
                }
                else if(sum > 0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return false;
    }
}