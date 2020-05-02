package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int sum;
        for (int i = 0; i <= s.size() - m; i++) {
            sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }
            System.out.print(sum + " ");
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> s = new ArrayList<>();

        int val;

        for (int i = 0; i < n; i++) {
            val = scanner.nextInt();
            s.add(val);
        }

        scanner.nextLine();

        int d = scanner.nextInt();
        int m = scanner.nextInt();

        int result = birthday(s, d, m);

        System.out.println(result);
    }
}

