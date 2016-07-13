package graph;

import java.util.ArrayList;
import java.util.Hashtable;

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

    public void addNode(String id, Node node){
        nodes.put(id, node);
    }

    public void addEdge(String id, Edge edge){
        edges.put(id, edge);
    }
}
