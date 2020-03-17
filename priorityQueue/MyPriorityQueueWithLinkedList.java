package priorityQueue;

public class MyPriorityQueueWithLinkedList {
    Node front;

    public MyPriorityQueueWithLinkedList() {
        front = null;
    }

    public void enqueue(Node newNode) {
        if (front == null || front.priority > newNode.priority) {
            newNode.next = front;
            front = newNode;
        } else {
            Node temp = front;
            while(temp.next != null && temp.next.priority <= newNode.priority) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void dequeue() {
        if(front == null) {
            System.out.println("Queue is Empty");
        } else {
            if (front.next == null) {
                front = null;
            } else {
                front = front.next;
            }
        }
    }

    public void printQueue() {
        if (front == null) {
            System.out.println("Queue is Empty");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.println(temp);
                temp = temp.next;
            }
        }
    }
}