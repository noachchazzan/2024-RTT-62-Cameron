package KB1;
// package org.example;

public class KBA1Review {

    private Integer x; // Example of a class variable (available throughout the class)

    public KBA1Review() {
        // Constructor: No return type and is named the same as the class.
    }

    public static void main(String[] args) {
        // Array creation examples
        int[] arr = new int[12]; // Declaration and instantiation in one line
        int[] arr1;
        arr1 = new int[12]; // Separate declaration and instantiation

        // Autoboxing example (automatic conversion from int to Integer)
        Integer autoBoxed = 5;

        // String (immutable) vs StringBuffer (mutable)
        String immutableString = "Initial";
        StringBuffer mutableString = new StringBuffer("Initial");
        mutableString.append(" Changed"); // Demonstrates mutability

        // IS-A relationship example
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle instanceof Shape); // Should print true

        // Truncation example
        double d = 9.97;
        int truncated = (int) d; // Becomes 9, decimal removed

        // Local variable vs Class variable
        int localVariable = 10; // Only accessible within this method

        // Method overloading demonstrated with printOutput methods below

        // Protected access modifier example handled in a separate class (below)

        // Increment operators
        int y = 5;
        System.out.println(++y); // Pre-increment: prints 6
        System.out.println(y++); // Post-increment: prints 6, but y becomes 7 next

        // Modulo operator example
        System.out.println(10 % 3); // Prints 1 (remainder of 10 divided by 3)

        // Continue and break in a loop
        for (int i = 0; i < 10; i++) {
            if (i == 5) continue; // Skip the rest of the loop when i is 5
            if (i == 8) break; // Exit the loop when i is 8
            System.out.println(i);
        }

        // Correctly creating objects
        Object o = new Object();
        String s = new String("Example");

        // Booleans
        boolean bt = true;
        boolean bf = false;
        if (bt && !bf) { // Using booleans in conditions
            System.out.println("Boolean logic verified.");
        }

        // Print outputs using overloaded methods
        String a = "AFTER";
        String b = "BETA";
        String c = "CAPTURE";
        printOutput(a + b + c);
        printOutput(a, b, c);
    }

    public static void printOutput(String output) {
        System.out.println(output.toLowerCase());
    }

    public static void printOutput(String a, String b, String c) {
        System.out.println(a + b + c);
    }
}

class Rectangle extends Shape {
    // Rectangle IS-A Shape
}

class Shape {
    // Base class to demonstrate IS-A relationship
}

class DerivedClass extends KBA1Review {
    // Can access protected members of KBA1Review if needed
}

