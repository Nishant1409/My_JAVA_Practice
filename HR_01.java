import java.io.*;
import java.util.*;
public class HR_01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(1<=n && n<=100)
        {
            if((n%2==1)||(n%2==0 && (6<=n && n<=20)))
            {
                System.out.println("Weird");
            }
            else if((n%2==0 && (2<=n && n<=5))||(n%2==0 && n>20))
            {
                System.out.println("Not Weird");
            }
            else
            {
                System.out.println("");
            }
        }
        else
        {
            System.out.println("");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
