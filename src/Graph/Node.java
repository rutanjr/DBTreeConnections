package graph;

import java.util.ArrayList;

/**
 * Created by rutanjr on 2016-07-13.
 */
public class Node {
    private ArrayList<Edge> edges = new ArrayList<Edge>();
    private String id;

    public Node(ArrayList<Edge> edges, String id){
        this.edges = edges;
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public ArrayList<Edge> getEdges(){
        return edges;
    }

    /**
     *
     * @return number of edges reaching the node.
     */
    public int getNoEdges() {
        return edges.size();
    }
}
