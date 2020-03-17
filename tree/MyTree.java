package tree;

public class MyTree extends PrintTree{
    public Node createNewNode(int data) {
        Node newNode = new Node();
        newNode.setData(data);
        return newNode;
    }
}
