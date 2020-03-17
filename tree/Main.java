package tree;

public class Main {
    public static void main(String[] args) {
        Node root = null;
        MyTree myTree = new MyTree();
        root = myTree.createNewNode(10);
        root.left = myTree.createNewNode(20);
        root.right = myTree.createNewNode(30);
        root.left.left = myTree.createNewNode(40);
        root.left.right = myTree.createNewNode(50);
        root.right.left = myTree.createNewNode(60);
        root.right.right = myTree.createNewNode(70);
        System.out.println("\nUsing DLR\n");
        myTree.dlr(root);
        System.out.println("\nUsing LDR\n");
        myTree.ldr(root);
        System.out.println("\nUsing LRD\n");
        myTree.lrd(root);
    }
}
