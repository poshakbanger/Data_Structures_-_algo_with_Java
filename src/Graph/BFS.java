package Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    static void bfs(List<List<Integer>> adj, int s){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[adj.size()];

        visited[s] = true;
        q.add(s);

        while (!q.isEmpty()){
            int curr = q.poll();
            System.out.println(curr + " ");

            for (int x : adj.get(curr)) {
                if (!visited[x]) {
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
    }
    static void addEdge(List<List<Integer>> adj, int v,int u){
        adj.get(u).add(v);
        adj.get(v).add(u); //undirected graph
    }
    public static void main(String[] args) {
        int V = 5;

        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }

        // Add edges to the graph
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 4);

        // Perform BFS traversal starting from vertex 0
        System.out.println("BFS starting from 0:");
        bfs(adj, 0);
    }
}
