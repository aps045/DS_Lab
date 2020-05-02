package priorityQueue;

public class Node {
    Student data;
    Node front;
    Node next;
    Node temp;

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
