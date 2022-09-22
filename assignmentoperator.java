public class assignmentoperator
{
    public static void main (String[] args)
    {
        byte b;
        b = 25;
        System.out.println("primitive byte assignment= " +b);

        byte c = b;
        System.out.println("primitive byte assignment from another byte variable= " +b);

        int a = 23 + b;
        System.out.println("primitive int assignment from another variable " +a);

        short s = 45;
        int x = b;
        int y = s;
        System.out.println("implicit casting of byte to int - " +x);
        System.out.println("implicit casting of byte to int - " +y);

        int i = 10;
        i+= 10; //i = i+10
        System.out.println("Additional operator - " +i);

        i-= 10; //i = i-10
        System.out.println("Subtraction operator - " +i);

        i*= 10; //i = i*10
        System.out.println("Multiplication operator - " +i);

        i/= 10; //i = i/10
        System.out.println("Division operator - " +i);

        i%= 3; //i = i%3
        System.out.println("Remainder operator - " +i);

    }

}
