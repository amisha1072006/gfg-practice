// User function template for java

class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        // code here
          int row=mat.length;
        int col=mat[0].length;
        k=k%mat[0].length;
        for(int i=0;i<row;i++)
        {
            rev(mat,i,0,k-1);
        }
        for(int i=0;i<row;i++)
        {
            rev(mat,i,0,mat[0].length-1);
        }
        // revwhole(mat,mat.length-1);
        return mat;
    }
    public static void rev(int mat[][],int row,int st,int end)
    {
        int i=st;
        int j=end;
        while(i<j)
        {
            int temp=mat[row][i];
            mat[row][i]=mat[row][j];
            mat[row][j]=temp;
            i++;
            j--;
        }
        revrem(mat,row,end+1);
    }
    public static void revrem(int mat[][], int row,int k)
    {
        int i=k;
        int j=mat[0].length-1;
        while(i<=j)
        {
            int temp=mat[row][i];
            mat[row][i]=mat[row][j];
            mat[row][j]=temp;
            i++;
            j--;
}
    }
}