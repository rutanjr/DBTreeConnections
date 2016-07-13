package main;

import graph.Edge;
import graph.Graph;
import graph.Node;

import java.io.File;
import java.util.List;

/**
 * Created by parke_000 on 2016-07-13.
 */
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Parser parser = new Parser(new File("input/apa.xml"));
        initGraph(graph, parser.getData());
        System.out.println(graph.toString());
    }

    private static void initGraph(Graph graph, List<String> data){
        for(String str : data) {
            String[] info = str.split("\"");

            String link = info[1].toUpperCase();
            String origin = info[3].toUpperCase();
            String destination = info[5].toUpperCase();

            Node nodeOne;
            Node nodeTwo;
            Edge edge;

            if(!graph.containsNode(origin)){
                graph.addNode(new Node(origin));
            }

            if(!graph.containsNode(destination)){
                graph.addNode(new Node(destination));
            }

            nodeOne = graph.getNode(origin);
            nodeTwo = graph.getNode(destination);

            edge = new Edge(origin, destination, link);

            graph.addEdge(edge);

            nodeOne.addEdge(edge);
            nodeTwo.addEdge(edge);
        }
    }
}
