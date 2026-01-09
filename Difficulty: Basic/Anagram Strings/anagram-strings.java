// User function template for Java
class Solution {
    static int areAnagram(String S1, String S2) {
        // code here
                int fre1[]= new int[128];
        int fre2[]= new int[128];
        for(char c:S1.toCharArray()){
            fre1[c]++;
        }
        for(char c:S2.toCharArray()){
            fre2[c]++;
        }
        for(int i=0;i<128;i++){
            if(fre1[i]!=fre2[i]){
                return 0;
            }
        }
        return 1;

    }
}