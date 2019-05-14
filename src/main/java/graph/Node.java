package graph;

import java.util.*;

public class Node {

    private String name;
    private Integer distance = Integer.MAX_VALUE;
    private Node predecessor;

    public Map<Node, Integer> getNeighbors() {
        return neighbors;
    }

    private Map<Node,Integer> neighbors = new HashMap();

    public Node getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Node predecessor) {
        this.predecessor = predecessor;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public void addNeighbor(Node neighbor, int distance){
        neighbors.put(neighbor,distance);
    }

    public Node(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}