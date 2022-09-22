import java.util.Scanner;
public class Quadratic_equation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        double r1;
        double r2;
        double real;
        float d = ((b*b) - (4*a*c));
        if(d>0)
        /*if d is greater than 0 then 2 different roots */
            /*if d is 0 then 2 similar roots
            if d is less than 0 then imaginary roots */
        {
            r1 = (-b + Math.sqrt(d)/2*a);
            r2 = (-b - Math.sqrt(d)/2*a);
            System.out.println("Root 1 = "+r1);
            System.out.println("Root 2 = "+r2);

        }
        else if(d==0)
        {
            real = (-b/(2*a));
            System.out.println("Root 1 = " +real);

        }
        else
        {
            System.out.println("root is imaginary");

        }
    }
}
