package GLAB303_11_5;
import java.util.TreeSet;
public class TreesetExampletwo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);
        // Using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);
        // Using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(0b101);
        numbers.add(7);
        System.out.println("TreeSet: " + numbers);
        // Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);
        // Using the last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);

        System.out.println("TreeSet: " + numbers);
    }
}