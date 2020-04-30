package githubCode.graph;

public class MyGraphMain {
    public static void main(String[] args) {
        MyGraph obj = new MyGraph(5);
        obj.addUndirectedEdge(0,1);
        obj.addUndirectedEdge(0,2);
        obj.addUndirectedEdge(1,3);
        obj.addUndirectedEdge(1,4);
        obj.addUndirectedEdge(4,0);
        obj.addUndirectedEdge(3,2);
        obj.addUndirectedEdge(3,0);
        obj.addUndirectedEdge(4,1);

        System.out.println(obj);
    }
}
