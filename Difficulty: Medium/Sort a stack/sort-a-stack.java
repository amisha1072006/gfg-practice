class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
          Stack<Integer> stack = new Stack<>();
        while (!st.isEmpty()) {
            int x = st.pop();
            while (!stack.isEmpty() && stack.peek() < x) {
                st.push(stack.pop());
            }
            stack.push(x);
        }
        while (!stack.isEmpty()) {
            st.push(stack.pop());
        }
    
    }
}