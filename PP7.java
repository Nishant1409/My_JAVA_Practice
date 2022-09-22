/*Write a Java program to display the speed, in meters per second, kilometers per hour and miles per hour.
User Input : Distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds).
Note : 1 mile = 1609 meter*/

import java.util.Scanner;
public class PP7
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float dist = sc.nextFloat();
        System.out.println("Input distance in meters:" + dist);

        float hrs = sc.nextFloat();
        System.out.println("Input hour:" + hrs);

        float mins = sc.nextFloat();
        System.out.println("Input minutes:" + mins);

        float secs = sc.nextFloat();
        System.out.println("Input seconds:"+ secs);

        float Mps = dist / (((hrs *3600) +(mins * 60) + (secs)));
        float kmh = (dist / 1000) / (((hrs) + (mins / 60) + (secs / 3600)));
        float mileshr = (dist / 1609) / (((hrs) + (mins / 60) + (secs / 3600)));

        System.out.println("Your speed in meters/seconds:" +Mps);
        System.out.println("Your speed in km/hr:" + kmh);
        System.out.println("Your speed in  miles/hr:" + mileshr);
    }
}
