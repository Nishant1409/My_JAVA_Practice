/* Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
take input from user*/

import java.util.Scanner;
public class PP3
{
    public static void main (String[] args)
    {
        System.out.println("give input ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(a);

        int b = sc.nextInt();
        System.out.println(b);

        System.out.println("addition = " + (a+b));
        System.out.println("subtraction = " + (a-b));
        System.out.println("division = " + (a/b));
        System.out.println("multiplication = " + (a*b));
        System.out.println(" mod = " + (a % b));

    }
}
