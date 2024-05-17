package PA303_11_1;
import java.util.*;
import java.io.*;

public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial number of elements
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        // Read the number of queries
        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            String queryType = scanner.next();
            if (queryType.equals("Insert")) {
                //list.add(scanner.nextInt(), scanner.nextInt()); NOT BEST PRACTICE or even RIGHT!
                int index = scanner.nextInt();
                ;
                int value = scanner.nextInt();
                list.add(index, value);
            } else if /*(scanner.next().equals("Delete"))*/ (queryType.equals("Delete")) {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }
        // Print the list as a single line of space-seperated integers
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }

    }
}