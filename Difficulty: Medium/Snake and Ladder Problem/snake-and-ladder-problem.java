// User function Template for Java
class Pair{
    int first;
    int second;
    
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    static int minThrow(int N, int arr[]) {
        // code here
         int[] A = new int[31];
        for(int i=1;i<31;i++)
            A[i] = i;
            
        for(int i=0;i<2*N;i+=2)
            A[arr[i]] = arr[i+1];
            
        boolean[] vis = new boolean[31];
            
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(1, 0));
        vis[1] = true;
        
        while(!q.isEmpty()){
            int cm = q.peek().first;
            int steps = q.peek().second;
            q.remove();
            
            for(int i=1;i<=6;i++){
                int nm = cm + i;
                if(nm<31 && !vis[A[nm]]){
                    vis[A[nm]] = true;
                    q.add(new Pair(A[nm], steps+1));
                    
                    if(A[nm]==30)
                        return steps+1;
                }
            }
        }
        return -1;
    }
}