import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SalaryStream
{
    public static void main(String[] args) {
      //  List <Integer> salaries = new ArrayList<>();
//        salaries.add(1000);
//        salaries.add(2000);
//        salaries.add(5000);
//
//        int max =0; int min=0;
//       Stream<Integer> nums = salaries.stream();
//       if(nums)


        int arr[] = new int[4];
        arr[0]= 100;
        arr[1]= 2000;
        arr[2]= 300;
        arr[3]= 5000;
        int max=0; int min=0;


       for(int i=0; i< arr.length; i++)
       {
           if (arr[i]> max)
           {
               max= arr[i];

           }

           if ((arr[i]<min))
           {
               min= arr[i];

           }



       }
        System.out.println("Maximum salries :" + max);





    }
}
