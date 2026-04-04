class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
                if (s1.length() != s2.length()) return false;
        
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        
        for (char ch : s1.toCharArray()) {
            count1[ch - 'a']++;
        }
        
        for (char ch : s2.toCharArray()) {
            count2[ch - 'a']++;
        }
        
        int changesRequired = 0;
        for (int i = 0; i < 26; i++) {
            if (count1[i] > count2[i]) {
                changesRequired += count1[i] - count2[i];
            }
        }
        
        return changesRequired <= k;

    }
}