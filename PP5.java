// Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
import java.util.Scanner;
public class PP5
{
    public static void main (String[] args)
    {
        System.out.println("input");
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt(); // 190

        /* int firstDigit = num % 10; // 0
        int remainingNumber = num / 10; // 19
        int SecondDigit = remainingNumber % 10; // 19 % 10 = 9
        remainingNumber = remainingNumber / 10; // 19 / 10 = 1
        int thirdDigit = remainingNumber % 10; // 1 % 10 = 1
        remainingNumber = remainingNumber / 10; // 1 /10 = 0
        int fourthDigit = remainingNumber % 10; // 0 % 10 = 0
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;*/
        int n1 = num / 100000 % 10;
        int n2 = num / 10000 % 10;
        int n3 = num / 1000 % 10;
        int n4 = num / 100 % 10;
        int n5 = num / 10 % 10;
        int n6 = num % 10;
        int sum = (n1 + n2 + n3 + n4 + n5 + n6);

        System.out.println("The sum of all digits in " + num + " is " + sum);


    }

}
