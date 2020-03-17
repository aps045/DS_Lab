package priorityQueue;

public class Node {
    int data;
    int priority;
    Node next;

    public Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        next = null;
    }

    @Override
    public String toString() {
        return "data=" + data +
                "priority=" + priority +
                "next=" + next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
