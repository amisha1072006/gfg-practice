class twoStacks {
         int[] arr;   
    // Default size for the array (you can adjust this as needed)
    private static final int DEFAULT_SIZE = 100;
    int top1, top2, size;

    twoStacks() {
        size = DEFAULT_SIZE;
        arr = new int[size];
        top1 = -1; 
        top2 = size;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
          if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
                // Check if there is space for second stack
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        // code here
                if (top1 >= 0) {
            int poppedValue = arr[top1];
            top1--;
            return poppedValue;
        } else {
            return -1; // If stack is empty
        }
    }
    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
         if (top2 < size) {
            int poppedValue = arr[top2];
            top2++;
            return poppedValue;
        } else {
            return -1; // If stack is empty
        }
    }
}