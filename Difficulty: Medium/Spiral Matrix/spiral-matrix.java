// User function Template for Java

class Solution {

    public int findK(int a[][], int n, int m, int k) {
        // Your code goes here
       int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=m-1;
        int cnt=0;
        
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int i=colStart; i<=colEnd && cnt<n*m; i++){
                k--; cnt++;
                if(k==0) return a[rowStart][i];
            }
            rowStart++;
            
            for(int i=rowStart; i<=rowEnd && cnt<n*m; i++){
                k--; cnt++;
                if(k==0) return a[i][colEnd];
            }
            colEnd--;
            
            for(int i=colEnd; i>=colStart && cnt<n*m; i--){
                k--; cnt++;
                if(k==0) return a[rowEnd][i];
            }
            rowEnd--;
            
            for(int i=rowEnd; i>=rowStart && cnt<n*m; i--){
                k--; cnt++;
                if(k==0) return a[i][colStart];
            }
            colStart++;
        }
        return -1;
    
    }
}