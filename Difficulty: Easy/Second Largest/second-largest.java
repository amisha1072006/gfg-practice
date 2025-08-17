class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for(int val:arr){
            if(val>highest){
                second = highest;
                highest = val;
            }
            else if(val>second && val<highest){
                second = val;
            }
        }
        if(second == Integer.MIN_VALUE)return -1;
        return second;
    }
}