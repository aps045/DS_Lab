package priorityQueue;

public class Node {
    private Student data;
    private Node front;
    private Node next;
    private Node temp;

    public Node getTemp() {
        return temp;
    }

    public void setTemp(Node temp) {
        this.temp = temp;
    }

    public Node(Student data) {
        this.data = data;
    }

    public Node() {
        data = null;
        front = null;
        next = null;
        temp = null;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
