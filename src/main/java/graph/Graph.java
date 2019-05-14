package graph;

import java.util.*;

public class Graph {

    Node[] nodes ;

    public Graph(int size){
        nodes = new Node[size];
    }

    public int getSize() {
        return index;
    }

    int index=0;

    public void addNode(Node node) {
        nodes[index++]=node;
    }

    public List<Node> getShortestPaths(Node nodeSource) {

        nodeSource.setDistance(0);
        List<Node> retNodes = new ArrayList<Node>();

        for (int i=0;i<index;i++) {
            Node node = nodes[i];
            retNodes.add(node);

            Map<Node, Integer> neighbors = node.getNeighbors();
            if(neighbors==null)
                continue;
            for (Node neighbor : neighbors.keySet()) {

                int distFull = getFullDistance(node);
                int distance = neighbors.get(neighbor) + distFull;

                if ((distance) < neighbor.getDistance()){
                    neighbor.setDistance(distance);
                    neighbor.setPredecessor(node);
                }
            }
        }
        return retNodes;
    }

    private int getFullDistance(Node node) {

        if(node==null)
            return 0;

        if(node.getPredecessor()==null)
            return 0;

        if(node.getDistance()!=Integer.MAX_VALUE)
            return node.getDistance();

        int totalDistance=0;

        while(node.getPredecessor()!=null){
            totalDistance+=node.getDistance();
            node=node.getPredecessor();
        }
        return totalDistance;
    }
}


