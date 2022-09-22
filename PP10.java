/*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.*/

public class PP10
{
    static String name;
    static int roll_no;

    public static void main (String[] args)
    {
        PP10 student = new PP10();

        student.name = "John";
        student.roll_no = 2;
        System.out.println(name +"\n"+ roll_no);


    }
}
