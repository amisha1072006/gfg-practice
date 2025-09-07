class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
    for(int i=0;i<txt.length();i++){
             for(int j=0;j<pat.length();j++){
                 if(txt.contains(pat)){
                     return txt.indexOf(pat);
                 }
             }
         }
         return  -1;
    }
}