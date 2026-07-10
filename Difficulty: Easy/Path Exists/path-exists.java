class Solution {
    public boolean checkPath(int V, int[][] edges, int src, int dest) {
        // Code here
                if (src == dest) return true;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];
        queue.add(src);
        visited[src] = true;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : adj.get(current)) {
                if (neighbor == dest) {
                    return true;
                }
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        return false;
    }
}
