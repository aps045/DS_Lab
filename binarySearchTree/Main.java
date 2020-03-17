package binarySearchTree;

public class Main {
    public static void main(String[] args) {
        PrintTree printTree = new PrintTree();
        Implementation implementation = new Implementation();
        printTree.insert(48);
        printTree.insert(56);
        printTree.insert(67);
        printTree.insert(34);
        printTree.insert(23);
        printTree.insert(45);
        printTree.insert(68);
        printTree.ldr(implementation.root);
        printTree.delete(67);
        System.out.println();
        printTree.ldr(implementation.root);
        printTree.delete(48);
        printTree.ldr(implementation.root);
    }
}
