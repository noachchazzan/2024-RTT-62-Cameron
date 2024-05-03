package org.example.PA303_2_2;
import java.io.*;
import java.util.*;

public class java_Stdin_and_Stdout_II {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int myInt1 = scanner.nextInt();
        double myDouble1 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline left-over from reading the double
        String myString = scanner.nextLine();
        scanner.close();
        System.out.println("String: "+myString);
        System.out.println("Double: "+myDouble1);
        System.out.println("Int: "+myInt1);



    }
}
