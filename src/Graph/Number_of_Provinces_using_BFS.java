package Graph;
import java.util.LinkedList;
import java.util.Queue;

public class Number_of_Provinces_using_BFS {
    static int n;
    private static void bfs(int[][] adj, int u, boolean[] visited){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(u);
        visited[u] = true;

        while (!q.isEmpty()){
            int current = q.poll();

            // Visit neighbors
            for (int v = 0; v < n; v++){
                if (adj[current][v] == 1 && !visited[v]) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }

    public static int findCircleNum(int[][] isConnected){
        n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        //Perform BFS for every unvisited node
        for (int i=0; i<n; i++){
            if (!visited[i]){
                bfs(isConnected, i, visited);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Number_of_Provinces_using_BFS sol = new Number_of_Provinces_using_BFS();

        // Example input: adjacency matrix representing the provinces
        int[][] isConnected = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        // Finding the number of provinces
        int result = Number_of_Provinces_using_BFS.findCircleNum(isConnected);
        System.out.println("Number of provinces: " + result);  // Output: 2
    }
}
