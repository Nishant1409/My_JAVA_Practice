public class Java07
{
    public static void main(String[] args)
    {
        int[] paisa ={ 12,84 ,54,65,52,100,941,42, 74,54,8,4,864,55,25,14,19,45,45,15,45,4,74,5};
        System.out.println(paisa.length);
        paisa [0] = 12;
        paisa [1] = 84;
        paisa [2] = 54;
        paisa [3] = 65;
        paisa [4] = 52;
//printing array using loop
        System.out.println("we are usings loop");
        int i = paisa.length - 1 ;
        while(i >= 0)
        {
            System.out.println(paisa[i]);
            i--;
        }

//        System.out.println(paisa[5]);
    }
}
