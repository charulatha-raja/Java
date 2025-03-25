import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataCollectionSorting
{
    public static void main(String[] args)
    {
        //logical sorting
        Comparator <Integer> com = new Comparator<Integer>()
        {
            @Override
            public int compare(Integer i, Integer j)
            {
                if (i%10 > j%10)
                {
                    return 1;
                }
                else {
                    return -1;
                }

            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(51);
        nums.add(20);
        nums.add(92);

        Collections.sort(nums , com);
        for (Integer n : nums)
        {
            System.out.println(n);
        }


    }
}
