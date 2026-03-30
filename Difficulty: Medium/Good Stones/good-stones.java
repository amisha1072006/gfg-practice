class Solution {
     public static int fun(int ind, int[] arr, int[] visited){

        if(ind < 0 || ind >= arr.length) return 1;

        if(visited[ind] != -1) return visited[ind];

        visited[ind] = 0;

        visited[ind] = fun(ind+arr[ind], arr, visited);

        return visited[ind];

    }
    public static int goodStones(int n, int[] arr) {
        // code here
         int [] visited = new int[n];

        for(int i=0; i< n; i++) visited[i] = -1;

        // here -1 mean not visited 

        // 0 mean bad stone 

        // 1 mean good stone

        for(int i=0; i< n; i++){

            if(visited[i] == -1) {

                visited[i] = fun(i, arr, visited);

            }

        }

        int count =0;

        for(int i=0; i< n; i++) if(visited[i] == 1) count++;

        return count;
    }
}
