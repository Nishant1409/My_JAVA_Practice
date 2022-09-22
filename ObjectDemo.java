public class ObjectDemo
{
    static String name;
    static int id;
    static double salary;

    public static void main (String[] args)
    {
        ObjectDemo objectexample = new ObjectDemo();

        objectexample.name = "Nishant Kambli";
        id = 007;
        objectexample.salary = 99000;
        System.out.println(name + "\n" + id +"\n"+ salary );

        /*ObjectDemo objectexample1 = new ObjectDemo();
        System.out.println(objectexample1.name);*/

    }
}
