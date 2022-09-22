//Identify the logic behind the series
//        6 28 66 120 190 276....
//The numbers in the series should be used to create a Pyramid. The base of the Pyramid will be the widest
//and will start converging towards the top where there will only be one element. Each successive layer will have
//one number less than that on the layer below it. The width of the Pyramid is specified by an input parameter N.
//In other words there will be N numbers on the bottom layer of the pyramid.

//Construction Rules -
//> First number in the series should be at the top of the Pyramid.
//> Last N number of the series should be on the bottom-most layer of the Pyramid, with Nth number being the
//right-most number of this layer.
//> Numbers less than 5-digits must be padded with zeroes to maintain the sanctity of a Pyramid when printed.
//Have a look at the examples in next slide to get a pictorial understanding of what this rule actually means.

//If input is 2, output will be
//00006
//00028 00066
//If input is 3, output will be
//00006
//00028 00066
//00120 00190 00276
//
//Input Format:
//> First line of input will contain number N that corresponds to the width of the bottom-most layer of the Pyramid
//Output Format:
//1 > The Pyramid constructed out of numbers in the series | as per stated construction rules.
//Constraints:
//>0<N<= 14

import java.util.Scanner;
public class TCS1
{
    public static void main(String[] args)
    {
        int n, a = 0, b = 3, i, re, j;
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt ();
        for (i = 1;i<= n; i++)
        {
            for (j = 1; j<= 1; j++)
            {
                a = a + 2;
                if (i == 1)

                    b = 3;
                else
                    b = b + 4;
                re = a*b;

                System.out.println (re);
            }
            System.out.println();
        }
    }
}

