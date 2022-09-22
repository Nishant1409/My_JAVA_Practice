public class Java06
{
    public static void main(String[] args)
    {
        int i = 0;

        while(i<10)
        {
            System.out.println(i);
           if (i==4)
           {
               System.out.println("yes");
               System.out.println("end of te loop ");
               continue;
           }

               i++;
        }

        }
    }
