package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Detect_cycle_in_a_Directed_Graph {
    public static boolean isCyclic(int N, ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q = new LinkedList<Integer>();
        int indegree[] = new int[N];
        int count = 0;

        // Step 1: Calculate the indegree of each vertex
        for (int u=0; u<N; u++){
            for (int v: adj.get(u)){
                indegree[v]++;
            }
        }

        // Step 2: Add vertices with indegree 0 to the queue
        for (int i=0; i<N; i++){
            if (indegree[i] == 0){
                q.add(i);
                count++;
            }
        }

        // Step 3: Simple BFS (Kahn's Algorithm)
        while (!q.isEmpty()) {
            int u = q.poll();

            for (int v : adj.get(u)) {
                indegree[v]--;

                // If indegree of v becomes 0, add it to the queue
                if (indegree[v] == 0) {
                    q.add(v);
                    count++;
                }
            }
        }
        // If count of processed nodes is not equal to the number of vertices, there is a cycle
        return count != N;
    }
    public static void main(String[] args) {
        Detect_cycle_in_a_Directed_Graph sol = new Detect_cycle_in_a_Directed_Graph();

        // Example graph with 6 vertices
        int N = 6;

        // Create the adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
        }

        // Example directed graph
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(4).add(1); // This creates a cycle

        // Check if the graph contains a cycle
        boolean hasCycle = Detect_cycle_in_a_Directed_Graph.isCyclic(N, adj);
        System.out.println("Graph contains cycle: " + hasCycle);
    }
}
