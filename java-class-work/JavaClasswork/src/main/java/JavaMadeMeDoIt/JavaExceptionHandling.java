package JavaMadeMeDoIt;

import java.io.*;
import java.util.*;
import java.lang.Math;

class MyCalculator {
    public static long power(int num1, int num2) throws Exception {
        if (num1 < 0 || num2 < 0) {
            throw new Exception("n or p should not be negative.");
        }
        if (num1 == 0 && num2 == 0) {
            throw new Exception("n and p should not be zero.");
        }
        return (long)Math.pow(num1, num2);
    }
}
public class JavaExceptionHandling{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner cin = new Scanner(System.in);

        while (cin.hasNextInt()) {
            int n1 = cin.nextInt();
            int n2 = cin.nextInt();
            try {
                long result = MyCalculator.power(n1, n2);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        cin.close();
    }
}