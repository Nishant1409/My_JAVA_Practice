// Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;
public class PP4
{
    public static void main (String[] args)
    {
        System.out.println("input");
        Scanner sc = new Scanner(System.in);

        float r = sc.nextInt();
        System.out.println(r);


        double p = Math.PI  * 2 * r;
        double a = Math.PI * r * r ;
        System.out.println("perimeter = "+ p);
        System.out.println("area= " + a );



    }
}
