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

                }                           //  End of else

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

        //  To check whether it's in right or left
        newNode.setIsLeft(false);                           //  boolean isLeft = false;

        while (newNode.getCurrent().getData() != value) {
            //  while (current.data != value) {

            newNode.setParent(newNode.getCurrent());        //  parent = current;

            if (value < newNode.getCurrent().getData()) {
                //  if (value < current.data) {

                newNode.setCurrent(newNode.getCurrent().getLeft());         //  current = current.left;
                newNode.setIsLeft(true);                                    //  isLeft = true;

            } else {

                newNode.setCurrent(newNode.getCurrent().getRight());        //  current = current.right;
                newNode.setIsLeft(false);                                   //  isLeft = false;

            }       //  End of else

            //  To check whether root is null or not
            if (root == null) {

                return;

            }

        }           //  End of while Loop

        /*
         *  CASE 1 : If the node is Leaf Node
         */
        if (newNode.getCurrent().getLeft() == null && newNode.getCurrent().getRight() == null) {
            //  if (current.left == null && current.right == null) {

            if (newNode.getCurrent() == root) {
                //  if (current == root) {

                root = null;

            } else if (newNode.isLeft() == true) {
                //  } else if (isLeft == null) {

                newNode.getParent().setLeft(null);              //  parent.left = null;

            } else {

                newNode.getParent().setRight(null);             //  parent.right = null;

            }

        }

    }

/*
            *
            * Rest will be Updated
            *
 */


}

class PrintTree extends Implementation {

//
//    public void dataLeftRight(Node root) {
//
//        if (root == null) {
//            //  Condition to check whether a root is null or not
//
//            return;
//
//        } else {
//
//            System.out.println(root.getData());             //  System.out.println(root.data);
//
//            dataLeftRight(root.getLeft());                  //  dataLeftRight(root.left);
//            dataLeftRight(root.getRight());                 //  dataLeftRight(root.right);
//
//        }
//
//    }
//

    public void leftDataRight(Node root) {

        if (root == null) {
            //  Condition to check whether a root is null or not

            return;

        } else {

            leftDataRight(root.getLeft());                  //  dataLeftRight(root.left);

            System.out.println(root.getData());             //  System.out.println(root.data);

            leftDataRight(root.getRight());                 //  dataLeftRight(root.right);

        }

    }

//
//    public void leftRightData(Node root) {
//
//        if (root == null) {
//            //  Condition to check whether a root is null or not
//
//        return;
//
//        } else {
//
//            leftRightData(root.getLeft());                  //  dataLeftRight(root.left);
//            leftRightData(root.getRight());                 //  dataLeftRight(root.right);
//
//            System.out.println(root.getData());             //  System.out.println(root.data);
//
//        }
//
//    }
//

}
