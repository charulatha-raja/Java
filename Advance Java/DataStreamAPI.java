import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DataStreamAPI
{
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,4,7,9,8);
//        Stream<Integer> s1=nums.stream();
//        Stream<Integer> s2 = s1.filter(n->n%2==0);
//        Stream<Integer> s3 = s2.map(n->n*3);
//        s3.forEach(n-> System.out.println(n));

      Stream<Integer> result = nums.stream()
                .filter(n->n%2==0)
                .map(n->n*2);


        result.forEach(n-> System.out.println(n));


    }
}
