package Graph;

import java.util.ArrayList;

/**
 * Created by rutanjr on 2016-07-13.
 */
public class Node {
    private ArrayList<Edge> edges = new ArrayList<Edge>();
    private int id;

    public Node(ArrayList<Edge> edges, int id){
        this.edges = edges;
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public ArrayList<Edge> getEdges(){
        return edges;
    }

    public int getNoEdges() {
        return edges.size();
    }
}
