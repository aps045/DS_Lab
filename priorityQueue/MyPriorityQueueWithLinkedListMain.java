package priorityQueue;

import java.util.Scanner;

public class MyPriorityQueueWithLinkedListMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyPriorityQueueWithLinkedList obj = new MyPriorityQueueWithLinkedList();
        Student s1 = new Student(1, "ABC", 8.6);
        Student s2 = new Student(2, "BCD", 8.9);
        Student s3 = new Student(3, "CDE", 8.4);
        Student s4 = new Student(4, "DEF", 8.5);
        Student s5 = new Student(5, "EFG", 8.7);
        obj.enqueue(s1);
        obj.enqueue(s5);
        obj.enqueue(s2);
        obj.enqueue(s4);
        obj.enqueue(s3);
        obj.printQueue();
        scanner.close();
    }
}
