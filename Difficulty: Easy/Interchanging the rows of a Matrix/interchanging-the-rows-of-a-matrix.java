class Solution {
    // Function to interchange the rows of a matrix.
    static void interchangeRows(int matrix[][]) {
        // code here
                int i = 0,j = matrix.length-1;
        while(i<j){
            for(int x = 0;x< matrix[0].length;x++){
                int t = matrix[i][x];
                matrix[i][x] = matrix[j][x];
                matrix[j][x] = t;
            }
            i++;
            j--;
        }

    }
}
