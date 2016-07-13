package graph;

/**
 * Created by rutanjr on 2016-07-13.
 */
public class Edge {
    private final String node1;
    private final String node2;
    private final String name;
    private Status status = Status.UNKNOWN;

    public enum Status {
        UNKNOWN, OK, NOTOK, TARGET;
    }

    public Edge(String node1, String node2, String name) {
        this.node1 = node1;
        this.node2 = node2;
        this.name = name;
    }


    public String getTheOtherNode(String node) {
        if(node.equals(node1))
            return node2;
        else
            return node1;
    }

    public boolean setStatus(String newStatus){
        switch (newStatus) {
            case "TARGET":
                status = Status.TARGET;
                return true;
            case "OK":
                status = Status.OK;
                return true;
            case "NOTOK":
                status = Status.NOTOK;
                return true;
        }

        return false;
    }

    public String getStatus() {
        return status.name();
    }

    public String getName() {
        return name;
    }
}
