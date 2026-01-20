// User function Template for Java

/*
    Note: Use StringBuilder/StringBuffer class for String concatenation(if any).
    While using String class, on each concatenation a new copy of the string is created,
   so that the overall complexity is O(n^2) . Fortunately in Java we could solve this
   with a StringBuffer/StringBuffer, which has O(1) complexity for each append.
*/

class Solution {
    public static String reduced_String(int k, String s) {
        // Your code goes here
              Stack<int[]>st1 =new Stack<int[]>();
      for(int i=0;i<s.length();i++)
      {
          int val=(int)s.charAt(i);
          if(st1.isEmpty()==false&&st1.peek()[0]==val)
          {
              st1.push(new int[]{val,st1.peek()[1]+1});
          }
          else
          {
              st1.push(new int[]{val,1});
          }
          if(st1.isEmpty()==false&&st1.peek()[1]==k)
          {
             int val1=k;
             while(st1.isEmpty()==false&&val1!=0)
             {
               st1.pop();
               val1--;  
             }
          }
      }
      StringBuilder sb1 =new StringBuilder();
      while(st1.isEmpty()==false)
      {
        int []t1=st1.pop();
        char ch1=(char)(t1[0]);
        sb1.append(ch1);
      }
      return sb1.reverse().toString();
      

    }
}