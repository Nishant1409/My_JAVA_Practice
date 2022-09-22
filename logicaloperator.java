public class logicaloperator
{
    public static void main (String[] args)
    {
        int a = 10, b = 20, c = 20, d = 0;// initializing variables
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);

        if ((a < b) && (b == c))
    {
        d = a + b + c;
        System.out.println("The sum is: " + d);

    }
    else
        System.out.println("False conditions");

        a = 10;
        b = 1;
        c = 10;
        d = 30;

        if (a > b || c == d)
        System.out.println("One or both" + " the conditions are true");
        else
        System.out.println("Both the" + "conditions are false");
    }



}
