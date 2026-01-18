
class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
                HashMap<Integer,Integer> hp=new HashMap<>();
        
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
        }
        
        hs.addAll(hp.values());
        
        if(hp.size()!=hs.size())
            return false;
        
        return true;
   
    }
}
