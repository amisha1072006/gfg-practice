// User function Template for Java

class Solution {
    public int[] numberWithNoConsecutiveOnes(int n) {
        // code here
                List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=1;i<(1<<n);i++){
            if(!hasConse(i,map)){
                ans.add(i);
            }
        }
        int[] resArray = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            resArray[i]=ans.get(i);
        }
        return resArray;
    }
    private boolean hasConse(int num, HashMap<Integer, Boolean> map) {
        if(map.containsKey(num)) {
            return map.get(num);
        }
        boolean ans = (num & (num>>1))!=0;
        map.put(num,ans);
        return ans;

    }
}