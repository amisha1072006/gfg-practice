class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
                int n = a.length;
        int m = b.length;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < m; i++){
            pq.add(b[i]);
        }
        
        for(int i = 0; i < n; i++){
            if(pq.peek() < a[i]){
                pq.add(a[i]);
                a[i] = pq.poll();
            }
        }
        
        for(int i = 0 ; i < m; i++){
            b[i] = pq.poll();
        }

    }
}
