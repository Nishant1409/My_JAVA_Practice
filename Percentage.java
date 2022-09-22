/* Write a program to calculate the percentage of a given student in the CBSE board exam.
His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)
 */
import java.util.Scanner;
public class Percentage
{
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        float sub1 = sc.nextFloat();
        System.out.println("Marks of Subject 1:" +sub1);

        float sub2 = sc.nextFloat();
        System.out.println("Marks of Subject 2:" + sub2);

        float sub3 = sc.nextFloat();
        System.out.println("Marks of Subject 3:" + sub3);

        float sub4 = sc.nextFloat();
        System.out.println("Marks of Subject 4:"+ sub4);

        float sub5 = sc.nextFloat();
        System.out.println("Marks of Subject 5:"+ sub5);

        float percentage = (((sub1 + sub2 + sub3 + sub4 + sub5) / 500 )*100);

        /*float sub1 = sc.nextFloat();
        float sub2 = sc.nextFloat();
        float sub3 = sc.nextFloat();
        float sub4 = sc.nextFloat();
        float sub5 = sc.nextFloat();
        System.out.println("All marks:"+ sub1 + "," + sub2 + "," +  sub3 + "," +  sub4 + "," + sub5);
        float percentage = (((sub1 + sub2 + sub3 + sub4 + sub5) / 500 )*100);*/
        System.out.println(" percentage = "+ percentage);
    }
}
