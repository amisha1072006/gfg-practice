class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
         int n = arr.length;
        int[] res = new int[n];  
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = n - 1; i >= 0; i--) {
            
            while(!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            } 
            
            if(st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            
            st.push(arr[i]);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int a : res) {
            list.add(a);
        }
        
        return list;

    }
}