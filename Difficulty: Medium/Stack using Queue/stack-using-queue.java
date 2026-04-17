class myStack {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        // Inserts an element x at the top of the stack
                q.add(x);
        int size = q.size();
        for (int i = 1; i < size; i++) {
            q.add(q.remove());
        }

    }

    void pop() {
        // Removes an element from the top of the stack
         if (!q.isEmpty()) {
            q.remove();
        }
    }

    int top() {
        // Returns the top element of the stack
        // If stack is empty, return -1
                if (q.isEmpty()) {
            return -1;
        }
        return q.peek();

    }

    int size() {
        // Returns the current size of the stack
                return q.size();

    }
}
