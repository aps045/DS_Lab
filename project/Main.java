package project;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        Implementation obj = new Implementation();
        while(choice != 5) {
            System.out.println("Welcome to DBC' s Contact List, PLease type the correspond option no. from the below menu\n" +
                    "1. Add a Contact to contact list\n" +
                    "2. Show the whole contact list\n" +
                    "3. Search a contact\n" +
                    "4. Delete a contact\n" +
                    "5. Exit from the menu");
            choice = scanner.nextInt();
            switch(choice) {
                case 1 :
                    System.out.print("Enter the First Name : ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter the Last Name : ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter the Mobile Number : ");
                    Long mobile = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Enter the E Mail : ");
                    String eMail = scanner.nextLine();
                    Person p = new Person(firstName, lastName, mobile, eMail);
                    obj.addContact(p);
                    break;
                case 2 : obj.printContactList();
                    break;
                case 3 : obj.searchContact();
                    break;
                case 4 : obj.deleteContact();
                    break;
                case 5 : System.out.println("Thank You Visit Again !!!");
                    break;
                default : System.out.println("Please enter a valid Input");
            }
        }
    }
}
