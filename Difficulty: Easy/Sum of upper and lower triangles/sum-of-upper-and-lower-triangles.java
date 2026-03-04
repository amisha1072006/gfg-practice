
class Solution {
    public ArrayList<Integer> sumTriangles(int mat[][]) {
        // code here
        int n = mat.length;  
        int r = 0;
        int s = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(i == j || j > i)
                {
                    r = r + mat[i][j];
                }
                
        }
    }
     for(int i = 0 ; i < n; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
             
   if(i == j || j < i)
                {
                    s = s + mat[i][j];
                }}}
    list.add(r);
    list.add(s);
    return list;

    }
}