class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        // code here
                HashMap<Integer, Integer>map = new HashMap<>();
        for(Integer n: A){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        HashSet<Integer>left = new HashSet<>();
        
        ArrayList<Integer>result = new ArrayList<>();
        for(int i=0; i<N; i++){
            map.put(A[i], map.getOrDefault(A[i], 0) - 1);
            if(map.get(A[i])==0)map.remove(A[i]);
           
            result.add(left.size() - map.size());
            
            left.add(A[i]);
        }
        
        return result;

    }
}
