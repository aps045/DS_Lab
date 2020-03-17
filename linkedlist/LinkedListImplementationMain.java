package linkedlist;

public class LinkedListImplementationMain {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(70);
        Node node4 = new Node(40);
        Node node5 = new Node(60);
        Node node6 = new Node(50);
        Node node7 = new Node(30);
        Implementation implementation = new Implementation();
        implementation.insertNode(node1);
        implementation.insertNode(node2);
        implementation.insertNode(node3);
        implementation.insertNode(node4);
        implementation.insertNode(node5);
        implementation.insertNode(node6);
        implementation.insertNode(node7);
        implementation.printNode();
    }
}
