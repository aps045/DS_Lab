package gsfl;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner scanner = new Scanner(System.in);
//        int count = scanner.nextInt();
//        List<Customer> arr = new ArrayList<>();
//        for (int i = 0; i < count; i++) {
//            int no = scanner.nextInt();
//            String s = scanner.nextLine();
//            Customer c = new Customer(no, s);
//            arr.add(c);
//        }
//        int max = 0;
//        int index = 0;
//        for (int i = 0; i < arr.size(); i++) {
//            if(arr.get(i).num > max) {
//                index = i;
//                max = arr.get(i).num;
//            }
//        }
//        String str = arr.get(index).name;
//        System.out.println(str.substring(1));
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<Character> set = new ArrayList<>();
        char n;
        int j = 1;
        int g = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            n = str.charAt(i);
            if (g == 0) {
                set.add(n);
                System.out.println(n);
            }
            if(str.charAt(i) != str.charAt(j)) {
//                set.add(n);
                g = 0;
            }
            else {
                g = 1;
            }
            j++;
        }
        if(g == 0) {
            n = str.charAt(str.length() - 1);
            System.out.println(n);
            set.add(n);
        }
//        System.out.println(set);
        for (int i = 0; i < set.size(); i++) {
            System.out.print(set.get(i));
        }
    }
}
