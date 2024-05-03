package org.example.PA303_2_3;

public class Operators_Numbers {
    public static void main(String[] args) {

        // 1
        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1; // Left shift x by 1, which multiplies c by 2.
        // decimal value: 4; binary string: 100 (binary for decimal value)
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        int a = 9;
        System.out.println(Integer.toBinaryString(a));
        a = a << 1;
        System.out.println("Decimal value after left shift: " + a);
        System.out.println("Binary string after left shift: " + Integer.toBinaryString(a));
        int b = 17;
        System.out.println(Integer.toBinaryString(b));
        b = b << 1;
        System.out.println("Decimal value after left shift: " + b);
        System.out.println("Binary string after left shift: " + Integer.toBinaryString(b));

        int c = 88;
        System.out.println(Integer.toBinaryString(c));
        c = c << 1;
        System.out.println("Decimal value after left shift: " + c);
        System.out.println("Binary string after left shift: " + Integer.toBinaryString(c));

        // 2
        int x2 = 150;
        System.out.println(Integer.toBinaryString(x2)); // Prints out the binary string version of the number
        x2 = x2 << 2; // shifted by 2 and assigned to x aka x2
        System.out.println("Decimal value after right shift by 2" + x2); // i think its multipied by 4 and here is decimal value
        System.out.println("Binary string after left shift: " + Integer.toBinaryString(x2));

        int a1 = 225;
        System.out.println(Integer.toBinaryString(a1));
        a1 = a1 << 2;
        System.out.println("Decimal value after right shift by 2" + a1);
        System.out.println("Binary string after left shift: " + Integer.toBinaryString(a1));
        int b1 = 1555;
        System.out.println(Integer.toBinaryString(b1));
        b1 = b1 << 2;
        System.out.println("Decimal value after right shift by 2" + b1);
        System.out.println("Binary string after left shift: " + Integer.toBinaryString(b1));
        int c1 = 32456;
        System.out.println(Integer.toBinaryString(c1));
        c1 = c1 << 2;
        System.out.println("Decimal value after right shift by 2" + c1);
        System.out.println("Binary string after left shift: " + Integer.toBinaryString(c1));


        // 3
        int x3 = 7;
        int y = 17;

        // idk what the result of bitwise and operation on x and y wil be

        int z = x & y;
        System.out.println(z); // decimal
        System.out.println(Integer.toBinaryString(z)); // binary

        // 4
        System.out.println(x|y); // decimal - true or 1
        System.out.println(Integer.toBinaryString(x|y)); // binary - 1
        // 5
        int val1 = 2;
        System.out.println(val1);
        val1++;
        System.out.println(val1);
        // 6
        int val2 = 0;
        System.out.println(val2);
        val2++;
        System.out.println(val2);
        ++val2;
        System.out.println(val2);
        val2 = val2 + 1;
        System.out.println(val2);
        // 7
        int x4 = 5; int y2 = 8;
        int sum = y2 + ++x4;
        System.out.println(sum);
        sum = y2 + ++x4;
        /* The first configuration incremented x, and then calculated the sum, while
        the second configuration calculated the sum, and then incremented x.*/
        System.out.println(sum); // value is 15
    }
}
