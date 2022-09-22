//Write a Java program to compute body mass index (BMI).

import java.util.Scanner;
public class PP6
{
    public static void main (String[] args)
    {
        System.out.println("input");
        Scanner sc = new Scanner(System.in);

        float h = sc.nextFloat();
        System.out.println(h);

        float m = sc.nextFloat();
        System.out.println(m);

        float BMI = m / (h * h);
        System.out.println("The value of BMI is " + BMI);



    }
}
