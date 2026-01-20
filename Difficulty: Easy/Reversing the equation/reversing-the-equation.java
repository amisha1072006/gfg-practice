// User function Template for Java
class Solution {

    String reverseEqn(String S) {
        // your code here
                Stack <String> str = new Stack<>();
        StringBuilder n= new StringBuilder();
        
        for(int i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(Character.isDigit(ch))
            {
                n.append(ch);
            }
            else
            {
                str.push(n.toString());
                n.setLength(0);
                str.push(Character.toString(ch));
            }
        }
        if(n.length() > 0)
        {
            str.push(n.toString());
        }
        
        StringBuilder res = new StringBuilder();
        while(!str.isEmpty())
        {
            res.append(str.pop());
        }
        return res.toString();

    }
}