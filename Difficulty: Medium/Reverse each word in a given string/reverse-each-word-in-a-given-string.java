class Solution {
    public String reverseWords(String s) {
        // Code here
          String[] sarr=s.split("\\s+");
        StringBuilder str=new StringBuilder();
        for(String eachs:sarr)
        {
            int i;
        for( i=eachs.length()-1;i>=0;i--)
        {
           str.append(eachs.charAt(i));
        }
        if(i!=eachs.length()-1)
                   str.append(" ");

        }
        return str.toString().trim();

    }
}
