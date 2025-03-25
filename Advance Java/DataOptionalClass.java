import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class DataOptionalClass
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kim" , "Kiran" , "Jinjin");

        String n = names.stream()
                .filter(s->s.contains("o"))
                        .findFirst()
                                .orElse("Not Found");


        System.out.println(n);
    }
}
