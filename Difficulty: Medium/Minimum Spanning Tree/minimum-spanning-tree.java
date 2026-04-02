class Solution {
    public int spanningTree(int V, int[][] edges) {
        // code here
                List<Edge> edgesList = 
            Arrays.stream(edges)
            .map(edge->new Edge(edge[0],edge[1],edge[2]))
            .toList();
        return new MSTFinder().getMSTWeight(edgesList,V);
    }
}

class MSTFinder{
    Queue<Edge>  edgesQueue;
    UnionFind unionFind;
    int numberOfNodes;
    int getMSTWeight(List<Edge> edges,int numberOfNodes){
        this.numberOfNodes = numberOfNodes;
        this.edgesQueue=new PriorityQueue<>((a,b)->a.weight-b.weight);
        for(int i=0;i<edges.size();i++){
            edgesQueue.add(edges.get(i));
        }
        this.unionFind=new UnionFind(numberOfNodes);
        return getMSTWeight();
    }
    int getMSTWeight(){
        int edgesCount=0;
        int mstWeight=0;
        while(edgesCount<numberOfNodes-1){
            Edge nextEdge=edgesQueue.poll();
            if(unionFind.isSame(nextEdge.src, nextEdge.des)){
                continue;
            }
            unionFind.union(nextEdge.src, nextEdge.des);
            mstWeight+=nextEdge.weight;
            edgesCount++;
        }
        return mstWeight;
    }
}
class UnionFind{
    int parent[],rank[];
    UnionFind(int size){
        parent=new int[size];
        rank=new int[size];
        for(int i=0;i<parent.length;i++){
            parent[i]=i;
        }
        Arrays.fill(rank,1);
    }
    boolean isSame(int node1,int node2){
        return find(node1)==find(node2);
    }
    int find(int node){
        while(parent[node]!=node){
            parent[node]=parent[parent[node]];
            node=parent[node];
        }
        return node;
    }
    void union(int node1,int node2){
        node1=find(node1);
        node2=find(node2);
        if(node1==node2){
            return;
        }
        if(rank[node1]>rank[node2]){
            makeChild(node1,node2);
        }else{
            makeChild(node2,node1);
        }
    }
    void makeChild(int node1,int node2){
        parent[node2]=node1;
        rank[node1]+=rank[node2];
    }
}
class Edge{
    int src,des,weight;
    Edge(int src,int des,int weight){
        this.src=src;
        this.des=des;
        this.weight=weight;

    }
}
