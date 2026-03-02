class Solution {
    public String printString(String s, char ch, int count) {
        // code here
         int l=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch) 
            l++;
            if(l==count) return s.substring(i+1);
        }
        return "";

    }
}