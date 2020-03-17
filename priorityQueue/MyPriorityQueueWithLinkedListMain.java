package priorityQueue;

public class MyPriorityQueueWithLinkedListMain {
    public static void main(String[] args) {
        Node n1 = new Node(10, 2);
        Node n2 = new Node(20, 1);
        Node n3 = new Node(30, 5);
        Node n4 = new Node(40, 3);
        Node n5 = new Node(50, 4);
        MyPriorityQueueWithLinkedList obj = new MyPriorityQueueWithLinkedList();
        MyPriorityQueueWithLinkedList obj1 = new MyPriorityQueueWithLinkedList();
        MyPriorityQueueWithLinkedList obj2 = new MyPriorityQueueWithLinkedList();
        obj.printQueue();
        obj.dequeue();          //no node
        obj.enqueue(n4);
        obj.printQueue();
        obj.enqueue(n1);
        obj.printQueue();
        obj.enqueue(n2);
        obj.printQueue();
//        obj.enqueue(n4);
//        obj.printQueue();
        obj1.dequeue();          //node n4
        obj1.printQueue();
//        obj1.dequeue();          //node n1
//        obj1.printQueue();
//        obj1.dequeue();          //node n2
//        obj1.printQueue();
//        obj1.dequeue();          //node n4
//        obj1.printQueue();
//        obj1.dequeue();          //no node
//        obj1.printQueue();
//        obj2.enqueue(n1);
//        obj2.printQueue();
//        obj2.enqueue(n2);
//        obj2.printQueue();
//        obj2.enqueue(n3);
//        obj2.printQueue();
//        obj2.enqueue(n4);
//        obj2.printQueue();
//        obj2.enqueue(n5);
//        obj2.printQueue();
    }
}
