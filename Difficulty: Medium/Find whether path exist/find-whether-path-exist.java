
class Solution {
    // Function to find whether a path exists from the source to destination.
       Queue<int[]>q;
    int x[]={-1,0,1,0};
    int y[]={0,1,0,-1};
    int r,c;
    public boolean is_Possible(int[][] grid) {
        // Code here
       q=new LinkedList<>();
        r=grid.length;
        c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    if(bfs(i,j,grid)) return true;
                }
            }
        }
    return false;
        
        
    }
    public boolean bfs(int si,int sj,int grid[][]){
        q.add(new int[]{si,sj});
        while(!q.isEmpty()){
            int cur[]=q.remove();
            int ci=cur[0];
            int cj=cur[1];
            if(grid[ci][cj]==2){
                return true;
            }
        grid[si][sj]=0;
            for(int i=0;i<4;i++){
                int ni=ci+x[i];
                int nj=cj+y[i];
                if(ni>=0 && nj>=0 && ni<r && nj<c && grid[ni][nj]!=0){ 
                    q.add(new int[]{ni,nj});
                }
            }
            
        }
        return false;  
    }
}