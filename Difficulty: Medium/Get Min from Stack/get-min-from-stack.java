class SpecialStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public SpecialStack() {
        // Define Stack
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        // Add an element to the top of Stack
                stack.push(x);
        if(minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        // Remove the top element from the Stack
        int poppedVal = stack.pop();
        if(poppedVal == minStack.peek()) {
            minStack.pop();
        }
    }

    public int peek() {
        // Returns top element of the Stack
                if(stack.isEmpty()) return -1;
        return stack.peek();
    }

    boolean isEmpty() {
        // Check if the stack is empty
                return stack.isEmpty();
    }
    public int getMin() {
        // Finds minimum element of Stack
        if(minStack.isEmpty()) return -1;
        return minStack.peek();
    }
}