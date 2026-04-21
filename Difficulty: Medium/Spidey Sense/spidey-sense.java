class Solution {
    public static int[][] findDistance(char mat[][], int m, int n) {
        // Your code goes here
                int [][] ans = new int [m][n];
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]=='W'){
                    ans[i][j]=-1;
                }
                else if(mat[i][j]=='B'){
                    ans[i][j]=0;
                }
                else{
                    ans[i][j]=-1;
                }
            }
        }
        Queue<Pair> q = new ArrayDeque<>();
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(mat[i][j]=='B'){
                    q.add(new Pair(i,j));
                }
            }
        }
        int [] row = {1,0,-1,0};
        int [] col= {0,1,0,-1};
        while(q.size()>0){
            Pair p = q.remove();
            for(int i =0;i<4;i++){
                int i_part = row[i]+p.x;
                int j_part = col[i]+p.y;
                if(i_part>=0 && j_part>=0 && i_part<m && j_part<n && mat[i_part][j_part]=='O'){
                    if(ans[i_part][j_part]==-1){
                        //add in a queue
                        q.add(new Pair(i_part,j_part));
                        //change the element value
                        ans[i_part][j_part]= ans[p.x][p.y]+1;
                    }
                }
            }
        }
        return ans;
    }
}