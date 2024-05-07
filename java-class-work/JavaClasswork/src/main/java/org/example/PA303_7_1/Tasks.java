package org.example.PA303_7_1;
import java.util.Arrays;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        int[] array1 = {1, 2, 3};
        for (int num : array1) {
            System.out.println("Task 1 - Array element: " + num);
        }

        // Task 2
        int[] array2 = {13, 5, 7, 68, 2};
        System.out.println("Task 2 - Middle element is: " + array2[array2.length / 2]);

        // Task 3
        String[] array3 = {"red", "green", "blue", "yellow"};
        System.out.println("Task 3 - Array length: " + array3.length);
        String[] array4 = array3.clone();
        System.out.println("Cloned Array: " + Arrays.toString(array4));

        // Task 4
        int[] array5 = {1, 2, 3, 4, 5};
        System.out.println("Task 4 - First element: " + array5[0]);
        System.out.println("Last element: " + array5[array5.length - 1]);
        try {
            System.out.println(array5[array5.length]); // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException as expected!");
        }

        // Task 5
        int[] array6 = new int[5];
        for (int i = 0; i < array6.length; i++) {
            array6[i] = i;
        }
        System.out.println("Task 5 - Array: " + Arrays.toString(array6));

        // Task 6
        int[] _6a = new int[5];
        for (int i = 0; i < _6a.length; i++) {
            _6a[i] = i * 2;
        }
        System.out.println("Task 6 - Array: " + Arrays.toString(_6a));

        // Task 7
        int[] array7 = {0, 1, 2, 3, 4};
        System.out.print("Task 7 - Array except middle: ");
        for (int i = 0; i < array7.length; i++) {
            if (i != 2) {
                System.out.print(array7[i] + " ");
            }
        }
        System.out.println();

        // Task 8
        String[] array8 = {"string1", "string2", "string3", "string4", "string5"};
        String temp = array8[0];
        array8[0] = array8[2];
        array8[2] = temp;
        System.out.println("Task 8 - Modified Array: " + Arrays.toString(array8));

        // Task 9
        int[] array9 = {4, 2, 9, 13, 1, 0};
        Arrays.sort(array9);
        System.out.println("Task 9 - Array in ascending order: " + Arrays.toString(array9));
        System.out.println("The smallest number is " + array9[0]);
        System.out.println("The biggest number is " + array9[array9.length - 1]);

        // Task 10
        Object[] array10 = {42, "Hello", "World", "Java", 3.14};
        System.out.println("Task 10 - Mixed Array: " + Arrays.toString(array10));

        // Task 11
        System.out.print("How many favorite things do you have? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline
        String[] favorites = new String[count];
        for (int i = 0; i < favorites.length; i++) {
            System.out.print("Enter your thing: ");
            favorites[i] = scanner.nextLine();
        }
        System.out.println("Your favorite things are: " + Arrays.toString(favorites));

        scanner.close();
    }
}
