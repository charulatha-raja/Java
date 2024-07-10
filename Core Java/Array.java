// public class Array
// {
//     public static void main (String [] args)
//     {
//         int nums [] = {3,2,1,6};
//          nums[1] = 8; // chnage the 1st index value of array here
//         System.out.println(nums[1]);
//     }
// }


/// creation of array

public class Array
{
    public  static void main (String[] args)
    {
        int nums [] = new int[4];
        nums[0] = 2;
        nums[1] = 3;
        nums[2] = 8;
        nums[3] = 7;
             
        for(int i=0;i<4;i++)
        {
             System.out.println (nums[i]);
        }     

        
    }

}