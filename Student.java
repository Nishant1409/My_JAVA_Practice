/*Assign and print the roll number, phone number and address of two students having names "Sam" and "John"
respectively by creating two objects of class 'Student'.*/
public class Student
{
    String name;
    int roll_no;
    int phone_no;
    String address;

    public static void main(String[] args)
    {
        Student stud = new Student();
        stud.name = "Sam";
        stud.roll_no = 56;
        stud.phone_no = 932165077;
        stud.address = "xyz";

        System.out.println(stud.name +"\n"+ stud.roll_no +"\n"+ stud.phone_no +"\n"+ stud.address);

        Student stud1 = new Student();
        stud1.name = "John";
        stud1.roll_no = 45;
        stud1.phone_no = 932165077;
        stud1.address = "abc";

        System.out.println(stud1.name +"\n"+ stud1.roll_no +"\n"+ stud1.phone_no +"\n"+ stud1.address);

    }
}
