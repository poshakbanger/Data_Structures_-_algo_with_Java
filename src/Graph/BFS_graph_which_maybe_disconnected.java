package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS_graph_which_maybe_disconnected {
    // Perform BFS for the entire graph which maybe disconnected
    public static void bfsDisconnected(List<List<Integer>> adj){
        boolean[] visited = new boolean[adj.size()];

        for (int i=0; i<adj.size(); i++){
            if (!visited[i]){
                bfs(adj,i,visited);
            }
        }
    }

    // BFS from given source s
    public static void bfs(List<List<Integer>> adj, int s, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();

        // Mark the source node as visited and enqueue it
        visited[s] = true;
        q.add(s);

        // Iterate over the queue
        while (!q.isEmpty()) {
            int curr = q.poll(); // Dequeue a vertex
            System.out.print(curr + " ");

            // Get all adjacent vertices of curr
            for (int x : adj.get(curr)) {
                if (!visited[x]) {
                    visited[x] = true; // Mark as visited
                    q.add(x); // Enqueue it
                }
            }
        }
    }

    public static void addEdge(List<List<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u); // Undirected graph
    }

    public static void main(String[] args) {
        int V = 6;
        List<List<Integer>> adj = new ArrayList<>(V);

        for (int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 5);

        bfsDisconnected(adj);
    }
}
