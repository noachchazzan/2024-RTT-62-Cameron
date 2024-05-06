package org.example.PA303_4_1;

public class program3 {
    public static void main(String[] args) {
        int x = 15;
        if (x < 10) {
            System.out.println("x is less than 10");
        } else if(x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else if(x >= 20) {
            System.out.println("Greater than or equal to 20");
        }
        x = 5;
    }
}
