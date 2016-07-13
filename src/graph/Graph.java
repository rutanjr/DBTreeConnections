package graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.PriorityQueue;

/**
 * Created by parke_000 on 2016-07-13.
 */
public class Graph {
    Hashtable<String, Edge> edges;
    Hashtable<String, Node> nodes;

    public Graph(){
        edges = new Hashtable<>();
        nodes = new Hashtable<>();
    }

    public boolean containsNode(String nodeID){
        return nodes.containsKey(nodeID);
    }

    public boolean containsEdge(String edgeId){
        return edges.containsKey(edgeId);
    }

    public void addNode(Node node){
        nodes.put(node.getId(), node);
    }

    public void addEdge(Edge edge){
        edges.put(edge.getName(), edge);
    }

    public Node getNode(String id){
        return nodes.get(id);
    }

    public Edge getEdge(String id){
        return edges.get(id);
    }

    public PriorityQueue<ArrayList<Edge>> getPaths(Node origin, Node destination) {
        PriorityQueue<ArrayList<Edge>> paths = new PriorityQueue<ArrayList<Edge>>();
        getPath(origin, destination, new ArrayList<Edge>(), paths);
        for(ArrayList x : paths){
            System.out.println(x.size());
        }
        return paths;
    }

    private PriorityQueue<ArrayList<Edge>> getPath(Node current, Node destination, ArrayList<Edge> currentPath, PriorityQueue<ArrayList<Edge>> allPaths) {
        if(current == destination) {
            allPaths.add(currentPath);
        }
        for(Edge edge : current.getEdges().values()) {
            if(!currentPath.contains(edge)) {
                ArrayList<Edge> nextpath = (ArrayList<Edge>) currentPath.clone();
                nextpath.add(edge);
                getPath(getNode(edge.getTheOtherNode(current.getId())), destination, nextpath, allPaths);
            }
        }
        return allPaths;
    }

    @Override
    public String toString() {
        String returnString = "";
        for(Node n : nodes.values()){
            returnString += n.toString();
        }
        return returnString;
    }
}
