import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate
{
    public static void main(String[] args) {

       // a[] = {1, 1, 2, 2, 2}


        int arr[] = new int [4];
        arr[0] = 1;
        arr[1]= 1;
        arr[2] = 2;
        arr[3] =2;



//        Set <Integer> nums = new HashSet<>();
//        nums.add(1);
//        nums.add(1);
//        nums.add(2);
//        nums.add(2);
//        nums.add(2);
//
//        for ( Integer n : nums)
//        {
//            System.out.println(" Remove the duplicate elements: " + n);
//        }

        for(int i=0; i< arr.length;i++)
        {
            for(int j=i+1; j< arr.length; j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
