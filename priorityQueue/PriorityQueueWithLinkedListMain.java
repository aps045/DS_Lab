package priorityQueue;

import java.util.Scanner;

public class PriorityQueueWithLinkedListMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueueWithLinkedList obj = new PriorityQueueWithLinkedList();
        obj.enqueue(new Student(1, "ABC", 8.6));
        obj.enqueue(new Student(5, "EFG", 8.7));
        obj.enqueue(new Student(2, "BCD", 8.9));
        obj.enqueue(new Student(4, "DEF", 8.5));
        obj.enqueue(new Student(3, "CDE", 8.4));
        obj.printQueue();
        scanner.close();
    }
}
