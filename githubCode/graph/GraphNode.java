package githubCode.graph;

public class GraphNode {
    int value;
    public GraphNode(int value)
    {
        this.value = value;
    }

    @Override
    public String toString() {
        return value+ " ";
    }
}
