// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    public static int SaveGotham(int arr[]) {
        // Complete the function
                int n = arr.length;
        Stack<Integer>st= new Stack<>();
        long totalSum = 0;
        long mod = 1000000007;
        for(int i = n-1;i>=0;i--){
            while (!st.isEmpty() && st.peek() <= arr[i]){
            st.pop();
        }
        if(!st.isEmpty()){
            totalSum = (totalSum + st.peek()) %mod;
        }
        st.push(arr[i]);
    }
    return (int) totalSum;

    }
}
