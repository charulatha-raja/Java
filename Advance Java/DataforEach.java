import java.util.Arrays;
import java.util.List;

public class DataforEach
{
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,6,7,0,9);
        for(int n : nums)
        {
            System.out.println(n);
        }
       // nums.forEach(n-> System.out.println(n));
    }
}
