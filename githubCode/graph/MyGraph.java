package githubCode.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class MyGraph {
    ArrayList<GraphNode> arr[];
    public MyGraph(int n) // represents size
    {
        arr = new ArrayList[n];
        for(int i = 0; i < arr.length; i++)
            arr[i] = new ArrayList<GraphNode>();
    }

    public void addUndirectedEdge(int start, int end) {
        arr[start].add(new GraphNode((end)));       //  method of ArrayList to add
    }

    @Override
    public String toString() {
        return "MyGraph{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}

/*
* Output is like :
* Array will be produced showing vertex associated with the edges as -
* If there were 5 vertex and some edges like given in main class
* MyGraph{arr=[[1,2], [3,4], [], [2,0], [1,5]]}
* i.e. vertex 0 is linked linked with edge 1 and 2, similarly, vertex 2 is linked with edge 3 and 4 and so on...
 */
