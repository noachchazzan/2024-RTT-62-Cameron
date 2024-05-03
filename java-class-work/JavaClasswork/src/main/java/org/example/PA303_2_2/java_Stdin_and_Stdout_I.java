package org.example.PA303_2_2;

import java.io.*;
import java.util.*;

public class java_Stdin_and_Stdout_I  {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        //String myString = scanner.next();
        int myInt1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        scanner.close();
        System.out.println(myInt1);
        System.out.println(n2);
        System.out.println(n3);

    }
}

