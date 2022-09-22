public class incrementdecrement
{
    public static void main(String[] args)
    {
        int a = 8;
        int preincrement = ++a;
        System.out.println(preincrement);

        int postincrement = a++;
        System.out.println(postincrement);
        System.out.println(a);


        int predecrement = --a;
        System.out.println(predecrement);

        int postdecrement = a--;
        System.out.println(postdecrement);
        System.out.println(a);

    }
}

