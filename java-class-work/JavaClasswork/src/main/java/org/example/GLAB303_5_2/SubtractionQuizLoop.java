package org.example.GLAB303_5_2;
import java.util.Scanner;
public class SubtractionQuizLoop {
    public static void main(String[] args) {
        final int N_QUESTIONS = 5;
        Scanner input = new Scanner(System.in);  // Initialize the scanner
        while (true) {
            int correctCount = 0; // Count the number of correct answers
            int count = 0; // Count the number of questions
            long startTime = System.currentTimeMillis();
            String output = ""; // Output string is initially empty
            while (count < N_QUESTIONS) {
                // 1. Generate two random single-digit integers
                int number1 = (int) (Math.random() * 10);
                int number2 = (int) (Math.random() * 10);
                // 2. If number1 < number2, swap number1 with number2
                if (number1 < number2) {
                    int temp = number1;
                    number1 = number2;
                    number2 = temp;
                }
                // 3. Prompt the student to answer "What is number1 - number2?"
                System.out.print("What is " + number1 + " - " + number2 + "? ");
                int answer = input.nextInt();
                // 4. Grade the answer and display the result
                if (number1 - number2 == answer) {
                    System.out.println("You are correct!");
                    correctCount++;
                } else {
                    System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
                }
                // Increase the count
                count++;
                output += "\n" + number1 + "-" + number2 + "=" + answer +
                        ((number1 - number2 == answer) ? " correct" : " wrong");
            }
            // After all questions are answered
            System.out.println("------------");
            System.out.println(output);
            System.out.println("Number of correct: " + correctCount);
            System.out.println("Number of wrong: " + (N_QUESTIONS - correctCount));
            System.out.println("Total time: " + (System.currentTimeMillis() - startTime) + " ms");
            System.out.println("Do you want to play again (0 for no or 1 for yes)? ");
            int replay = input.nextInt();
            if (replay == 0) {
                System.out.println("Thanks for playing!");
                break;  // Break the while loop to end the program
            }
            System.out.println("------------");
        }
        input.close();  // Close the scanner only once after the loop finishes
    }
}