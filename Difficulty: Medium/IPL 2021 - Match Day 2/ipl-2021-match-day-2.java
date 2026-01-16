class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
               int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(n - 1);
        nge[n- 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nge[i] = n;
            } else {
                nge[i] = stack.peek();
            }
            stack.push(i);
        }
        int j = 0;
        // int[] ans = new int[n - k + 1];
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <= n - k; i++) {
            if (j < i) {
                j = i;
            }
            while (nge[j] < i + k) {
                j = nge[j];
            }
            // ans[i] = arr[j];
            list.add(arr[j]);
        }
        return list;
 
    }
}