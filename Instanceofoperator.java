public class Instanceofoperator
{
    public static void main (String[] args)
    {
        //create a variable of string type
        String name = "Java Code";

        //check if name is instance of string
        boolean result1 =  name instanceof String;

        System.out.println("Name of an instance of string: " +result1);

        // create an object of Instanceofoperator
        Instanceofoperator obj = new Instanceofoperator();

        //check if  obj is instance of Instanceofoperator
        boolean result2 =  obj instanceof Instanceofoperator;
        System.out.println("Obj of an instance of Instanceofoperator: " +result2);
    }
}
