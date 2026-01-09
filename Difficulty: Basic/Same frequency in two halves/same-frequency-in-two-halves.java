// User function Template for Java

class Solution {
    boolean passed(String s) {
        // your code here
            int n = s.length()/ 2 ;
         String s2 = "";
        String s1 = s.substring(0, n);
        
        if(s.length() %2 ==0)
        
         s2 = s.substring( n,s.length());
         
        else
        
        s2 = s.substring( n + 1,s.length());
        
        char a [] = s1.toCharArray();
        char b [] = s2.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
          for(int i = 0;i < n;i++)
          {
              if(a[i] != b[i])
               return false;
          }
         return true;
   
    }
}