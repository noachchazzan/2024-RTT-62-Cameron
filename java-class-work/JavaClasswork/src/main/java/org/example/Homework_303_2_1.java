package org.example;

public class Homework_303_2_1 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 20;

        int sum = var2 + var1;
        System.out.println(sum);

        double d1 = 111.1111d;
        double d2 = 222.222d;

        System.out.println(d1+d2);

        int x1 = 30;
        double y1 = 50.55d;
        double sum1 = x1 + y1;
        System.out.println(sum1);

        /* Write a program that declares two integer variables, assigns an integer to each, and divides the larger number
        by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number to a
        decimal. What happens? What corrections are needed? */
        int val1 = 8;
        int val2 = 10;
        double div1 =  (val2/val1);
        System.out.println(div1);

        /* Write a program that declares two double variables, assigns a number to each, and divides the larger by the
        smaller number. Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again. */
        double d3 = 1.11;
        double d4 = 2.22;

        double result0 = d4/d3;
        System.out.println(result0);
        System.out.println((int)result0);
        /* Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
         Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again. */
        int x = 5;
        int y = 6;

        double q = y/x;
        System.out.println(q);
        q = (double)y;
        System.out.println(q);
        /* Write a program that declares a named constant and uses it in a calculation. Print the result. */
        final int X = 10;
        int sumC = X + X;
        System.out.println(sumC);
        /* Write a program where you create three variables that represent products at a cafe. The products could be
        beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. Create two more
        variables called subtotal and totalSale and complete an “order” for
        three items of the first product, four items of the second product, and two items of the third product.
        Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the
        subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places. */
        double coffee = 5.99;
        double espresso = 7.99;
        double green_tea = 2.99;

        double subtotal = coffee*(3) + espresso*(4) + green_tea*(2);
        double totalSale;
        final double SALES_TAX = 0.07;
        totalSale = subtotal + (subtotal*SALES_TAX);
        String formattedTotalSale = String.format("%.2f", totalSale);
        System.out.println(formattedTotalSale);
    }
}
