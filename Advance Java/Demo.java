import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo
{
    public static void main(String[] args)
    {
       // String st ="charulatha";
        List<Integer>  value = Arrays.asList(1 , 1,3,7,9);
              Stream<Integer> result= value.stream()
                      .distinct();
                             // .count()
            result.forEach(n-> System.out.println(n));






    }
}
