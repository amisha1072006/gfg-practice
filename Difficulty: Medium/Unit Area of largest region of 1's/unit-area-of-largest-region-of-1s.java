class Solution {
    // Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid) {
        // Code here
                Queue<Node>q= new LinkedList<>();
        
    int row=grid.length;
    int col=grid[0].length;
    int visited[][]= new int [row][col];

        
        int ans=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(visited[i][j]==0&&grid[i][j]==1)
                {
                    q.add(new Node(i,j));
                    visited[i][j]=1;
                  ans=Math.max(ans,BFS(grid,visited,q));
                  
                }
            }
        }
        return ans;
        
    }
    
    public int BFS(int[][]grid,int[][]visited,Queue<Node>q)
    {
        int ans=0;
        while(!q.isEmpty())
        {
            Node temp=q.poll();
            
            int row=temp.row;
            int col =temp.col;
            ans++;
            int[]delRow= {-1, -1, -1, 0, 0, 1, 1, 1};;
            int[]delCol ={-1, 0, 1, -1, 1, -1, 0, 1};
            
      
            
        for(int i=0;i<8;i++)
        {
            int newRow=row+delRow[i];
            int newCol=col+delCol[i];
            if(newRow>=0&&newRow<grid.length&&newCol>=0&&
            newCol<grid[0].length&&visited[newRow][newCol]==0&&
            grid[newRow][newCol]==1)
            {
               visited[newRow][newCol]=1;
               q.add(new Node(newRow,newCol));
            }
        }
        }
        return ans;
    }
    
}

class Node{
    int row;
    int col;
 
    Node(int row, int col)
    {
        this.row= row;
        this.col=col;

    }
}