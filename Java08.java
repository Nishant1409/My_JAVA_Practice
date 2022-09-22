public class Java08
{
        String name;
        int year_of_joining;
        int salary;
        String address;

        public static void main(String[] args)
        {
            System.out.println("name "+ "\t"+ "year_of_joining" + "\t"+"salary"+ "\t" + "address");
            Java08 stud = new Java08();
            stud.name = "Sam";
            stud.year_of_joining = 2010;
            stud.salary = 90000;
            stud.address = "xyz";

            System.out.println(stud.name +"\t"+ "\t"+ stud.year_of_joining +"\t"+ "\t"+"\t" +stud.salary +"\t"+ stud.address);

            Java08 stud1 = new Java08();
            stud1.name = "John";
            stud1.year_of_joining= 2010;
            stud1.salary = 60000;
            stud1.address = "abc";

            System.out.println(stud1.name +"\t"+ stud1.year_of_joining +"\t"+"\t"+"\t"+ stud1.salary +"\t"+ stud1.address);

            Java08 stud2 = new Java08();
            stud2.name = "Robert";
            stud2.year_of_joining= 1994;
            stud2.salary = 80000;
            stud2.address = "64C- WallsStreat ";

            System.out.println(stud2.name +"\t"+ stud2.year_of_joining +"\t"+"\t"+"\t"+ stud2.salary +"\t"+ stud2.address);

        }
}
