//package Graph;
//import java.util.ArrayList;
//
//public class Level_of_given_node_undirect_graph {
//    public static int findLevel(int N, int[][] edges, int X){
//        int maxVertex = 0;
//        for(int[] it : edges){
//            maxVertex = Math.max(maxVertex, Math.max(it[0],it[1]));
//        }
//
//        // Creating adjacency list
//        ArrayList<Integer>[] adj = new ArrayList[maxVertex + 1];
//
//        for (int i=0; i<maxVertex; i++){
//            adj[i] = new ArrayList<>();
//        }
//
//        for (int i = 0; i < edges.length; i++) {
//            adj[edges[i][0]].add(edges[i][1]);
//            adj[edges[i][1]].add(edges[i][0]);
//        }
//        return maxVertex;
//    }
//    public static void main(String[] args) {
//        int V = 5;
//        int[][] edges = { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 4 } };
//        int X = 3;
//
//        // Function call
//        int level = findLevel(V, edges, X);
//        System.out.println(level);
//    }
//}
