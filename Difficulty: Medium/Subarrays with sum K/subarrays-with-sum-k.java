class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
                Map<Integer, Integer> prefixSum=new HashMap<>();
        int count=0, sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
            if(sum==k){
                count++;
            }
            if (prefixSum.containsKey(sum-k))
             count += prefixSum.get(sum-k);
             
             prefixSum.put(sum, prefixSum.getOrDefault(sum, 0)+ 1);
        }
        return count;
    


    }
}