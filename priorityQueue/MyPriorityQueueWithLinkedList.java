package priorityQueue;

public class MyPriorityQueueWithLinkedList {
    Node node = new Node();

    public void enqueue(Student s) {
        Node newNode = new Node(s);
        if (node.getFront() == null || node.getFront().getData().getCpi() > newNode.getData().getCpi()) {
            newNode.setNext(node.getFront());
            node.setFront(newNode);
        } else {
            node.setTemp(node.getFront());
            while(node.getTemp().getNext() != null && node.getTemp().getNext().getData().getCpi() <= newNode.getData().getCpi())
                node.setTemp(node.getTemp().getNext());
            newNode.setNext(node.getTemp().getNext());
            node.getTemp().setNext(newNode);
        }
    }

    public void dequeue() {
        if(node.getFront() == null)
            System.out.println("Queue is Empty");
        else {
            if (node.getFront().getNext() == null)
                node.setFront(null);
            else
                node.setFront(node.getFront().getNext());
        }
    }

    public void printQueue() {
        if (node.getFront() == null) {
            System.out.println("Queue is Empty");
        } else {
            node.setTemp(node.getFront());
            while (node.getTemp() != null) {
                System.out.println(node.getTemp().getData().toString());
                node.setTemp(node.getTemp().getNext());
            }
        }
    }
}