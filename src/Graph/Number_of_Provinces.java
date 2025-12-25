package Graph;

public class Number_of_Provinces {
    private int n;

    // Helper function to perform DFS
    private void dfs(int[][] adj, int u, boolean[] visited) {
        visited[u] = true;

        // Visit neighbors
        for (int v = 0; v < n; v++) {
            if (adj[u][v] == 1 && !visited[v]) {
                dfs(adj, v, visited);
            }
        }
    }

    // Function to find the number of provinces (connected components)
    public int findCircleNum(int[][] isConnected) {
        n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        // Perform DFS for every unvisited node
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(isConnected, i, visited);
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Number_of_Provinces sol = new Number_of_Provinces();

        // Example input: adjacency matrix representing the provinces
        int[][] isConnected = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        // Finding the number of provinces
        int result = sol.findCircleNum(isConnected);
        System.out.println("Number of provinces: " + result);  // Output: 2
    }
}
