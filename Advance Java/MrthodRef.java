import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class MrthodRef
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("KIM", "john" , "Paul");

        List <String> uNmaes =names.stream()
                .map(String::toLowerCase)
                .toList();
        uNmaes.forEach(str-> System.out.println(str));



    }
}
