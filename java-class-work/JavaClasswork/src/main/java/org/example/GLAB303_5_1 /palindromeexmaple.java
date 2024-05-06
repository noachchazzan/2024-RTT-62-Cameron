import java.util.Scanner;

public class palindromeexmaple {
    public static void main(String[] args) {
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string or numbers to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for(int i = length-1; i>=0;i--){
            reverse += original.charAt(i);
        }
        if (original.equals(reverse)){
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}