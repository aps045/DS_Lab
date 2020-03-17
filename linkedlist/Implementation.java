package linkedlist;

public class Implementation {
    Node front;
    Node rear;

    public Implementation() {
        front = null;
    }

    public void insertNode(Node newNode) {
        if(front == null && rear == null) {
            front = rear = newNode;
        } else {
//            Node temp1 = front;
//            Node temp2 = rear;
//            while(newNode.data >= temp.data ) {
//                temp = temp.next;
//            }
//            temp.next = newNode;
//            newNode.previous = rear;
//            temp = newNode;
            rear.next = newNode;
            newNode.previous = rear;
            rear = newNode;
        }
    }

    public void printNode() {
        if(front == null) {
            System.out.println("EMPTY !!!");
        } else {
            Node temp = front;
            while(temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
