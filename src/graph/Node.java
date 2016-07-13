package graph;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by rutanjr on 2016-07-13.
 */
public class Node {
    private Hashtable<String,Edge> edges;
    private String id;

    public Node(String id){
        this.id = id.toUpperCase();
        edges = new Hashtable<String, Edge>();
    }

    public Node(Hashtable edges, String id){
        this.edges = edges;
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public Hashtable<String, Edge> getEdges(){
        return edges;
    }

    public void addEdge(Edge e) {
        this.edges.put(e.getName(), e);
    }

    public Edge getEdge(String edgeId){
        return edges.get(edgeId);
    }

    /**
     *
     * @return number of edges reaching the node.
     */
    public int getNoEdges() {
        return edges.size();
    }
}
