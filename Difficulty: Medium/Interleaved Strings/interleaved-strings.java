class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        // code here
                int n = s1.length(); int m = s2.length(); int comb = s3.length();
        if(comb != n + m) return false;
        
        Map<Character,Integer> freq = new HashMap<>();
        Map<Character,Integer> freq2 = new HashMap<>();
      
        for(int i = 0; i < n; i++) freq.put(s1.charAt(i),freq.getOrDefault(s1.charAt(i),0)+1);
        for(int i = 0; i < m; i++) freq.put(s2.charAt(i),freq.getOrDefault(s2.charAt(i),0)+1);
        for(int i = 0; i < comb; i++) freq2.put(s3.charAt(i),freq2.getOrDefault(s3.charAt(i),0)+1);
        
        if(freq.size() != freq2.size()) return false;
        if(freq.size() == 1) return true;
        
        for(char ch : freq.keySet()) if(!freq2.containsKey(ch) || !freq2.get(ch).equals(freq.get(ch))) return false;
        
        return check(s1,s2,s3,0,0,0,n,m,comb);
    }
    private boolean check(String s1, String s2, String s3, int idx1, int idx2, int idx3, int n, int m, int comb){
        if(idx1 == n && idx2 == m && idx3 == comb) return true;
        
        boolean res = false, res2 = false;
        
        if(idx1 < n && idx3 < comb && s1.charAt(idx1) == s3.charAt(idx3)){
            res = check(s1,s2,s3,idx1+1,idx2,idx3+1,n,m,comb);
        }
        
        if(!res && idx2 < m && idx3 < comb && s2.charAt(idx2) == s3.charAt(idx3)){
            res2 = check(s1,s2,s3,idx1,idx2+1,idx3+1,n,m,comb);
        }
        
        return res || res2;
    }
}