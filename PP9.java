/*Write a Java program to break an integer into a sequence of individual digits*/
import java.util.Scanner;
public class PP9
{
    public static void main (String[] args)
    {
        System.out.println("input : ");
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt(); // 190

        /*  int n1 = num % 10;
        int remainingNumber = num / 10;
        int n2 = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int n3 = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int n4 = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int n5 = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int n6 = remainingNumber % 10; */

        int n1 = num / 100000 % 10;
        int n2 = num / 10000 % 10;
        int n3 = num / 1000 % 10;
        int n4 = num / 100 % 10;
        int n5 = num / 10 % 10;
        int n6 = num % 10;

        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);

    }
}
