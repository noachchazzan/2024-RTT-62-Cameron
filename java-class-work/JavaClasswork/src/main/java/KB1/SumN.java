package KB1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SumN {
    public static void main(String[] args) {
        System.out.println(Result.getDigitsSum(967532));
    }
}

class Result {

    /*
     * Complete the 'getDigitsSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER largeNumber as parameter.
     */

    public static int getDigitsSum(int largeNumber) {
        int sum = 0;
        String str = String.valueOf(largeNumber);
        for (int i = 0; i < str.length(); i++) {
            //System.out.print(Integer.valueOf(str.charAt(i)));
            // System.out.print(Integer.valueOf(str.charAt(i)));
            //foSystem.out.print(Integer.parseInt(String.valueOf(str.charAt(i))));
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }

}
