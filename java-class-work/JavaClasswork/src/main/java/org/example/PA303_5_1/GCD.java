package org.example.PA303_5_1;

public class GCD {
    // Recursive method to return gcd of a and b
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 60;
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd(num1, num2));
    }
}
