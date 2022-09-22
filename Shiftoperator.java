public class Shiftoperator
{
    public static void main (String[] args)
    {
        int number = 2;

        // 2 bit left shift operation
        int result = number << 2;
        System.out.println(result); //prints 8

        // 2 bit right shift operation
        int number1 = 8;
        int number2 = -8;

        System.out.println(number1 >> 2);  //prints 2
        System.out.println(number2 >> 2); //prints -2

        int number3 = 8;
        int number4 = -8;

        System.out.println(number3 >>> 2); //prints 2
        System.out.println(number4 >>> 2); //prints 1073741822
    }
}
