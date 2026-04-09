class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
          int []indegree = new int[V];
  ArrayList<ArrayList<Integer>> list = new ArrayList<>();
  
  for(int i =0;i<V;i++){
      list.add(new ArrayList<>());
  }
  
  //making adjacency list
  for(int i = 0;i<edges.length;i++){
      int uu = edges[i][0];
      int vv = edges[i][1];
      list.get(uu).add(vv);
  }
  
  //make ready the indegree array
  for(int i = 0;i<V;i++){
      for(int it:list.get(i)){
       indegree[it]++;
    }
  }
    
  Queue<Integer> q = new LinkedList<>();
   for(int i = 0;i<indegree.length;i++){
       if(indegree[i]==0){
           q.add(i);
       }
   }
   
   ArrayList<Integer> answer = new ArrayList<>();
   while(!q.isEmpty()){
       int node = q.poll();
       answer.add(node);
       
       for(int b:list.get(node)){
           indegree[b]--;
           
           if(indegree[b]==0){
               q.add(b);
           }
       }
   }
   return answer;

    }
}