public class SumofArray
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5};

        int sum =0;
        // using for loop
//        for (int i=0; i< nums.length; i++)
//        {
//            sum = sum+nums[i];
//
//        }
//        System.out.println("Sum of Array elements :" + sum);

        // using enhanced for each loop

        for(int value : nums)
        {
            sum= sum+value;
        }
        System.out.println("Sum  :" + sum);

    }
}
