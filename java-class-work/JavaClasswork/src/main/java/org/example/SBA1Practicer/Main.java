package org.example.SBA1Practicer;

public class Main {
    public static void main(String[] args) {
        // you can use the s.charAt(pos) function
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        /*
        A
        B
        C
        D
        E
        F
        G
        ...
        */
        for (int i = 0; i < s.length();i++) {
            System.out.println(s.charAt(i));
        }
        // Part 2
        // Given the following Strings convert them to values
        // Integer.valueOf()
        String ten = "10";
        String hundred = "100";
        System.out.println(Integer.parseInt(ten)); System.out.println(Integer.parseInt(hundred));
        // Part 3
        // given an integer array find the sum of all the integers in the array
        int[] array = {2, 4, 6, 7, 8, 10};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            // System.out.println(array[i]);
            sum += array[i];
        } System.out.println(sum);

        // Part 4
        // given the array of string convert them to numbers and print the sum
        String[] nums = {"2", "4", "5", "6", "7", "8", "10"};
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Integer.valueOf(nums[i]));
            sum2 += Integer.valueOf(nums[i]);
        }
        System.out.println(sum2);

    }

}
