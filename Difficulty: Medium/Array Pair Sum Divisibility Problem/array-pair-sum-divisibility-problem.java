class Solution {
    public boolean canPair(List<Integer> arr, int k) {
        // code here.
         if(arr.size()%2 != 0) return false;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num: arr) {
            int rem = ((num % k) + k) % k;  // normalize negative numbers

            int complement = (k - rem) % k;
            
            if (map.containsKey(complement)) {
                map.put(complement, map.get(complement) - 1);
                if (map.get(complement) == 0) {
                    map.remove(complement);
                }
            } else {
                map.put(rem, map.getOrDefault(rem, 0) + 1);
            }
        }
        
        return map.isEmpty();
    
    }
}
