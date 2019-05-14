import graph.Graph;
import graph.Node;

import java.util.List;

public class Program {

    public static void main(String[] args){
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addNeighbor(nodeB,10);
        nodeA.addNeighbor(nodeC,15);

        nodeB.addNeighbor(nodeF,15);
        nodeB.addNeighbor(nodeD,12);

        nodeC.addNeighbor(nodeE,10);

        nodeD.addNeighbor(nodeF,1);
        nodeD.addNeighbor(nodeE,2);

        nodeF.addNeighbor(nodeE,5);

        Graph graph = new Graph(6);
        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        List<Node> nodes= graph.getShortestPaths(nodeA);
        for(Node node:nodes){
            System.out.println(node.getName() + " " + node.getDistance());
        }
    }
}
