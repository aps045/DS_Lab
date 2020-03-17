package tree;

public class PrintTree {
    public void dlr(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.println(root.data);
            dlr(root.left);
            dlr(root.right);
        }
    }

    public void ldr(Node root) {
        if (root == null) {
            return;
        } else {
            dlr(root.left);
            System.out.println(root.data);
            dlr(root.right);
        }
    }

    public void lrd(Node root) {
        if (root == null) {
            return;
        } else {
            dlr(root.left);
            dlr(root.right);
            System.out.println(root.data);
        }
    }
}
