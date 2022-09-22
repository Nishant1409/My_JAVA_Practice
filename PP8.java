/*Write a Java program that reads a number and display the square, cube, and fourth power.*/
import java.util.Scanner;
public class PP8
{
    public static void main (String[] args)
    {
        System.out.println("input : ");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        System.out.println(a);

        //a : this parameter is the base
        //b : this parameter is the exponent.
        //This method returns a^b.

        double Sqpow = Math.pow(a,2);
        double thirdpow = Math.pow(a,3);
        double fourthpow = Math.pow(a,4);
        System.out.println("square power "+ Sqpow);
        System.out.println("square power "+ thirdpow);
        System.out.println("square power "+ fourthpow);
    }
}
