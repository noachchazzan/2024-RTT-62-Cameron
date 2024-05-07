package org.example.PA303_7_1;
import java.util.Random;
import java.util.Arrays;

public class HomeworkArrays {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array2 = {random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10),
                random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10),
                random.nextInt(10), random.nextInt(10)};
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array2);
        int max = array2[array2.length - 1];
        int min = array2[0];
        int sum = 0;
        double avg = 0.0;
        for (int i = 0; i < array2.length - 1; i++) {
            sum+=i;
        }
        avg = sum / array2.length;
        System.out.println("Sum: " + sum + "\nAverage: " + avg + "\nMin: " + min + "\nMax: " + max);
        System.out.println("Sorted array: " + Arrays.toString(array2));
    }
}
