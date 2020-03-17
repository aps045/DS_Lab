package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Implementation {
    Node root;

    public void insert(int value) {
        Node node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node present = queue.remove();

            if (present.left == null) {
                present.left = node;
                break;
            } else if (present.right == null) {
                present.right = node;
                break;
            } else {
                queue.add(present.left);
                queue.add(present.right);
            }

        }

    }

}
