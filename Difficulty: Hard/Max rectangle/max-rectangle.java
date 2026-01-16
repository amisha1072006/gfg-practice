class Solution {
    static int maxArea(int mat[][]) {
        // code here
          int n=mat.length;
        int m=mat[0].length;
        int pSum[][]=new int[n][m];
        
        for(int j=0;j<m;j++)
        {
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum+=mat[i][j];
                if(mat[i][j]==0)
                {
                    sum=0;
                }
                pSum[i][j]=sum;
            }
        }
        int maxArea=0;
        for(int i=0;i<n;i++)
        {
            maxArea=Math.max(maxArea,Hist(pSum[i]));
        }
       return maxArea; 
    }
    static int Hist(int arr[])
    {
        Stack<Integer> st=new Stack<>();
        
        int maxArea=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            {
                int ele=arr[st.peek()]; st.pop();
                int nse=i;
                int pse=st.isEmpty()?-1:st.peek();
                maxArea=Math.max(maxArea,ele*(nse-pse-1));
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            int nse=n;
            int ele=arr[st.peek()]; st.pop();
            int pse=st.isEmpty()?-1:st.peek();
            maxArea=Math.max(maxArea,ele*(nse-pse-1));
        }
        return maxArea;
    
    }
}