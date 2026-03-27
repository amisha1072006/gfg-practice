class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
         Stack<Integer> helper1 = new Stack<>();
        Stack<Integer> helper2 = new Stack<>();
        loops(st,helper1);
        loops(helper1,helper2);
        loops(helper2,st);
    }
    public static void loops(Stack<Integer> st1 , Stack<Integer> st2){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
}
    }
}
