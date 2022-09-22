import java.util.Scanner;

public class userinput
{
    public static void main (String[] args)
    {
        System.out.println("Input from user");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println(x);

        int y = sc.nextInt();
        System.out.println(y);

        System.out.println("x + y = " + (x + y));


    }
}
