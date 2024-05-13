package GLAB303_10_1;

public class Person {
    String name;
    static int lifeSpan = 60;
    static double ageFactor = 1.0;

    public Person() {
        name = "";
    }

    public Person(String aName) {
        name = aName;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public String talk() {
        return "I have nothing to say."; // Ensure this is a semicolon at the end.
    }

    public String walk() {
        return "I have nowhere to go."; // Ensure this is a semicolon at the end.
    }

    public static double lifeSpan() {
        return lifeSpan * ageFactor; // Parentheses around (lifeSpan * ageFactor) are fine, but not needed.
    }

    public String toString() {
        return "Hello, my name is " + name; // Ensure this is a semicolon at the end.
    }
}
