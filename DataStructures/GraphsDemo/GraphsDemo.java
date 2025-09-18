package DataStructures.GraphsDemo;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class GraphsDemo {

    static List<List<Integer>> createStaticGraphInAdjacencyList(){
        // Graph creation logic can be implemented here
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(0);
        graph.get(2).add(4);

        graph.get(3).add(1);
        graph.get(3).add(5);

        graph.get(4).add(1);
        graph.get(4).add(2);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        return graph;
    }

    static List<List<Integer>> createStaticGraphInMatrixRepresentation(){
        List<List<Integer>> graph = new ArrayList<>();
        int nodes = 6;
        int[][] edges = {
            {0, 1}, {1, 0},
            {0, 2}, {2, 0},
            {1, 2}, {2, 1},
            {1, 3}, {3, 1},
            {1, 4}, {4, 1},
            {2, 4}, {4, 2},
            {3, 5}, {5, 3},
            {4, 5}, {5, 4}

        };
        for(int i = 0; i < nodes; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u); // For undirected graph
        }

        return graph;
    }

    static void printGraph(List<List<Integer>> graph){
        for(int i = 0; i < graph.size(); i++){
            System.out.print("Node " + i + ": ");
            for(Integer neighbor : graph.get(i)){
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    static void dfsUtil(List<List<Integer>> graph, boolean[] visited, int node){
        visited[node] = true;
        System.out.print(node + " ");
        for(Integer neighbor : graph.get(node)){
            if(!visited[neighbor]){
                dfsUtil(graph, visited, neighbor);
            }
        }
    }

    static void bfsUtil(List<List<Integer>> graph, boolean[] visited, int startNode){
        Queue<Integer> queue = new LinkedList<>();
        visited[startNode] = true;
        queue.add(startNode);

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node + " ");
            for(Integer neighbor : graph.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        List<List<Integer>> graph = createStaticGraphInAdjacencyList();
        printGraph(graph);
        boolean[] visited = new boolean[graph.size()];
        System.out.print("DFS Traversal: ");
        dfsUtil(graph, visited, 0);
        System.out.println();
        visited = new boolean[graph.size()];
        System.out.print("BFS Traversal: ");
        bfsUtil(graph, visited, 0);
        System.out.println();
        graph = createStaticGraphInMatrixRepresentation();
        printGraph(graph);
        visited = new boolean[graph.size()];
        System.out.print("DFS Traversal: ");
        dfsUtil(graph, visited, 0);
        System.out.println();
        visited = new boolean[graph.size()];
        System.out.print("BFS Traversal: ");
        bfsUtil(graph, visited, 0);
        System.out.println();
    }

}
