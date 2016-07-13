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
}
