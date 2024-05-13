package PA303_9_1;
/* Write the following code in your editor below:

A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic.
Your classes should not be be .

Input Format

You are not responsible for reading any input from stdin; a locked code stub will test your submission by calling the add method on an Adder object and passing it  integer parameters.

Output Format

You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.

Sample Output

The main method in the Solution class above should print the following:

My superclass is: Arithmetic
42 13 20
*/

import java.io.*;
import java.util.*;
class Arithmetic {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
// Adder.java
class Adder extends Arithmetic {
    // Inherits the add method from Arithmetic
}
public class JavaInheritanceII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Adder myAdder = new Adder();
        //int sum = myAdder.add(42,13); // Using the add method from Arithmetic through adder
        System.out.println("My superclass is: "+myAdder.getClass().getSuperclass().getSimpleName());
        System.out.println(myAdder.add(0,42) +" "+myAdder.add(1,12)+" "+myAdder.add(10,10));
    }
}