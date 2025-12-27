class Solution {
    static int findMax(int[] arr){
        int n = arr.length;
       int mx = Integer.MIN_VALUE;
       for(int i = 0;i<arr.length;i++){
           if(arr[i] >mx){
               mx = arr[i];
           }
       }
       return mx;
    }
    public static int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int mx = findMax(arr);
        for(int i = 0;i<n;i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
                
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
        
    }
}