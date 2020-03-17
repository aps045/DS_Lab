package binarySearchTree;



public class Implementation {

    Node root;

    Node newNode = new Node();

    public Implementation() {
        root = null;
    }

    public void insert(int value) {

        newNode.setData(value);                     //  newNode.data = value;

        /*
         * Condition to check whether root is null or not
         * if YES then assign the newNode to root
         * else go further
         */
        if (root == null) {

            root = newNode;

        } else {

            newNode.setCurrent(root);               //  Node current = root;
            newNode.setParent(null);                //  Node parent = null;

            while (true) {

                newNode.setParent(newNode.getCurrent());
                //  parent = current;

                /*
                 * Condition to check whether the given value is small then current value or not
                 */
                if (newNode.getCurrent().getData() > value) {
                    //  if (current.data > value) {

                    newNode.setCurrent(newNode.getCurrent().getLeft());
                    //  current = current.left;

                    if (newNode.getCurrent() == null) {
                        //  if (current == null) {

                        newNode.getParent().setLeft(newNode);
                        //  parent.left = newNode;

                        return;

                    }

                } else {

                    newNode.setCurrent(newNode.getCurrent().getRight());
                    //  current = current.right;

                    if (newNode.getCurrent() == null) {
                        //  if (current == null) {

                        newNode.getParent().setRight(newNode);
                        //  parent.right = newNode;

                        return;

                    }

                }

            }                               //  End of while Loop

        }                                   //  End of else

    }


    public void min() {

        newNode.setCurrent(root);               //  Node current = root;
        newNode.setParent(null);                //  Node parent = null;

        while (newNode.getCurrent() != null) {
            //  while (current != null) {

            newNode.setParent(newNode.getCurrent());
            //  parent = current;

            newNode.setCurrent(newNode.getCurrent().getLeft());
            //  current = current.left;

        }                                       //  End of while Loop

        System.out.println(newNode.getParent().getData());
        //  System.out.println(parent.data);

    }


    public void max() {

        newNode.setCurrent(root);               //  Node current = root;
        newNode.setParent(null);                //  Node parent = null;

        while (newNode.getCurrent() != null) {
            //  while (current != null) {

            newNode.setParent(newNode.getCurrent());
            //  parent = current;

            newNode.setCurrent(newNode.getCurrent().getRight());
            //  current = current.right;

        }                                           //  End of while Loop

        System.out.println(newNode.getParent().getData());
        //  System.out.println(parent.data);

    }


    public void delete(int value) {

        newNode.setCurrent(root);                           //  Node current = root;
        newNode.setParent(null);                            //  Node parent = null;
        boolean isLeft = false;                             //  To check whether it's in right or left

        while (newNode.getCurrent().getData() != value) {

            newNode.setParent(newNode.getCurrent());

            if (value < newNode.getCurrent().getData()) {

                newNode.setCurrent(newNode.getCurrent().getLeft());
                isLeft = true;

            } else {

                newNode.setCurrent(newNode.getCurrent().getRight());
                isLeft = false;

            }

            if (root == null) {

                return;

            }

        }           //  End of while Loop

        /*
         *  CASE 1 : If the node is Leaf Node
         */
        if (newNode.getCurrent().getLeft() == null && newNode.getCurrent().getRight() == null) {

            if (newNode.getCurrent() == root) {

                root = null;

            } else if (isLeft == true) {

                newNode.getParent().setLeft(null);

            } else {

                newNode.getParent().setRight(null);

            }

        }

    }




}

class PrintTree extends Implementation {

    public void dlr(Node root) {

        if (root == null) {

            return;

        } else {

            System.out.println(root.getData());

            dlr(root.getLeft());
            dlr(root.getRight());

        }

    }


    public void ldr(Node root) {

        if (root == null) {

            return;

        } else {

            dlr(root.getLeft());

            System.out.println(root.getData());

            dlr(root.getRight());

        }

    }


    public void lrd(Node root) {

        if (root == null) {

            return;

        } else {

            dlr(root.getLeft());
            dlr(root.getRight());

            System.out.println(root.getData());

        }

    }

}
