public class EvenOddCount
{
    public static void main(String[] args) {

        int num =193456;
        int Even_Count=0;
        int Odd_Count=0;

        while(num>0)
        {
            int rem = num%10;
            if(rem % 2 == 0)
            {
                Even_Count++;
            }
            else
            {
                Odd_Count++;
            }

            num = num/10;

        }
        System.out.println("The number of even count is :" + Even_Count);
        System.out.println("The number of odd count is :" + Odd_Count);
    }
}
