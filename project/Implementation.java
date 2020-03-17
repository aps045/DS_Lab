package project;

import java.util.Scanner;

public class Implementation {

    Person front;
    Scanner scanner = new Scanner(System.in);

    public Implementation() {
        front = null;
    }

    public void addContact(Person p) {
        String str1 = front.firstName;
        String str2 = p.firstName;
        if(front == null || str1.compareToIgnoreCase(str2) >= 1) {
            p.next = front;
            front = p;
        } else {
            Person temp = front;
            while(temp.next != null && temp.next.firstName.compareToIgnoreCase(str2) <= 0) {
                temp = temp.next;
            }
            p.next = temp.next;
            temp.next = p;
        }
    }

    public void printContactList() {
        if(front == null) {
            System.out.println("Contact List is Empty !!!");
        } else {
            Person temp = front;
            while(temp != null) {
                System.out.println(temp);
                temp = temp.next;
            }
        }
    }

    public void searchContact() {

    }

    public void deleteContact() {
        int count = 0;
        if(front == null) {
            System.out.println("Contact List is Empty !!!");
        } else {
            Person temp = front;
            while(temp != null) {
                System.out.println(temp);
                temp = temp.next;
                count++;
            }
        }
        int choice = scanner.nextInt();
        Person temp = front;
        int i = 1;
        while(temp != null) {
            while (i <= choice && i <= count) {
                temp = temp.next;
                i++;
            }

        }
    }

}
