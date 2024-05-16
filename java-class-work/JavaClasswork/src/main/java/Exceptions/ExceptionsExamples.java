package Exceptions;

import java.util.Scanner;

public class ExceptionsExamples {
    private Scanner scanner = new Scanner(System.in);


    public int captureInput() {
        System.out.println("Enter an integer: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        try {
            array[11] = 5;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
