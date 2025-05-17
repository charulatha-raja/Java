public class Factorial
{
    public static void main(String[] args) {

        int num =10;

        long factorial =1; // starts from 1 like 1*2*3*4*5

        //printing ascending order
        for (int i=1; i<=num; i++)
        {
            factorial = factorial*i;
        }
        System.out.println(factorial);


    }
}
