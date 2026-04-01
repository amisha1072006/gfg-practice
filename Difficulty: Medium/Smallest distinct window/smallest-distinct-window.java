// User function Template for Java

class Solution {
    public int findSubString(String str) {
        // code here
                int l=0, r=0;
        Window window = new Window(str);
        int ans = str.length();
        
        while(r<str.length()){
            while(r<str.length() && !window.isGood()){
                window.add(str.charAt(r++));
            }
            while(l<r && window.isGood()){
                window.remove(str.charAt(l++));
            }
            ans=Math.min(ans,r-l+1);
        }
        return ans;
    }
}

class Window{
    int uniqueCharCount;
    Map<Character,Integer> charCount;
    Window(String str){
        Set<Character> uniqueChar = new HashSet<>();
        for(int i=0;i<str.length();i++){
            uniqueChar.add(str.charAt(i));
        }
        this.uniqueCharCount = uniqueChar.size();
        this.charCount = new HashMap<>();
    }
    void add(char newChar){
        int oldFrequency = charCount.getOrDefault(newChar,0);
        charCount.put(newChar,oldFrequency+1);
    }
    void remove(char leftChar){
        int oldFrequency = charCount.getOrDefault(leftChar,0);
        charCount.put(leftChar, oldFrequency-1);
        if(oldFrequency == 1){
            charCount.remove(leftChar);
        }
    }
    boolean isGood(){
        return charCount.size() == uniqueCharCount;

    }
}