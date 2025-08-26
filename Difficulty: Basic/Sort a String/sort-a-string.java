// User function Template for Java
class Solution {
    String sort(String s) {
        // code here
     char[] a = s.toCharArray();
     Arrays.sort(a);
     return new String(a);
     
    }
}