package githubCode.binaryTree.withArray;

public class BinaryTreeWithArrayMain {
    public static void main(String[] args) {
        BinaryTreeWithArray obj = new BinaryTreeWithArray(10);
        obj.insert(10);
        obj.insert(20);
        obj.insert(5);
        obj.levelordertraversal();
        obj.preorder(2);
    }
}