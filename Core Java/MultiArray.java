// public class MultiArray
// {
//     public static void main (String[] args)
//     {
//         int nums [] [] = new int [3] [4];
        
         
//          for (int i=0; i<3 ; i++)
//          {
//             for (int j=0; j<4; j++)
//             {
//                 nums [i] [j] = (int)(Math.random() * 100);
//                 System.out.print(nums [i][j] +  " " );
//             }
//             System.out.println();
            
//          }
//     }
// }

// JAgged Array

public class MultiArray
{
public static void main(String[] args)
{
   int nums [] [] =  new int [3] [];
   nums [0] = new int [3];
   nums [1] = new int [1];
   nums [2] = new int [2];

   for (int i=0 ; i<nums.length ; i++)
   {
    for (int j=0; j<nums[i].length ; j++)
    {
        nums[i][j] = (int)(Math.random() * 100);
        System.out.print(nums[i][j] + " ");
    }

    System.out.println();
   }




 }

}