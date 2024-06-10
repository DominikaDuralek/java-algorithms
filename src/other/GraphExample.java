package other;

public class GraphExample {
    public static void main(String[] args) {
        System.out.println("Graph example");

        // Graph - non-linear aggregation of nodes and edges
        // - a node is a point on a graph, also known as a vertex
        // - an edge is a connection between two nodes
        // - undirected graphs - two nodes can have an adjacency, edges don't have any direction
        // - directed graphs - an edge joins two nodes, but only in one direction

        // Two popular ways of representing a graph
        // - adjacency matrix
        // - adjacency list

        // Adjacency matrix - 2D array of 0/1 to represent the graph's edges
        int graphSize = 5;
        Graph graph = new Graph(graphSize);
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        // Check if there's an edge
        int node1 = 0;
        int node2 = 1;
        System.out.println("\nEdge between node " + node1 + " and " + node2 + ": " + graph.checkEdge(node1, node2));
    }
}
