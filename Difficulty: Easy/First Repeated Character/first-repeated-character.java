// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        // code here
                HashSet<Character> set= new HashSet<> ();
        for( char c: s.toCharArray())
        {
            if(!set.add(c))
            {
                return c+"";
            }
        }
        return "-1";

    }
}