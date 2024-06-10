package other;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    int[][] matrix;
    ArrayList<Node> nodes;

    // For the adjacency list example
    ArrayList<LinkedList<Node>> alist;

    Graph(int size) {
        matrix = new int[size][size];
        nodes = new ArrayList<>();

        // For the adjacency list example
        alist = new ArrayList<>();
    }

    public void addNode(Node node) {
        nodes.add(node);

        // For the adjacency list example
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;

        // For the adjacency list example
        LinkedList<Node> currentList = alist.get(src);
        // Address of the node we want to link to
        Node dstNode = alist.get(dst).get(0);
        // Add this node to the tail of the current lisr
        currentList.add(dstNode);
    }

    public boolean checkEdgeMatrix(int src, int dst) {
        return matrix[src][dst] == 1;
    }

    public void printMatrix() {
        // Data headers
        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        // Iterate over all rows and columns of the matrix
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // For the adjacency list example
    public boolean checkEdgeList (int src, int dst) {
        // For the adjacency list example
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        for(Node node : currentList) {
            if (node == dstNode) return true;
        }
        return false;
    }

    public void printList() {
        for (LinkedList<Node> currentList : alist) {
            for (Node node : currentList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }

}
