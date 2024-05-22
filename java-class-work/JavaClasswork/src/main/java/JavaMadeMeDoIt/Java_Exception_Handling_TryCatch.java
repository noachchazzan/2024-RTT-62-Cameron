package JavaMadeMeDoIt;
import java.io.*;
import java.util.*;


public class Java_Exception_Handling_TryCatch {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner cin = new Scanner(System.in);
        try {
            int num1 = cin.nextInt();
            int num2 = cin.nextInt();
            System.out.println(num1 / num2);
        }
        catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }

        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            cin.close();
        }
    }
}
