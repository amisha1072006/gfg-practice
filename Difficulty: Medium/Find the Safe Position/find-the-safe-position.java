class Solution {
    static int safePos(int n, int k) {
        // code here
                k--;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 1; i<= n; i++){
            l.add(i);
        }
        int curr = 0;
        solve(curr, k, l);
        return l.get(0);
    }
    
    static void solve(int curr, int k, ArrayList<Integer> l){
        if(l.size() == 1){
            return;
        }
        curr = (curr + k) % l.size();
        l.remove(curr);
        solve(curr, k, l);
    }
};
    