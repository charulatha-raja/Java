import java.util.ArrayList;
import java.util.List;

public class DataArrayList
{
    public static void main(String[] args)
    {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(3);
        nums.add(7);
        nums.add(2);
//        //nums.add(1,6); // adding specific elament based on indexx num
//        nums.remove(1); // removing an element based on indx num

        for (int n : nums)
        {
            System.out.println(n);
        }
    }
}
