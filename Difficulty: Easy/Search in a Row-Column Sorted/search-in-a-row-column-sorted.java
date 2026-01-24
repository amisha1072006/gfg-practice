class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
          int rows = mat.length;
        int cols = mat[0].length;
        
        int row = 0;
        int col = cols - 1;
        
        while(row<rows && col >=0){
            
            if(mat[row][col]==x){
                return true;
            }
            else if(mat[row][col]>x){
                col--;
            }
            else{
                row++;
            }
        }
   return false; 
    }
}