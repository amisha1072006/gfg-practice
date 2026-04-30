class Solution {
    public boolean has132Pattern(int[] arr) {
        // code here
                int n = arr.length;
        int s3 = Integer.MIN_VALUE; // This represents arr[k]
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < s3) return true; // Found arr[i] < arr[k]
            
            while (!st.isEmpty() && arr[i] > st.peek()) {
                s3 = st.pop(); // Update arr[k] to the largest possible value < arr[j]
            }
            st.push(arr[i]); // Current element is a potential arr[j]
        }
        return false;

    }
}