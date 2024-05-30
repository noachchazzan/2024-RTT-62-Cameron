package R303;
import javax.xml.crypto.Data;
import java.lang.*;
import java.nio.channels.ScatteringByteChannel;
import java.util.*;
import java.io.*;
import java.lang.*;

// Generics allow you to create calsses, interfaces and methods with a placeholder
// for the type they operate on. This provides type safety and eliminates the need for  casting.

class GenericBox<T> {
    private T content;
    public T getContent() {
        return content;
    }
    public void setContent(T content) {
        this.content = content;
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
// An interface is a completely abstract class that is used to group related methods with empty bodies
interface example1 {
    void method1();
    void method2();
    void method3();
}

class example2 implements example1 {
    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }

    @Override
    public void method3() {
        System.out.println("Method 3");
    }
}
// Super class
abstract class Animal {
    // fields
    protected String name;
    public abstract void sleep(); // Abstract method no implementation
    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        System.out.println("Animal constructor called!");
    }

    // Method
    public void eat() {
        System.out.println(name + " is eating");
    }

    public void makeSound() {
        System.out.println("Animal makes a sound while making a sound");
    }
}
class Dog extends Animal {
    // Additional field for subclass
    private String breed;
    public Dog(){
        super(); // Call the constructor of the superclass
        System.out.println("Dog constructor called!");
    }
    // Constructor
    public Dog(String name, String breed) {
        super(name); // Call the constructor of the superclass
        this.breed = breed;
    }

    // Implementation of the abstract method of the superclass
    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    // Additional method for subclass
    public void bark() {
        System.out.println(name + " is barking");
    }
    // Overriding method
    @Override
    public void eat() {
        super.eat(); // Call the eat method of the superclass
        System.out.println(name + " is eating dog food!");
    }
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }

    public void wagTail() {
        System.out.println(name + " is wagging tail");
    }
}
class Person {
    // Private fields
    private String name;
    private int age;

    // Public getter and setter methods to access and uupdate the private fields
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int aAge) {
        if(age > 0) {
            this.age = aAge;
        } else {System.out.println("Age cannot be negative");}
    }
}
// Method overloading example
class Calculator{
    // Method overloading with different parameter lists
    // method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }
    // Method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }
}

class Car {
    // Fields (properties)
    private String color; // Accessible only with this class
    protected String model; // Accesssible within the same package or subclasses
    int year; // Accessible within the same package (default access)
    String name = "Noach";

    public Car() {
    }

    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Methods (Behaviors)
    public void startEngine() {
        System.out.println("Engine started");
    }

    void stopEngine() {
        System.out.println("Engine stopped");
        this.secretFeature();
    }

    // Private method
    private void secretFeature() {
        System.out.println("This is a secret feature");
    }

}

class Person2 implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person {name=" + name + ", age=" + age + "}";
    }
}
public class core
{
    // Creating an objects of the Car class
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("Red");
        car1.setModel("Toyota");
        car1.setYear(2020);

        Car car2 = new Car("Red", "Ford", 2030);

        // Accessing fields and methods
        System.out.println("Car color: " + car1.getColor());
        System.out.println("Car model: " + car1.getModel());
        System.out.println("Car year: " + car1.getYear());
        car1.startEngine();
        car1.stopEngine();

        // Cannot access private field directly
        // System.out.println("Car color: " + car1.color);
        // System.out.println("Car model: " + car1.model);
        // System.out.println("Car year: " + car1.year);

        System.out.println("Car color: " + car2.getColor());
        System.out.println("Car model: " + car2.getModel());
        System.out.println("Car year: " + car2.getYear());
        // Accessing public method
        car2.startEngine();
        car2.stopEngine();
        // Accessing protected field
        System.out.println("Car model: " + car2.model);
        // Cannot access private method directly
        // car1.secretFeature();
        // car2.secretFeature();

        // Accessing default field
        System.out.println("Car name: " + car1.name);
        System.out.println("Car name: " + car2.name);

        // Method overloading
        Calculator calc = new Calculator();
        System.out.println(calc.add(1, 2));
        System.out.println(calc.add(1, 2, 3));
        System.out.println(calc.add(1.0, 2.0));

        Person noach = new Person();
        // Using setter methods to set the values
        noach.setName("Noach");
        noach.setAge(30);
        // Using getter methods to get the values
        System.out.println("Name: " + noach.getName());
        System.out.println("Age: " + noach.getAge());

        // Creating an objects of the Person class
        Person person1 = new Person();
        person1.setName("Noach");
        person1.setAge(20);

        Person person2 = new Person();
        person2.setName("Noach");
        person2.setAge(20);

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        Person person3 = new Person();
        person3.setName("Noach");

        // CREATING an instance of the Dog class
        Dog myDog = new Dog("Rocky","Pitbull");
        // Accessing methods from the superclass
        myDog.eat();
        // Accessing methods from the subclass
        myDog.bark();

        // Upcasting example which is done implicitly and is safe
        Animal animal = new Dog("Rocky","Pitbull"); // Upcasting
        animal.makeSound(); // Outputs: Dog is barking
        // animal.wagTail(); // Compilation error, cannot find symbol

        // Downcasting is not type safe and requires explicit casting.
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcasting
            dog.wagTail(); // Outputs: Dog is wagging tail
            dog.wagTail(); // Outputs: Dog is wagging tail
        }
        // Interface examples
        example1 myInterfaceExample = new example2();
        myInterfaceExample.method1();
        myInterfaceExample.method2();
        myInterfaceExample.method3();
        /*
        Key Points
Polymorphism:
Allows methods to do different things based on the object it is acting upon.
Compile-time polymorphism is achieved by method overloading.
Runtime polymorphism is achieved by method overriding.
Object Type Casting:
Upcasting is converting a subclass type to a superclass type.
Downcasting is converting a superclass type to a subclass type.
Abstraction:
Hides the implementation details and shows only the essential features.
Achieved using abstract classes and interfaces.
Interfaces:
Define methods that must be implemented by any class that implements the interface.
Promote the use of multiple inheritances since a class can implement multiple
interfaces.
         */

        GenericBox<String> stringGenericBox = new GenericBox<>(); // GenericBox<String> allows for type saftey
        stringGenericBox.setContent("Hello");
        System.out.println(stringGenericBox.getContent());
        GenericBox<Integer> integerGenericBox = new GenericBox<>(); // GenericBox<Integer> allows for type saftey
        integerGenericBox.setContent(10);
        System.out.println(integerGenericBox.getContent());


        List<String> list = new ArrayList<>();
        // Adding elements
        list.add("Hello");
        list.add("World");
        list.add("Noach");
        list.add("Hello");

        // accessing elements
        System.out.println(list.get(1));
        System.out.println(list.toString());
        // iterate through the list
        for(String i : list) {
            System.out.println(i);
        }
        // remove an element
        list.remove("Hello");
        System.out.println(list.toString());
        System.out.println(list);


        // Linked list
        LinkedList<String> linkedList = new LinkedList<>();
        // Adding elements
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("Noach");
        linkedList.add("Hello");
        linkedList.addFirst("2");
        linkedList.addLast("3");
        // accessing elements
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.toString());
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        // iterate through the list
        for(String i : linkedList) {
            System.out.println(i);
        }
        // remove an element
        linkedList.remove("Hello");
        linkedList.removeFirst();

        // iterate through the list
        for (String x : linkedList) {
            System.out.println(x);
        }

        System.out.println(linkedList.toString());
        System.out.println(linkedList);


        // Vector
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("World");
        vector.add("!");
        System.out.println("First element: "+vector.firstElement());
        // remove an element
        vector.remove("Hello");
        // iterate through the list
        for (String string : vector) {
            System.out.println(string);
        }

        // Maps
        // HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        // adding key-value pairs
        hashMap.put("key1", 1);
        hashMap.put("key2", 2);
        hashMap.put("key3", 3);
        // accessing values
        System.out.println(hashMap.get("key1"));

        // iterating through
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println(hashMap.toString());


        // TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        // adding key-value pairs
        treeMap.put("key1", 1);
        treeMap.put("key2", 2);
        treeMap.put("key3", 3);
        // accessing values
        System.out.println(treeMap.get("key1"));

        // iterating through
        for(Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println(treeMap.toString());

        // LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        // adding key-value pairs
        linkedHashMap.put("key1", 1);
        linkedHashMap.put("key2", 2);
        linkedHashMap.put("key3", 3);
        // accessing values
        System.out.println(linkedHashMap.get("key1"));
        // iterating through
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        // REMOVE k-v pair
        linkedHashMap.remove("key2");
        System.out.println(linkedHashMap);

        // Sets A Set is a collection that cannot contain duplicate elements. Common implementations
        //include HashSet, TreeSet, and LinkedHashSet.\

        Set<String> Hset = new HashSet<>();
        Hset.add("Apple");
        Hset.add("Orange");
        Hset.add("Banana");
        Hset.add("Pear");
        // Iterating through the set
        for (String fruit : Hset){
            System.out.println(fruit);
        }
        // Removing an element
        Hset.remove("Apple");
        System.out.println(Hset.toArray());
        // TreeSet
        TreeSet<String> Tset = new TreeSet<>();
        Tset.add("Apple");
        Tset.add("Orange");
        Tset.add("Banana");
        Tset.add("Pear");
        Tset.add("Apple"); // Duplicate element won't be added
        for (String fruit : Tset) {
            System.out.println(fruit);
        }
        // Accessing elements
        System.out.println(Tset.first());
        System.out.println(Tset.last());
        // Removing an element
        Tset.remove("Apple");
        System.out.println(Tset.toString());

        // LinkedHashSet: LinkedHashSet is a hash table and linked list implementation of the Set interface, with
        //predictable iteration order. It maintains a doubly-linked list running through all of its entries, in
        //the order in which they were inserted.

        LinkedHashSet<String> LHset = new LinkedHashSet<>();
        LHset.add("Apple");
        LHset.add("Orange");
        LHset.add("Banana");
        LHset.add("Pear");
        LHset.add("Apple"); // Duplicate element
        LHset.add("Mango");

        for (String fruit : LHset) {
            System.out.println(fruit);
        }

        Iterator<String> iterator = LHset.iterator();

        // Iterate over the elements int eh set using the iterator
        while (iterator.hasNext()){
            String ele = iterator.next();
            System.out.println(ele);
            if(ele.equals("Apple")){
                iterator.remove();
            } else if(ele.equals("Orange")){
                iterator.remove();
            }
        }
        System.out.println("After removal: " + LHset.toString());
        for (String item : LHset) {
            System.out.println(item);
        }
        /* Generics:
Provide type safety by allowing classes, interfaces, and methods to operate on specified
types.
Eliminate the need for casting and help catch errors at compile time.
Lists:
Ordered collections that can contain duplicate elements.
Common implementations include ArrayList, LinkedList, and Vector.
Maps:
Object that maps keys to values, cannot contain duplicate keys.
Common implementations include HashMap, TreeMap, and LinkedHashMap.
Sets:
Collections that cannot contain duplicate elements.
Common implementations include HashSet, TreeSet, and LinkedHashSet.*/
        // Using generics with collections
        List<String> Slist = List.of("Apple", "Orange", "Banana", "Pear");
        List<Integer> Ilist = List.of(1, 2, 3, 4);
        System.out.println("String List:");
        System.out.println(Slist.toString());
        System.out.println("Integer List:");
        //System.out.println(Ilist.toString());
        printList(Ilist);
        // Nested List Example
        List<List<String>> nestedList = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Orange");
        List<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Pear");
        nestedList.add(list1);
        nestedList.add(list2);
        System.out.println(nestedList.toString());
        for(List<String> fruit : nestedList) {
            for(String item : fruit) {
                System.out.println(item);
            }
        }
        // Key Concepts
        //● Exception: An event that disrupts the normal flow of the program.
        //● Checked Exception: Exceptions that are checked at compile-time (e.g., IOException,
        //SQLException).
        //● Unchecked Exception: Exceptions that are checked at runtime (e.g.,
        //ArithmeticException, NullPointerException).
        //● Error: Serious problems that a reasonable application should not try to catch (e.g.,
        //OutOfMemoryError).
        //Exception Handling Keywords
        //● try: The block of code to monitor for exceptions.
        //● catch: The block of code to handle exceptions.
        //● finally: The block of code to execute after try and catch blocks, regardless of whether an
        //exception was thrown.
        //● throw: Used to explicitly throw an exception.
        //● throws: Used in method signatures to declare exceptions that can be thrown by the
        //method.
        // Exception Handling
        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[3]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: "+ e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This will always be printed");
        }
        // Nested Try-Catch Blocks
        try {
            try {
                int result = 10/0; // This will throw an ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: "+ e);
        } finally {
            System.out.println("This will always be printed");
        }
        // Throwing Exceptions
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println(e);
        }
        // Custom Exceptions
        try {
            validate(15);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        // multiple exceptions propagate up the call stack using throws keyword in method signatures
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Handling multiple exceptions in java 7 and later
        try {
            int[] nums1 = {1, 2,3};
            System.out.println(nums1[3]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("This will always be printed");
        }

        // Try with resources statement makes sure and ensures that each resoruce is closed at the
        // end of the statement.
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            String line;
            while ((line=br.readLine())!=null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // Key Points
        //try: Block to monitor for exceptions.
        //catch: Block to handle exceptions.
        //finally: Block that always executes after try-catch.
        //throw: Used to explicitly throw an exception.
        //throws: Used in method signatures to declare exceptions.


        // IO/NIO
        File file = new File("example.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("File is created! " + file.getName());
            } else {System.out.println("File already exists.");}
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
            e.printStackTrace();
        }
        // file.delete(); deleted a file

        // Reading and writing text files
        try {
            FileWriter fw = new FileWriter("example.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            out.println("This is a test");
            out.close();
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
            e.printStackTrace();
        }
        // Reading and writing binary files
        try {
            FileOutputStream fos = new FileOutputStream("example.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("This is a test");
            oos.close();
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
            e.printStackTrace();
        }

        // Writting to a file
        String file2 = "example2.txt";
        try (FileWriter fw = new FileWriter(file2)) {
            fw.write("This is a test");
            fw.write("\nThis is another test");
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
            e.printStackTrace();
        }
        // Reading from a file
        try (FileReader reader = new FileReader(file2)) {
            int character;
            while ((character = reader.read())!=-1){
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
            e.printStackTrace();
        }

        // writing binary files
        String bfile = "example.dat";
        try(FileOutputStream fos = new FileOutputStream(bfile)) {
            fos.write(new byte[]{1,2,3});
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
            e.printStackTrace();
        }
        // Reading from a binary file
        try(FileInputStream fis = new FileInputStream(bfile)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.println(byteData + " ");
            }
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
            e.printStackTrace();
        }

        String filename = "Example.dat";
        // Writing primitive data types to a binary file
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filename))) {
            dataOutputStream.writeInt(10);
            dataOutputStream.writeDouble(10.5);
            dataOutputStream.writeBoolean(true);
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
            e.printStackTrace();
        }
        // Reading primitive data types from a binary file
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filename))) {
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readBoolean());
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
            e.printStackTrace();
        }

        String fName = "person2.dat";
        // Writing an object to a file
        try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(fName))) {
            Person2 person = new Person2("John", 30);
            oss.writeObject(person);
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
            e.printStackTrace();
        }

        // Reading an object rom a file
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fName))) {
            Person2 person = (Person2) ois.readObject();
            System.out.println("Read object: " + person);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }











    }

    static void method1() throws Exception {
        method2();
    }   static void method2() throws Exception {
        method3();
    }   static void method3() throws Exception {
        throw new Exception("Exception caught in method3");
}
    static void checkAge(int age) throws Exception {
    if (age < 18) {
        throw new Exception("You are not old enough to vote");
    } else {
        System.out.println("You are old enough to vote");
    }
}
    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }
    static void validate(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("You are not old enough to vote");
        } else {
            System.out.println("You are old enough to vote");
        }
    }
}
final class FinalClass {
    // Class cannot be subcalssed
    final int x = 0; // constant int
    public FinalClass() {
        System.out.println("This is a final class");
    }
    public int getX() {
        return x;
    }
    public final void finalMethod(){
        // Method cannot be overridden
        System.out.println("This is a final method");
    }
    @Override
    public String toString() {
        return "FinalClass{" +
                "x=" + x +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinalClass that = (FinalClass) o;
        return getX() == that.getX();
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getX());
    }
}
