class Solution {
    static String revStr(String s) {
        // code here
    int st = s.length();
    char a[] = new char[st];
    for(int i = st-1;i>=0;i--){
        a[st-1-i] = s.charAt(i);
    }
    String s1 = new String(a);
    return s1;
    }
}