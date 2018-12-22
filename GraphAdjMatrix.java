/**
 * GraphAdjMatrix.java
 * @author Marko Crnkovic
 */

 public class GraphAdjMatrix implements Graph {
    private int[][] adj;
    
    public static void main(String[] args) {

        Graph graph = new GraphAdjMatrix(3);
        graph.addEdge(0, 1, 3);
        System.out.println(graph.getEdge(0,1));
    }

    public int getEdge(int vert1, int vert2){
        int weight = adj[vert1][vert2];
        return weight;   
    }

     public GraphAdjMatrix(int vertices){
        adj = new int[vertices][vertices];
    }

    public void addEdge(int vert1, int vert2, int weight){
        adj[vert1][vert2] = weight;
    }

    public void addEdge(int vert1, int vert2) {
    	adj[vert1][vert2] = 0;
    }

     public int createSpanningTree(){

        return 100;
    }

    public void topologicalSort() {
    	return;
    }

 }