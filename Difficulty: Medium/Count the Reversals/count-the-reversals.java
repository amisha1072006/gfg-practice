class Solution {
    public int countMinReversals(String s) {
        // code here
                if(s.length() % 2 != 0){
            return - 1;
        }
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '{'){
                st.push(c);
            }
            else{
                if(!st.isEmpty() && st.peek() == '{'){
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
        }
        int op =0;
        int cl = 0;
        while(!st.isEmpty()){
            if(st.pop() == '{') op++;
            else cl++;
        }
        return (op + 1) / 2 + (cl + 1) / 2;

    }
}