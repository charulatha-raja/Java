public class EvenorOddnumsarray
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,56,7,8};

        for(int i =0; i< nums.length; i++)
        {
            if ((nums[i]%2==0))
            {
                System.out.println("Even numbers in an array: "+ nums[i]);
            }
        }

        for(int i =0; i< nums.length; i++)
        {
            if ((nums[i]%2!=0))
            {
                System.out.println("Odd numbers in an array: "+ nums[i]);
            }
        }

    }
}
