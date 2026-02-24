class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
          int n = arr.length;
        int l[] = new int[n], r[] = new int[n];
        
        Stack<Integer> s = new Stack<>();
        Stack<Integer> ss = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }
            l[i] = (s.isEmpty()) ? 0 : s.peek();
            s.push(arr[i]);
            
            while(!ss.isEmpty() && ss.peek()>=arr[n-1-i]){
                ss.pop();
            }
            r[n-1-i] = (ss.isEmpty()) ? 0 : ss.peek();
            ss.push(arr[n-i-1]);
        }
        
        int max=0;
        for(int i=0;i<n;i++){
            max = Math.max(max, Math.abs(l[i]-r[i]));
        }
        return max;

    }
}